package javafx;



import Login.SystemLogin;


import javafx.event.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.awt.event.*;

import java.io.IOException;
import java.sql.SQLException;


public class LoginToAppController  {

    @FXML
    public TextField userName;
    @FXML
    public PasswordField password;
    @FXML
    public Button loginButton;
    @FXML
    public Button createNewAccount;
    @FXML
    private ComboBox comboBox;

    public static Stage RegStage;
    static double ii = 0;

    public void tryLogon() {
            try {
             SystemLogin.run(userName.getText(), password.getText());
             } catch (SQLException e) {
                e.printStackTrace();
             }
        };


    public void registermyaccount() throws Exception{
        {
            closeWindows();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterFrom.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            stage.setTitle("hello");
            RegStage = stage;
            stage.show();

        }
    }

    public void closeWindows()  {
        LoginDemoApplication.closeWindow();

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





