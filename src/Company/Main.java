package Company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("View/main.fxml"));
        primaryStage.setTitle("Fortnight Scheduler");
        primaryStage.setScene(new Scene(root, 800, 575));
        primaryStage.show();

        //fxmlLoader.setRoot(new AnchorPane());

    }


    public static void main(String[] args) {
        //DatabaseConn.startConnection();
        launch(args);
        //DatabaseConn.endConnection();
    }

}
