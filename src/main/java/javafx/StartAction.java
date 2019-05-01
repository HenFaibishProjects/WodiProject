package javafx;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class StartAction {

    public void  ActionScreenControllerStartOne() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/ActionScreen.fxml/"));
        VBox root = (VBox) fxmlLoader.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root,800,600);
        stage.setScene(scene);
        scene.getStylesheets().add("/MistSilverSkin.css");
        stage.setTitle("Workout Activity Diary");
        stage.setResizable(false);
//        //ActionScreenController.actionStage = stage;
        StartUpTheProgram.closeWindow();
        ActionScreenController.actionStage = stage;
        stage.show();
    }

}
