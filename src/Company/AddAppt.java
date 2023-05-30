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

public class AddAppt {
    @FXML private TextField Appointment_ID;
    @FXML private TextField title;
    @FXML private TextField location;
    @FXML private TextField type;
    @FXML private TextArea description;
    @FXML private DatePicker startDate;
    @FXML private DatePicker endDate;
    @FXML private ComboBox<String> startTime;
    @FXML private ComboBox<String> endTime;
    @FXML private ComboBox<String> user_ID;
    @FXML private ComboBox<String> customer_ID;
    @FXML private ComboBox<String> contact;
    @FXML private Button saveAddAppt;
    @FXML private Button cancelAddAppt;

    public void saveApptOnClick(ActionEvent actionEvent){

    }

    public void cancelApptOnClick(ActionEvent actionEvent){

    }
}
