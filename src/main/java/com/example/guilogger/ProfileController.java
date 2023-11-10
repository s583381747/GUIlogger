// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

// Define the controller class for the MyProfile.fxml GUI
public class ProfileController {

    @FXML
    private Label ID; // Label for displaying the unique ID

    @FXML
    private Label IDdescription; // Label for describing the unique ID

    @FXML
    private AnchorPane MyProfile; // The main pane in the MyProfile.fxml scene

    // Event handler for the back button
    @FXML
    void back_button(MouseEvent event) throws IOException {
        // Switch to the hello-view.fxml scene
        new SceneSwitch(MyProfile, "hello-view.fxml");
    }

    // Event handler for the unique ID button
    @FXML
    void uniqueID_button(MouseEvent event) {
        // Display the unique ID and its description
        ID.setText("Unique ID = cebf9582");
        IDdescription.setText("This unique ID ensures that your identity is protected and stays anonymous");
    }
}
