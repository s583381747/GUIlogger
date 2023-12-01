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
import java.util.concurrent.atomic.AtomicLong;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

// Define the controller class for the JavaFX GUI
public class HelloController implements Initializable {
    private Timer timer; // Timer for tracking time
    private AtomicLong elapsedTime; // Time tracking variable

    @FXML
    private Label timer_field; // Label for displaying the timer
    public static boolean flag1 = false;

    public static int counter1 = 0;
    public static String categ, deliv, life_step,time1,weight;

    private AtomicLong startTime; // Time tracking variable
    @FXML
    private AnchorPane mainScene; // The main scene in the GUI

    @FXML
    private ComboBox<String> category; // ComboBox for selecting a category

    @FXML
    private ComboBox<String> deliverable; // ComboBox for selecting a deliverable

    @FXML
    private ComboBox<String> life_cycle; // ComboBox for selecting a life cycle

    @FXML
    private ComboBox<String> project; // ComboBox for selecting a project

    @FXML
    private ComboBox<String> effort; // ComboBox for selecting a project

    @FXML
    private Label timerstatus;


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
        timerstatus.setText("Timer Started");
        if (timer != null) {
            timer.cancel(); // Stop any existing timer
        }
        timer = new Timer();
        elapsedTime = new AtomicLong(0); // Reset elapsed time

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    elapsedTime.getAndAdd(1000); // Increase time by 1 second
                    long elapsedSeconds = elapsedTime.get() / 1000;
                    long hours = elapsedSeconds / 3600;
                    long minutes = (elapsedSeconds % 3600) / 60;
                    long seconds = elapsedSeconds % 60;
                    timer_field.setText(String.format("%02d:%02d:%02d", hours, minutes, seconds));
                });
            }
        };

        timer.scheduleAtFixedRate(timerTask, 0, 1000); // Schedule the task to run every second
    }

    // Event handler for the stop activity button
    @FXML
    void stop_activity_button(MouseEvent event) {
        timerstatus.setText("Timer Stopped");
        if (timer != null) {
            timer.cancel(); // Stop the timer
            timer = null; // Dereference the timer
        }
        flag1 = true;
        categ = category.getValue();
        deliv = deliverable.getValue();
        life_step = life_cycle.getValue();
        time1 = getElapsedTime();
        weight = getSelectedEffort();
        counter1++;
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
        effort.getItems().addAll("1","2","3","4","5");
        life_cycle.getItems().addAll("Planning","Verifying","Outlining","Drafting","Finalizing","Team Meeting");
        category.getItems().addAll("Plans","Deliverables","Interruptions","Defects");
        category.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            updateDeliverablesBasedOnCategory(newVal);
        });

    }

    public String getSelectedEffort() {
        return effort.getSelectionModel().getSelectedItem();
    }

    // Getter for the elapsed time in the timer
    public String getElapsedTime() {
        if (elapsedTime == null) {
            return "00h, 00min, 00 sec";
        }
        long elapsedSeconds = elapsedTime.get() / 1000;
        long hours = elapsedSeconds / 3600;
        long minutes = (elapsedSeconds % 3600) / 60;
        long seconds = elapsedSeconds % 60;
        return String.format("%02dm %02ds", minutes, seconds);
    }
    private void updateDeliverablesBasedOnCategory(String category) {
        // Clear existing items
        deliverable.getItems().clear();

        // Add items based on selected category
        if (category != null) {
            switch (category) {
                case "Plans":
                    deliverable.getItems().addAll("Plan A", "Plan B", "Plan C");
                    break;
                case "Interruptions":
                    deliverable.getItems().addAll("Tea Break", "Meeting", "Lunch Break");
                    break;
                case "Defects":
                    deliverable.getItems().addAll("UI Bug", "Backend Issue", "Database Error");
                    break;
                case "Deliverables":
                    deliverable.getItems().addAll("Report", "Code", "Design");
                    break;
            }
        }
    }
    public void initialize_deliverables()
    {
        switch (categ)
        {
            case "Plans": deliverable.getItems().addAll("Plan"); break;
            case "Interruptions": deliverable.getItems().addAll("Tea Time"); break;
            case "Defects": deliverable.getItems().addAll("Broken Code"); break;
        }

    }


}
