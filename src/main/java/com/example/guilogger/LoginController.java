// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.io.IOException;

// Define the controller class for the LoginPage.fxml GUI

public class LoginController {
    @FXML
    private TextField password;

    @FXML
    private TextField username;
    @FXML
    private AnchorPane loginScene; // The main pane in the LoginPage.fxml scene
    @FXML
    private Label pwstate;

    // Event handler for the log in button
    @FXML
    void log_in_button(MouseEvent event) {
        // Compare strings using .equals()
        if ("Demo".equals(username.getText()) && "password".equals(password.getText())) {
            try {
                // Switch scene here (assuming SceneSwitch is a valid class with a valid method)
                new SceneSwitch(loginScene, "hello-view.fxml");
            } catch (IOException e) {
                e.printStackTrace(); // Handle IOException here
            }
        } else {
            pwstate.setText("Wrong credential");
        }
    }

}
