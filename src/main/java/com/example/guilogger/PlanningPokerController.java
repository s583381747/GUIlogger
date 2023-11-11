// Import necessary JavaFX classes and other dependencies
package com.example.guilogger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.nio.file.attribute.UserPrincipal;
import java.util.ResourceBundle;

// Define the controller class for the PlanningPoker.fxml GUI
public class PlanningPokerController implements Initializable {
    @FXML
    private AnchorPane poker_main; // The main pane in the PlanningPoker.fxml scene

    @FXML
    private TableView<StoryData> history_data;

    @FXML
    private TableColumn<StoryData, String> userstory_tab;

    @FXML
    private TableColumn<StoryData, Number> weight_tab;

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
        // initialize labels with data
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Configure the columns to use the properties of the StoryData class
        userstory_tab.setCellValueFactory(new PropertyValueFactory<>("userStory"));
        weight_tab.setCellValueFactory(new PropertyValueFactory<>("weight"));

        // Create a sample list of data
        ObservableList<StoryData> data = FXCollections.observableArrayList(
                new StoryData("Story 1", 5), // Example data
                new StoryData("Story 2", 3)  // Example data
        );

        // Set the table's items to the sample data
        history_data.setItems(data);
    }

}
