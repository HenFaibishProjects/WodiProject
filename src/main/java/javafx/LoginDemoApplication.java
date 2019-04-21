package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LoginDemoApplication extends Application  {
    public static Stage Pstage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginToApp.fxml"));
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        Pstage = stage;
        stage.show();


    }

    public static void closeWindow() {
        Pstage.getScene().getWindow().hide();
    }

    public static void OpenWindow() {
        Pstage.show();
    }
}


