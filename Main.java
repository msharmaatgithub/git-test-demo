package TestCalCulator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me!");
        button.setOnAction(event -> System.out.println("Button clicked!"));

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);

        //This is a comment for testing purpose
        primaryStage.setTitle("JavaFX Application For Testing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}