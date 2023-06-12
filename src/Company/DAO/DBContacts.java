package Company.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Company.Model.Contacts;
import Company.ConnectionDB.DatabaseConn;

import java.sql.*;
import java.time.LocalDateTime;

public class DBContacts {
    /**
     * This method returns all contacts in the database.
     *
     * @return all contacts in the database
     */
    public static ObservableList<Contacts> getAllContacts()
    {

        ObservableList<Contacts> contactList = FXCollections.observableArrayList();

        try
        {
            String sql = "SELECT * from contacts";

            PreparedStatement ps = DatabaseConn.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next())
            {
                int contactId = rs.getInt("Contact_ID");
                String contactName = rs.getString("Contact_Name");
                String contactEmail = rs.getString("Email");
                Contacts c = new Contacts(contactId, contactName, contactEmail);
                contactList.add(c);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        return contactList;
    }
}
