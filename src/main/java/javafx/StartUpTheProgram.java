package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class StartUpTheProgram extends Application  {
    public static Stage Pstage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginToApp.fxml"));
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Workout Activity Diary");
        scene.getStylesheets().add("/MistSilverSkin.css");
        stage.setScene(scene);
        stage.setResizable(false);
        Pstage = stage;
        stage.show();


    }

    public static void closeWindow() {
        Pstage.close();
    }

    public static void OpenWindow() {
        Pstage.show();

    }
}


