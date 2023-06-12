package Company.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Company.Model.Appointments;
import Company.ConnectionDB.DatabaseConn;

import java.sql.*;
import java.time.LocalDateTime;

public class DBAppt {

    /**
     * This method returns all appointments in the database.
     *
     * @return all appointments in the database
     */
    public static ObservableList<Appointments> getAllAppointments()
    {
        ObservableList<Appointments> allAppointmentList = FXCollections.observableArrayList();

        try
        {
            String sqlgaa = "SELECT Appointment_ID, Title, Description, Location, Type, Start, End, customers.Customer_ID, users.User_ID contacts.Contact_ID, " +
                    "FROM appointments, contacts, customers, users WHERE appointments.Customer_ID = customers.Customer_ID AND appointments.User_ID = users.User_ID AND appointments.Contact_ID = contacts.Contact_ID  ORDER BY Appointment_ID";
            PreparedStatement ps = DatabaseConn.getConnection().prepareStatement(sqlgaa);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {

                int appointmentId = rs.getInt("Appointment_ID");
                String title = rs.getString("Title");
                String description = rs.getString("Description");
                String location = rs.getString("Location");
                //String contactName = rs.getString("Contact_Name");
                String type = rs.getString("Type");
                LocalDateTime start = rs.getTimestamp("Start").toLocalDateTime();
                LocalDateTime end = rs.getTimestamp("End").toLocalDateTime();
                int customerId = rs.getInt("Customer_ID");
                int contactId = rs.getInt("Contact_ID");
                int userId = rs.getInt("User_ID");


                Appointments a = new Appointments(appointmentId, title, description, location, type, start, end, customerId, userId, contactId);
                allAppointmentList.add(a);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return allAppointmentList;
    }

    /**
     * This method returns all appointments in the database that are scheduled in the current week.
     *
     * @return all appointments in the database from the current week
     */
    public static ObservableList<Appointments> getWeekAppointments()
    {
        ObservableList<Appointments> weekAppointmentList = FXCollections.observableArrayList();

        try
        {
            String sqlgwa = "SELECT Appointment_ID, Title, Description, Location, contacts.Contact_ID, contacts.Contact_Name, Type, Start, End, customers.Customer_ID, users.User_ID FROM appointments, contacts, customers, users WHERE appointments.Customer_ID = customers.Customer_ID AND appointments.User_ID = users.User_ID AND appointments.Contact_ID = contacts.Contact_ID AND week(Start, 0) = week(curdate(), 0) ORDER BY Appointment_ID";
            PreparedStatement ps = DatabaseConn.getConnection().prepareStatement(sqlgwa);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                int appointmentId = rs.getInt("Appointment_ID");
                String title = rs.getString("Title");
                String description = rs.getString("Description");
                String location = rs.getString("Location");
                int contactId = rs.getInt("Contact_ID");
                //String contactName = rs.getString("Contact_Name");
                String type = rs.getString("Type");
                LocalDateTime start = rs.getTimestamp("Start").toLocalDateTime();
                LocalDateTime end = rs.getTimestamp("End").toLocalDateTime();


                int customerId = rs.getInt("Customer_ID");
                int userId = rs.getInt("User_ID");

                Appointments a = new Appointments(appointmentId, title, description, location, type, start, end, customerId, userId, contactId);


                weekAppointmentList.add(a);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return weekAppointmentList;
    }

    /**
     * This method returns all appointments in the database that are scheduled in the current month.
     *
     * @return all appointments in the database from the current month
     */
    public static ObservableList<Appointments> getMonthAppointments()
    {
        ObservableList<Appointments> monthAppointmentList = FXCollections.observableArrayList();

        try
        {
            String sqlgma = "SELECT Appointment_ID, Title, Description, Location, contacts.Contact_ID, Type, Start, End, customers.Customer_ID, users.User_ID FROM appointments, contacts, customers, users WHERE appointments.Customer_ID = customers.Customer_ID AND appointments.User_ID = users.User_ID AND appointments.Contact_ID = contacts.Contact_ID AND month(Start) = month(curdate()) ORDER BY Appointment_ID";
            PreparedStatement ps = DatabaseConn.getConnection().prepareStatement(sqlgma);
            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                int appointmentid = rs.getInt("Appointment_ID");
                String title = rs.getString("Title");
                String description = rs.getString("Description");
                String location = rs.getString("Location");
                int contactId = rs.getInt("Contact_ID");
                //String contactName = rs.getString("Contact_Name");
                String type = rs.getString("Type");
                LocalDateTime start = rs.getTimestamp("Start").toLocalDateTime();
                LocalDateTime end = rs.getTimestamp("End").toLocalDateTime();
                int customerId = rs.getInt("Customer_ID");
                int userId = rs.getInt("User_ID");

                Appointments a = new Appointments(appointmentid, title, description, location, type, start, end, customerId, userId, contactId);
                monthAppointmentList.add(a);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return monthAppointmentList;
    }

    /**
     *  This method checks for overlapping appointments.
     *
     * @param appointments the appointment to be checked.
     * @return true if overlapping appointments exist, false if overlapping appointments do not exist
     */
    public static Boolean checkForOverlappingAppointment (Appointments appointments)
    {
        try
        {
            String sqlcoa = "SELECT * FROM appointments WHERE ((? <= Start AND ? > Start) OR (? >= Start AND ? < End)) AND Customer_ID = ? AND Appointment_ID <> ?";

            PreparedStatement pscoa = DatabaseConn.getConnection().prepareStatement(sqlcoa);

            pscoa.setTimestamp(1, Timestamp.valueOf(appointments.getStart()));
            pscoa.setTimestamp(2, Timestamp.valueOf(appointments.getEnd()));
            pscoa.setTimestamp(3, Timestamp.valueOf(appointments.getStart()));
            pscoa.setTimestamp(4, Timestamp.valueOf(appointments.getStart()));
            pscoa.setInt(5, appointments.getCustomerID());
            pscoa.setInt(6, appointments.getApptID());



            ResultSet rs = pscoa.executeQuery();


            while (rs.next())
            {

                return true;
            }


        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return false;
    }

    /**
     * This method adds an appointment to the database.
     *
     * @param title The title of the appointment.
     * @param description The description of the appointment.
     * @param location The location of the appointment.
     * @param type The type of appointment.
     * @param start The start time and date of the appointment.
     * @param end The end time and date of the appointment.
     * @param customerId The customerID for the appointment.
     * @param userId The userID for with the appointment.
     * @param contactId The contact id for the appointment.
     */
    public static void addAppointment(String title, String description, String location, String type, LocalDateTime start, LocalDateTime end, int customerId, int userId, int contactId)
    {

        try

        {
            String sqlaa = "INSERT INTO appointments VALUES (NULL, ?, ?, ?, ?, ?, ?, NOW(), 'RZ', NOW(), 'RZ', ?, ?, ?)";

            PreparedStatement psaa = DatabaseConn.getConnection().prepareStatement(sqlaa);

            psaa.setString(1, title);
            psaa.setString(2, description);
            psaa.setString(3, location);
            psaa.setString(4, type);
            psaa.setTimestamp(5, Timestamp.valueOf(start));
            psaa.setTimestamp(6, Timestamp.valueOf(end));
            psaa.setInt(7, customerId);
            psaa.setInt(8, userId);
            psaa.setInt(9, contactId);


            psaa.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * This method updates an appointment in the database.
     *
     * @param title The title of the appointment.
     * @param description The description of the appointment.
     * @param location The location of the appointment.
     * @param type The type of appointment.
     * @param start The start time and date of the appointment.
     * @param end The end time and date of the appointment.
     * @param customerId The customerID for the appointment.
     * @param userId The userID for with the appointment.
     * @param contactId The contact id for the appointment.
     * @param appointmentId The id of the appointment.
     */
    public static void updateAppointment(String title, String description, String location, String type, Timestamp start, Timestamp end, int customerId, int userId, int contactId, int appointmentId)
    {
        try
        {
            String sqlua = "UPDATE appointments SET Title = ?, Description = ?, Location = ?, Type = ?, Start = ?, End = ?, Customer_ID = ?, User_ID = ?, Contact_ID = ? WHERE Appointment_ID = ?";
            PreparedStatement psua = DatabaseConn.getConnection().prepareStatement(sqlua);

            psua.setString(1, title);
            psua.setString(2, description);
            psua.setString(3, location);
            psua.setString(4, type);
            psua.setTimestamp(5, start);
            psua.setTimestamp(6, end);
            psua.setInt(7, customerId);
            psua.setInt(8, userId);
            psua.setInt(9, contactId);
            psua.setInt(10, appointmentId);

            psua.execute();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    /**
     * This method deletes an appointment from the database.
     *
     * @param appointmentId The id of the appointment.
     */
    public static void deleteAppointment(int appointmentId)
    {
        try {

            String sqlda = "DELETE from appointments where Appointment_ID = ?";

            PreparedStatement psda = DatabaseConn.getConnection().prepareStatement(sqlda);

            psda.setInt(1, appointmentId);

            psda.execute();

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    /**
     * This method returns all appointment types in the database.
     *
     * @return all appointment types in the database
     */
    public static ObservableList<String> getAllTypes()
    {
        ObservableList<String> tList = FXCollections.observableArrayList();
        try {

            String sqlgat = "SELECT DISTINCT type from appointments";

            PreparedStatement psda = DatabaseConn.getConnection().prepareStatement(sqlgat);


            ResultSet rs = psda.executeQuery();

            while (rs.next())
            {
                tList.add(rs.getString(1));
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return tList;
    }


    /**
     *
     * This method returns the number of appointments that are of a specified type and are in a specified month.
     *
     * @param month the month specified
     * @param type the type specified
     * @return the total number of appointments
     */
    public static int getMonthAndTypeCount(String month, String type) {
        int total = 0;

        try {

            String sqlR3 = "SELECT count(*) from appointments WHERE type = ? AND monthname(start) = ?";


            PreparedStatement psda = DatabaseConn.getConnection().prepareStatement(sqlR3);


            psda.setString(1, type);
            psda.setString(2, month);

            ResultSet rs = psda.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return total;
    }
}
