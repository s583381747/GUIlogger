package com.example.guilogger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public class Data_controller {

    private ObservableList<DefectlogData> defectlog;
    private ObservableList<EffortlogData> effortlog;

    public void initData() {
        defectlog = FXCollections.observableArrayList(
                new DefectlogData("Header Misalignment", "The header on the homepage is misaligned with the page content", "2", "1", "Adjust CSS styling", "4"),
                new DefectlogData("App Crash on Load", "Application crashes when trying to load more than 100 items at once", "2", "2", "Optimize loading routine", "4"),
                new DefectlogData("Memory Leak", "Memory leak observed when processing large files", "8", "3", "Refactor file processing module", "9"),
                new DefectlogData("Settings Not Saved", "User settings changes are not being saved intermittently", "3", "4", "Debug save function", "6"),
                new DefectlogData("Authentication Flaw", "No authentication checks on the settings page", "6", "5", "Implement user authentication checks", "8")
        );
        effortlog = FXCollections.observableArrayList(
                new EffortlogData("1", "2023-11-01", "2h 30m", "Requirements Analysis", "Documentation", "User Stories", "5"),
                new EffortlogData("2", "2023-11-02", "3h 45m", "Design", "Design Review", "UI Mockups", "6"),
                new EffortlogData("3", "2023-11-03", "5h", "Coding", "Development", "Authentication Module", "8"),
                new EffortlogData("4", "2023-11-04", "4h 15m", "Testing", "Automated Testing", "API Endpoints", "10"),
                new EffortlogData("5", "2023-11-05", "1h 30m", "Deployment", "Deployment Planning", "Version 1.0 Release", "4")
        );
    }

    public ObservableList<DefectlogData> getDefectlog() {
        return defectlog;
    }
    public void setDefectlog(ObservableList<DefectlogData> defectlog) {
        this.defectlog = defectlog;
    }

    public ObservableList<EffortlogData> getEffortlog() {
        return effortlog;
    }
    public void setEffortlog(ObservableList<EffortlogData> effortlog) {
        this.effortlog = effortlog;
    }
//    public void updateEffortLogData(int index, String newDate, String newTimeTaken, String newLifeCycleStep,
//                                    String newEffortCategory, String newDeliverable, int newEffort) {
//        if (index >= 0 && index < effortlog.size()) {
//            EffortlogData data = effortlog.get(index);
//            data.setDate(newDate);
//            data.setTimeTaken(newTimeTaken);
//            data.setLifeCycleStep(newLifeCycleStep);
//            data.setEffortCategory(newEffortCategory);
//            data.setDeliverable(newDeliverable);
//            data.setEffort(newEffort);
//
//        }
//    }

}
