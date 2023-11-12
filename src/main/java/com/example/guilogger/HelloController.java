// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

// Define the controller class for the JavaFX GUI
public class HelloController implements Initializable {


    private Timer timer; // Timer for tracking time
    private AtomicLong startTime; // Time tracking variable
    @FXML
    private AnchorPane mainScene; // The main scene in the GUI

    @FXML
    private ComboBox<?> category; // ComboBox for selecting a category

    @FXML
    private ComboBox<?> deliverable; // ComboBox for selecting a deliverable

    @FXML
    private ComboBox<?> life_cycle; // ComboBox for selecting a life cycle

    @FXML
    private ComboBox<String> project; // ComboBox for selecting a project

    @FXML
    private Label timer_field; // Label for displaying the timer

    // Event handler for the start activity button

    @FXML
    void defectog_button(MouseEvent event) throws IOException {
        new SceneSwitch(mainScene,"Defect_Logs.fxml");
    }

    @FXML
    void effortlog_button(MouseEvent event) throws IOException {
        new SceneSwitch(mainScene,"Effort_Logs.fxml");
    }
    @FXML
    void start_activity_button(MouseEvent event) {
        // Add code for starting an activity here
    }

    // Event handler for the stop activity button
    @FXML
    void stop_activity_button(MouseEvent event) {
        // Add code for stopping an activity here
    }

    // Event handler for the team sharing button
    @FXML
    void team_sharing_button(MouseEvent event) throws IOException {
        // Switch to the TeamSharing.fxml scene
        new SceneSwitch(mainScene,"TeamSharing.fxml");
    }

    // Event handler for the upload to cloud button
    @FXML
    void upload_to_cloud_button(MouseEvent event) throws IOException {
        // Switch to the CloudStorage.fxml scene
        new SceneSwitch(mainScene,"CloudStorage.fxml");
    }

    // Event handler for the quit button
    @FXML
    void quit_button(MouseEvent event) {
        // Exit the application
        Platform.exit();
    }
    public ObservableList<DefectlogData> projecct1_data;

    // Event handler for the profile button
    @FXML
    void profile_button(MouseEvent event) throws IOException {
        // Switch to the MyProfile.fxml scene
        new SceneSwitch(mainScene,"MyProfile.fxml");
    }

    @FXML
    void defectlogconsole(MouseEvent event) throws IOException {
        new SceneSwitch(mainScene,"Defect_Console.fxml");
    }

    @FXML
    void effortlogeditor(MouseEvent event) throws IOException {
        new SceneSwitch(mainScene,"Effort_Log_Editor.fxml");
    }
    @FXML
    void defination(MouseEvent event) throws IOException {
        new SceneSwitch(mainScene,"Def.fxml");
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize the project ComboBox with project options
        project.getItems().addAll("PixelCraft","WebFlow","SwiftNote");
        // Initialize other ComboBoxes (life_cycle, deliverable, category) as needed
        life_cycle.getItems().addAll();
        deliverable.getItems().addAll();
        category.getItems().addAll();

    }
}
