package com.example.user;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    public HelloApplication() {
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Log the path for debugging purposes
        System.out.println("FXML Path: " + getClass().getResource("/com/example/user/hello-view.fxml"));

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/user/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);  // Match the preferred size of your layout

        stage.setTitle("User Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();  // Start the JavaFX application
    }
}