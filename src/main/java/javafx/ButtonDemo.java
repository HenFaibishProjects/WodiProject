package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ButtonDemo extends Application {

    private VBox layout; // This is the root node.

    @Override
    public void start(Stage stage) {

        HBox layout = new HBox();

        //Set CSS ID
        layout.setId("app");

        //Center in VBox.
        layout.setAlignment(Pos.CENTER);

        //Set Spacing b/n each button.
        layout.setSpacing(10);

        Button removeButton = new Button();
        Image image = new Image("/s.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(60);
        imageView.setPreserveRatio(true);
        removeButton.setGraphic(imageView);
        removeButton.setTooltip(new Tooltip("unsplit output"));
        removeButton.setId("unsplit-output-button");

        Button b2 = new Button("Example 2");


        Button b3 = new Button("Example 3");
       // b3.setId("b3");

        Button b4 = new Button("Example 4");
        //b4.setId("b4");

        Button b5 = new Button("Example 5");
        //b5.setId("b5");

        MenuItem menuItem1 = new MenuItem("Option 1");
        MenuItem menuItem2 = new MenuItem("Option 2");
        MenuItem menuItem3 = new MenuItem("Option 3");

        MenuButton menuButton = new MenuButton("Options", null, menuItem1, menuItem2, menuItem3);
        menuButton.setStyle("-fx-base: coral;");
        menuButton.setContentDisplay(ContentDisplay.TOP);
        menuButton.setGraphic(imageView);
        layout.getChildren().addAll(removeButton, b2, b3, b4, b5,menuButton);

        //Create Scene, add css stylesheet.
        Scene scene = new Scene(layout, 800, 600);

        scene.getStylesheets().add(getClass().getResource("/MistSilverSkin.css").toExternalForm());


        //Set stage properties.
        stage.setScene(scene);
        stage.setTitle("CSS Buttons");
        stage.show();
    }

    /**
     * Application Entry Point.
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }
}
