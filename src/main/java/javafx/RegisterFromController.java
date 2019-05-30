package javafx;

import com.alee.utils.TextUtils;
import dao.UserDaoImpl;
import hr.SendMail;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.stage.Stage;
import org.apache.commons.validator.routines.EmailValidator;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.io.IOException;

public class RegisterFromController  {

    @FXML
    public TextField theusername;
    @FXML
    public TextField thefirstname;
    @FXML
    public TextField thelastname;
    @FXML
    public Button createNewAccount;
    @FXML
    public PasswordField thepassword;
    @FXML
    public PasswordField theConfirmpassword;
    @FXML
    public TextField thestreet;
    @FXML
    public TextField thecity;
    @FXML
    public Button theregister;
    @FXML
    public ComboBox maleFemale;
    @FXML
    public Button backToLogin;
    @FXML
    public Button exitprogram;




    public  void registermyaccount() throws AddressException {
        verifyNonEmptyValues(maleFemale,
                theusername.getText(),
                thepassword.getText(),
                theConfirmpassword.getText(),
                thefirstname.getText(),
                thelastname.getText(),
                thestreet.getText(),
                thecity.getText());

    }


    public  void backToLoginAction() throws IOException {
        LoginToAppController.closeRegWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginToApp.fxml"));
        Scene scene = new Scene(root, 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Workout Activity Diary");
        scene.getStylesheets().add("/MistSilverSkin.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }


    private void verifyNonEmptyValues(ComboBox maleFemaleObject,String theusername, String thepassword, String theConfirmpassword, String thefirstname, String thelastname, String thestreet , String theCity) throws AddressException {

        InternetAddress emailAddr = new InternetAddress(theusername);


        if (maleFemaleObject.getSelectionModel().getSelectedItem()==null) {
            alertEmptyFilled();
        }
            else {
            if ((TextUtils.isEmpty(theusername)) || (TextUtils.isEmpty(thepassword)) || (TextUtils.isEmpty(theConfirmpassword)) ||
                    (TextUtils.isEmpty(thefirstname)) || (TextUtils.isEmpty(thelastname)) || (TextUtils.isEmpty(thestreet)) || (TextUtils.isEmpty(theCity))) {

                alertEmptyFilled();
            } else {
                if (!(thepassword.equals(theConfirmpassword))) {
                    alertPasswordDontMatch();
                } else {
                    if(!(EmailValidator.getInstance().isValid(theusername))){
                        alertValidEmailAddress();
                    }
                    else {
                    setRegistermyaccount();
                       // SendMail.sendTheEmail("WodiSoftware@gmail.com",theusername,"Welcome To Wodi","We are welcome you with Wodi account");
                }
            }
            }
        }
    }

    private void alertEmptyFilled() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("fields is required");
        alert.setHeaderText("All fields are mandatory");
        alert.showAndWait();
    }

    private void alertPasswordDontMatch() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("The entered passwords don't match!");
        alert.showAndWait();
    }

    private void alertValidEmailAddress() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Please enter a valid email address!");
        alert.showAndWait();
    }

    public  void setRegistermyaccount(){
        LoginToAppController.disableRegWindow();
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.addUser(theusername.getText(),thepassword.getText(),thefirstname.getText(),thelastname.getText(),maleFemale.getSelectionModel().getSelectedItem().toString(),thestreet.getText()," ",thecity.getText(),0000,"","");
        LoginToAppController.closeRegWindow();
        LoginToAppController.waitForResitretionToBeComplited();
        StartUpTheProgram.OpenWindow();
    }


    public void exitTheProgram(ActionEvent actionEvent) {
        Platform.exit();
    }
}