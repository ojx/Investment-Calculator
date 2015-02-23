/**
 * An application to calculate the return on an investment at a
 * given interest rate for a set number of years.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {
    private BorderPane root;
    private Stage stage;
    private Scene scene;

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        root = new BorderPane();
        scene = new Scene(root, 400, 550); //width and height of application
        stage.setScene(scene);
        stage.setTitle("Investment Calculator");  //text for the title bar of the window


        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}