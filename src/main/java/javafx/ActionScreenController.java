package javafx;

import Login.SystemLogin;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ActionScreenController {
    @FXML
    public Button PersonalSettings;
    @FXML
    public Button ViewonCalendar;
    @FXML
    public Button AboutSoftware;
    @FXML
    public Button WorkoutStatictics;
    @FXML
    public Button Recomendetions;
    @FXML
    public Button Exit;
    @FXML
    public Button Logout;
    @FXML
    public MenuButton AddGymWorkout;
    @FXML
    public MenuItem AbsWorkout;
    @FXML
    public MenuItem DorsiWorkout;
    @FXML
    public MenuButton Incdicators;
    @FXML
    public MenuItem AddNewIndicator;
    @FXML
    public MenuItem ViewOldIndicators;
    @FXML
    public MenuButton AddMAWorkout;
    @FXML
    public MenuItem bjj;
    @FXML
    public MenuItem bjjNoGi;

    public static Stage actionStage;
    public static Stage indicatorStage;

    public void exitTheProgram(ActionEvent actionEvent) {
        Platform.exit();
    }


    public void logOut(ActionEvent actionEvent) throws IOException {
        SystemLogin.sessionId = 0;
        actionStage.close();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginToApp.fxml"));
        Scene scene = new Scene(root, 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Workout Activity Diary");
        scene.getStylesheets().add("/MistSilverSkin.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    public void AddIndicesPage(ActionEvent actionEvent) throws IOException {
        actionStage.close();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/AddIndices.fxml"));
        Scene scene = new Scene(root, 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Add Indices");
        scene.getStylesheets().add("/MistSilverSkin.css");
        stage.setScene(scene);
        stage.setResizable(false);
        indicatorStage = stage;
        stage.show();

    }
}


