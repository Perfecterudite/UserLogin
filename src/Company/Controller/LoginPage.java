package Company.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

public abstract class LoginPage implements Initializable{

    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private Label locationName;
    @FXML private Label locationLabel;
    @FXML private Button loginBtn;

    public void Initialize(URL Location, ResourceBundle resourceBundle){

    }
    //Login
    public void loginClick(ActionEvent actionEvent){

        String inputUsername = username.getText();
        String inputPassword = password.getText();

    }
}
