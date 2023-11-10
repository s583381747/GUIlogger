package com.example.guilogger;// Import necessary JavaFX classes and other dependencies
import com.example.guilogger.SceneSwitch;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

//               AutherShip=Parth Desai
public class Upload_cloudController {

    @FXML
    private AnchorPane Upload_cloud_Scene; // The main pane in the Upload_cloud.fxml scene

    @FXML
    private Label accessCLoudFileStatus_label; // Label for displaying cloud file access status

    @FXML
    private TextField password_field; // Text field for entering a password

    @FXML
    private Label saveLocalStatus_field; // Label for displaying local saving status

    @FXML
    private Label uploadStatus_label; // Label for displaying upload status

    @FXML
    private TextField username_field; // Text field for entering a username

    // Event handler for the upload data button
    @FXML
    void uploadData_button(MouseEvent event) {
        // Update the uploadStatus_label to indicate server status
        uploadStatus_label.setText("Server Down");
    }

    // Event handler for the access cloud file button
    @FXML
    void accessCloudFile_button(MouseEvent event) {
        // Update the accessCLoudFileStatus_label to indicate server status
        accessCLoudFileStatus_label.setText("Server Down");
    }

    // Event handler for the get username button (empty implementation)
    @FXML

    void getUsername_button(MouseEvent event) {
        username_field.setText("45329074026");
        password_field.setText("HFDiuh94n0g");
    }

    // Event handler for the save local button
    @FXML
    void saveLocal_button(MouseEvent event) throws IOException {
        // Switch to the LocalStorage.fxml scene
        new SceneSwitch(Upload_cloud_Scene, "LocalStorage.fxml");
    }

    // Event handler for the back to main button
    @FXML
    void backToMain_button(MouseEvent event) throws IOException {
        // Switch to the hello-view.fxml scene
        new SceneSwitch(Upload_cloud_Scene, "hello-view.fxml");
    }
}
