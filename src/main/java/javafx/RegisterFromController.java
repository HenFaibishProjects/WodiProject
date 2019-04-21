package javafx;

import com.alee.utils.TextUtils;
import dao.UserDaoImpl;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

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



    public  void registermyaccount(){
        verifyNonEmptyValues(maleFemale,
                theusername.getText(),
                thepassword.getText(),
                theConfirmpassword.getText(),
                thefirstname.getText(),
                thelastname.getText(),
                thestreet.getText(),
                thecity.getText());

    }


    public  void backToLoginAction(){
        LoginToAppController.closeRegWindow();
        LoginDemoApplication.OpenWindow();
    }

    private void verifyNonEmptyValues(ComboBox maleFemaleObject,String theusername, String thepassword, String theConfirmpassword, String thefirstname, String thelastname, String thestreet , String theCity) {

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
                    setRegistermyaccount();
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

    public  void setRegistermyaccount(){
        LoginToAppController.disableRegWindow();
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        userDaoImpl.addUser(theusername.getText(),thepassword.getText(),thefirstname.getText(),thelastname.getText(),maleFemale.getSelectionModel().getSelectedItem().toString(),thestreet.getText()," ",thecity.getText(),0000,"","");
        LoginToAppController.closeRegWindow();
        LoginToAppController.waitForResitretionToBeComplited();
        LoginDemoApplication.OpenWindow();
    }



}