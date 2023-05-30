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


public class addCustomer {
    @FXML private TextField customerID;
    @FXML private TextField customerName;
    @FXML private TextField address;
    @FXML private TextField postalCode;
    @FXML private TextField phoneNumber;
    @FXML private ComboBox<String> country;
    @FXML private ComboBox<String> stateProvince;
    @FXML private Button saveCustomer;
    @FXML private Button cancelCustomer;

    public void saveOnClick(ActionEvent actionEvent){
        //This is testing something

    }

    public void cancelOnClick(ActionEvent actionEvent){

    }
}
