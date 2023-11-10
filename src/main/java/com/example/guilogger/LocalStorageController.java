// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

// Define the controller class for the LocalStorage.fxml GUI
public class LocalStorageController {

    @FXML
    private AnchorPane localStorage; // The main pane in the LocalStorage.fxml scene

    @FXML
    private Label shareStatus; // Label for displaying the sharing status

    // Event handler for the back button
    @FXML
    void back_button(MouseEvent event) throws IOException {
        // Switch to the CloudStorage.fxml scene
        new SceneSwitch(localStorage, "CloudStorage.fxml");
    }

    // Event handler for the share to team button
    @FXML
    void shareToTeam_button(MouseEvent event) {
        // Update the shareStatus label with a success message
        shareStatus.setText("Data shared with team successfully");
    }
}
