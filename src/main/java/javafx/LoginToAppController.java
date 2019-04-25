package javafx;



import Login.SystemLogin;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.SQLException;


public class LoginToAppController   {

    @FXML
    public TextField userName;
    @FXML
    public PasswordField password;
    @FXML
    public Button loginButton;
    @FXML
    public Button createNewAccount;


    public static Stage RegStage;
    static double ii = 0;

    public void tryLogon() throws Exception {
            try {
             SystemLogin.run(userName.getText(), password.getText());
             } catch (SQLException e) {
                e.printStackTrace();
             }
        };


    public void registermyaccount() throws Exception{
        {
            closeWindows();
            VBox mainRegisterWindow = new VBox();
            mainRegisterWindow.setAlignment(Pos.TOP_CENTER);
            Text t = new Text();
            t.setFill(Color.ORANGERED);
            t.setText("Register Form - Wido Software");
            t.setStyle("-fx-font: 24 arial;");
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterFrom.fxml"));
            VBox root1 = (VBox) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            mainRegisterWindow.getChildren().addAll(t,root1);
            Scene scene = new Scene(mainRegisterWindow);
            stage.setScene(scene);
            scene.getStylesheets().add("/MistSilverSkin.css");
            stage.setTitle("Workout Activity Diary - Registration Form");
            stage.initStyle(StageStyle.DECORATED);
            RegStage = stage;
            stage.show();

        }
    }

    public void closeWindows()  {
        StartUpTheProgram.closeWindow();

        }

    public static void closeRegWindow() {
        RegStage.getScene().getWindow().hide();
    }

    public static void disableRegWindow() {
        closeRegWindow();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Registration process will start soon please be patient...");
        alert.showAndWait();

    }
        public static void waitForResitretionToBeComplited() {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("your account has been created successfully you can now log in now.");
            alert.showAndWait();

        }


}





