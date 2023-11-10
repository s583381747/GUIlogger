// Import necessary JavaFX classes for the application
package com.example.guilogger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// Define the main class for the JavaFX application, which extends Application
public class HelloApplication extends Application {

    // The start method is called when the application is launched
    @Override
    public void start(Stage stage) throws IOException {
        // Create an FXMLLoader to load the GUI layout from an FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Create a Scene and load the GUI layout into it
        Scene scene = new Scene(fxmlLoader.load());

        // Set the Scene as the content for the Stage (the main window)
        stage.setScene(scene);

        // Show the Stage to make the GUI visible
        stage.show();
    }

    // The main method is the entry point of the application
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch();
    }
}
