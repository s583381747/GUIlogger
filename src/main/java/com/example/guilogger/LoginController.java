// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

// Define the controller class for the LoginPage.fxml GUI
public class LoginController {

    @FXML
    private AnchorPane loginScene; // The main pane in the LoginPage.fxml scene

    // Event handler for the log in button
    @FXML
    void log_in_button(MouseEvent event) throws IOException {
        // Switch to the hello-view.fxml scene using the SceneSwitch utility
        new SceneSwitch(loginScene, "hello-view.fxml");
    }
}
