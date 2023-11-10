// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

// Define the controller class for the PlanningPoker.fxml GUI
public class PlanningPokerController {
    @FXML
    private AnchorPane poker_main; // The main pane in the PlanningPoker.fxml scene

    // Labels for various elements
    @FXML
    private Label Birds;
    @FXML
    private Label Cats;
    @FXML
    private Label Dogs;
    @FXML
    private Label Employee1;
    @FXML
    private Label Employee2;
    @FXML
    private Label Employee3;
    @FXML
    private Label Employee4;
    @FXML
    private Label Fish;

    // Buttons for various actions
    @FXML
    private Button anomButton;
    @FXML
    private Button backButton;
    @FXML
    private Button dataButton;
    @FXML
    private Button filterButton;
    @FXML
    private Button pushButton;
    @FXML
    private Button startButton;

    // Labels and fields for displaying and entering data
    @FXML
    private Label dataFile;
    @FXML
    private TextField keywordsField;
    @FXML
    private Label myEmployee;
    @FXML
    private Label myStory;
    @FXML
    private Label myWeight;
    @FXML
    private Label nameValue;
    @FXML
    private Label projectName;
    @FXML
    private Label storyValue;
    @FXML
    private Label weight0;
    @FXML
    private Label weight2;
    @FXML
    private Label weight4;
    @FXML
    private Label weightSec4;
    @FXML
    private Label weightValue;

    // Event handler for the start button
    @FXML
    void start(ActionEvent event) {
        // Initialize labels with data
        Employee1.setText("Employee 1");
        Employee2.setText("Employee 2");
        Employee3.setText("Employee 3");
        Employee4.setText("Employee 4");
        Birds.setText("Birds");
        Cats.setText("Cats");
        Fish.setText("Fish");
        Dogs.setText("Dogs");
        weight0.setText("0");
        weight2.setText("2");
        weight4.setText("4");
        weightSec4.setText("4");
    }

    // Event handler for the import data button
    @FXML
    void importData(ActionEvent event) {
        // Set project and data file names
        projectName.setText("Project1");
        dataFile.setText("File1");
    }

    // Event handler for the filter details button
    @FXML
    void filterDetails(ActionEvent event) {
        // Display filtered details
        nameValue.setText("David Smith");
        storyValue.setText("Rabbits");
        weightValue.setText("3");
    }

    // Event handler for the push story button
    @FXML
    void pushStory(ActionEvent event) {
        // Update labels with pushed story details
        myEmployee.setText("Employee 5");
        myStory.setText("Rabbits");
        myWeight.setText("3");
    }

    // Event handler for the anonymize data button
    @FXML
    void anonymizeData(ActionEvent event) {
        // Anonymize data by changing the name value
        nameValue.setText("Employee 5");
    }

    // Event handler for the back button
    @FXML
    void back(ActionEvent event) throws IOException {
        // Switch to the TeamSharing.fxml scene
        new SceneSwitch(poker_main, "TeamSharing.fxml");
    }
}
