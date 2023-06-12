package Company.Controller;

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

public class UpdateCustomer {

    @FXML private TextField updateCustomerID;
    @FXML private TextField updateName;
    @FXML private TextField updateAddress;
    @FXML private TextField updatePostal;
    @FXML private TextField updateNumber;
    @FXML private ComboBox<String> updateCountry;
    @FXML private ComboBox<String> updateState;
    @FXML private Button updateSave;
    @FXML private Button updateCancel;

    public void updateSaveOnClick(ActionEvent actionEvent){

    }

    public void updateCancelOnClick(ActionEvent actionEvent){

    }
}
