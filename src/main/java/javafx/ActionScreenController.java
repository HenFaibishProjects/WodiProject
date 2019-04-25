package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ActionScreenController  {

    public static Stage ActionStage;



    public ActionScreenController() throws Exception {
        VBox mainRegisterWindow = new VBox();
        mainRegisterWindow.setAlignment(Pos.TOP_CENTER);
        Text t = new Text();
        t.setFill(Color.ORANGERED);
        t.setText("W-A-D Action");
        t.setStyle("-fx-font: 34 arial;");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/ActionScreen.fxml"));
        VBox root1 = (VBox) fxmlLoader.load();
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        mainRegisterWindow.getChildren().addAll(t,root1);
        Scene scene = new Scene(mainRegisterWindow, 800, 600);
        stage.setScene(scene);
        scene.getStylesheets().add("/MistSilverSkin.css");
        stage.setTitle("Workout Activity Diary");
        stage.initStyle(StageStyle.DECORATED);
        ActionStage=stage;
        StartUpTheProgram.closeWindow();
        stage.show();

    }
}
