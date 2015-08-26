package ru.bobby.webCam;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("view/WebCamPreview.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root, 900, 690);

        primaryStage.setTitle("WebCam Capture Sarxos API using JavaFx with FXML ");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
