package com.example.guilogger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class Data_controller {

    private ObservableList<DefectlogData> project1_data;

    public void initData() {
        project1_data = FXCollections.observableArrayList(
                new DefectlogData("Header Misalignment", "The header on the homepage is misaligned with the page content", "2", 1, "Adjust CSS styling", "4"),
                new DefectlogData("App Crash on Load", "Application crashes when trying to load more than 100 items at once", "2", 2, "Optimize loading routine", "4"),
                new DefectlogData("Memory Leak", "Memory leak observed when processing large files", "8", 3, "Refactor file processing module", "9"),
                new DefectlogData("Settings Not Saved", "User settings changes are not being saved intermittently", "3", 4, "Debug save function", "6"),
                new DefectlogData("Authentication Flaw", "No authentication checks on the settings page", "6", 5, "Implement user authentication checks", "8")
        );
    }

    // Call this method whenever you need to fill in the table with the data
    public void populateTable(TableView<DefectlogData> tableView) {
        if (project1_data == null) {
            initData();
        }
        tableView.setItems(project1_data);
    }

}
