package com.example.guilogger;// Import necessary JavaFX classes and other dependencies
import com.example.guilogger.SceneSwitch;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

// Define the controller class for the TeamSharing.fxml GUI
public class TeamSharingController {

    @FXML
    private AnchorPane TeamSharing; // The main pane in the TeamSharing.fxml scene

    @FXML
    private Label sentMessageStatus_button; // Label for displaying message sending status

    // Event handler for the back button
    @FXML
    void back_button(MouseEvent event) throws IOException {
        // Switch to the hello-view.fxml scene
        new SceneSwitch(TeamSharing, "hello-view.fxml");
    }

    // Event handler for the planning poker button
    @FXML
    void planningPoker_button(MouseEvent event) throws IOException {
        // Switch to the PlanningPoker.fxml scene
        new SceneSwitch(TeamSharing, "PlanningPoker.fxml");
    }

    // Event handler for the send status button
    @FXML
    void sendStatus_button(MouseEvent event) {
        // Update the sentMessageStatus_button label to indicate that the message is sent
        sentMessageStatus_button.setText("Message Sent!");
    }
}
