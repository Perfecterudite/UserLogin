package Company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.PasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.util.Optional;
import javafx.scene.Scene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class modAppt {

    @FXML private TextField updateAppointment_ID;
    @FXML private TextField updateTitle;
    @FXML private TextField updateLocation;
    @FXML private TextField updateType;
    @FXML private TextArea updateDescription;
    @FXML private DatePicker updateStartDate;
    @FXML private DatePicker updateEndDate;
    @FXML private ComboBox<String> updateStartTime;
    @FXML private ComboBox<String> updateEndTime;
    @FXML private ComboBox<String> updateUser_ID;
    @FXML private ComboBox<String> updateCustomer_ID;
    @FXML private ComboBox<String> updateContact;
    @FXML private Button updateSaveAddAppt;
    @FXML private Button updateCancelAppt;


    public void updateSaveApptOnClick(ActionEvent actionEvent){

    }

    public void updateCancelApptOnClick(ActionEvent actionEvent){

    }
}
