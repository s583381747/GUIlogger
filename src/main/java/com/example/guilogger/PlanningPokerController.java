package com.example.guilogger;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class PlanningPokerController implements Initializable {
    @FXML
    private Button anomButton;

    @FXML
    private Button backButton;

    @FXML
    private Button dataButton;

    @FXML
    private ComboBox<String> effortBox;

    @FXML
    private TextField keywordsField;

    @FXML
    private Label nameValue;

    @FXML
    private Button pushButton;

    @FXML
    private Button startButton;

    @FXML
    private Label storyValue;

    @FXML
    private Button submitButton;

    @FXML
    private ComboBox<String> userBox;

    @FXML
    private Label weightValue;

    @FXML
    private TableView<DefData.TeamEntry> teamtable;

    @FXML
    private TableColumn<DefData.TeamEntry, String> teamtable_name;

    @FXML
    private TableColumn<DefData.TeamEntry, String> teamtable_userstory;

    @FXML
    private TableColumn<DefData.TeamEntry, String> teamtable_effort;

    @FXML
    private TableView<DefData.HistoryEntry> historytable;

    @FXML
    private TableColumn<DefData.HistoryEntry, String> historytable_userstory;

    @FXML
    private TableColumn<DefData.HistoryEntry, String> historytable_weight;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userBox.setItems(FXCollections.observableArrayList("Cars1", "Cars2", "Cars3"));
        effortBox.setItems(FXCollections.observableArrayList("0", "1", "2", "3", "4"));

        // Initialize teamtable columns
        teamtable_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        teamtable_userstory.setCellValueFactory(new PropertyValueFactory<>("userStory"));
        teamtable_effort.setCellValueFactory(new PropertyValueFactory<>("effort"));

        // Initialize historytable columns
        historytable_userstory.setCellValueFactory(new PropertyValueFactory<>("userStory"));
        historytable_weight.setCellValueFactory(new PropertyValueFactory<>("weight"));
    }

    @FXML
    void startround(ActionEvent event) {
        // Populate Team Table with dummy data
        teamtable.getItems().clear();
        teamtable.getItems().addAll(
                new DefData.TeamEntry("Employee1", "Story A", "2"),
                new DefData.TeamEntry("Employee2", "Story B", "3"),
                new DefData.TeamEntry("Employee3", "Story C", "1")
        );
    }

    @FXML
    void importData(ActionEvent event) {
        // Populate History Table with dummy data
        historytable.getItems().clear();
        historytable.getItems().addAll(
                new DefData.HistoryEntry("Story X", "5"),
                new DefData.HistoryEntry("Story Y", "8"),
                new DefData.HistoryEntry("Story Z", "3")
        );
    }
    
    @FXML
    void submitEntry(ActionEvent event) {
    	nameValue.setText("David Smith");
    	storyValue.setText("Cars 1");
    	weightValue.setText("2");
    }
    
    @FXML
    void anonymizeData(ActionEvent event) {
    	nameValue.setText("Employee 5");
    }

    @FXML
    private AnchorPane poker_main;
    @FXML
    void pushStory(ActionEvent event) {
        teamtable.getItems().addAll(
        new DefData.TeamEntry("Employee5", "cars1", "2")
        );
    }


    @FXML
    void back(ActionEvent event) throws IOException {
        new SceneSwitch(poker_main, "TeamSharing.fxml");
    }
}
