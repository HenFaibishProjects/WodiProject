package Login;

import Connections.JdbcDbData;
import javafx.StartAction;
import javafx.scene.control.Alert;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SystemLogin extends JdbcDbData {

    public static int sessionId;

    public static int run(String emailaddress, String password) throws Exception {
        try {
            JdbcDbDataa();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PreparedStatement stUser = conn.prepareStatement("select emailaddress from UserPassword where emailaddress =?");
        stUser.setString(1, emailaddress);
        ResultSet rsUser = stUser.executeQuery();
        if (rsUser.next()) {
            rsUser.getString("emailaddress");
            PreparedStatement stPassword = conn.prepareStatement("select password from UserPassword where emailaddress=?");
            stPassword.setString(1, emailaddress);
            ResultSet rsPassword = stPassword.executeQuery();
            if (rsPassword.next())
                if (password.equals(rsPassword.getString("password"))) {
                    System.out.println("welcome back " + emailaddress);
                    PreparedStatement stId = conn.prepareStatement("select id from UserPassword where emailaddress =?");
                    stId.setString(1, emailaddress);
                    ResultSet rsId = stId.executeQuery();
                     while(rsId.next()) {
                         sessionId = rsId.getInt("id");
                         StartAction startAction = new StartAction();
                         startAction.ActionScreenControllerStartOne();
                        return rsId.getInt("id");
                    }
                }


                 else {
                    System.out.println("incorrect username or password. please try again");
                    return 0;
                }
                if (rsUser.wasNull()) {
                    System.out.println("incorrect username or password. please try again");

                }
            }
        System.out.println("incorrect username or password. please try again");

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login");
        alert.setHeaderText("incorrect username or password. please try again");
        alert.showAndWait();
            return 0;
        }
    }






