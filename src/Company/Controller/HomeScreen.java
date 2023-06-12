package Company.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.RadioButton;
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

public class HomeScreen {

    @FXML private TableColumn <?, ?> apptIDCol;
    @FXML private TableColumn <?, ?> titleCol;
    @FXML private TableColumn <?, ?> typeCol;
    @FXML private TableColumn <?, ?> desCol;
    @FXML private TableColumn <?, ?> locCol;
    @FXML private TableColumn <?, ?> startCol;
    @FXML private TableColumn <?, ?> endCol;
    @FXML private TableColumn <?, ?> contactCol;
    @FXML private TableColumn <?, ?> customer_IDCol;
    @FXML private TableColumn <?, ?> user_IDCol;
    @FXML private TableColumn <?, ?> postalCol;
    @FXML private TableColumn <?, ?> addressCol;
    @FXML private TableColumn <?, ?> NameCol;
    @FXML private TableColumn <?, ?> stateCol;
    @FXML private TableColumn <?, ?> numberCol;
    @FXML private TableColumn <?, ?> customerIDCol;
    @FXML private TableView<Company.Model.Report> homeApptTable;
    @FXML private TableView<Company.Model.Report> homeCustomerTable;
    @FXML private RadioButton radioCurrentWeek;
    @FXML private RadioButton radioCurrentMonth;
    @FXML private RadioButton radioAll;
    @FXML private Button addCustomer;
    @FXML private Button updateCustomer;
    @FXML private Button deleteCustomer;
    @FXML private Button addAppt;
    @FXML private Button updateAppt;
    @FXML private Button deleteAppt;
    @FXML private Button reports;
    @FXML private Button logout;


    public void reportOnClick(ActionEvent actionEvent){

    }

    public void logoutOnClick(ActionEvent actionEvent){

    }

    public void addApptOnClick(ActionEvent actionEvent){

    }

    public void updateApptOnClick(ActionEvent actionEvent){
    }
    public void deleteApptOnClick(ActionEvent actionEvent){

    }

    public void addCustomerOnClick(ActionEvent actionEvent){

    }

    public void updateCustomerOnClick(ActionEvent actionEvent){
    }
    public void deleteCustomerOnClick(ActionEvent actionEvent){

    }

}
