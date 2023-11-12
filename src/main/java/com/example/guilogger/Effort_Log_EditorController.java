package com.example.guilogger;

import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.guilogger.Data_controller;

public class Effort_Log_EditorController implements Initializable {

    @FXML
    private TableColumn<EffortlogData, String> date;

    @FXML
    private TableColumn<EffortlogData, String> timeTaken;

    @FXML
    private TableColumn<EffortlogData, String> lifeCycleStep;

    @FXML
    private TableColumn<EffortlogData, String> effortCategory;

    @FXML
    private TableColumn<EffortlogData, String> deliverable;

    @FXML
    private TableColumn<EffortlogData, Number> effort;

    @FXML
    private ComboBox<String> projectlist;

    @FXML
    private AnchorPane effortloganchor;

    @FXML
    private TableView<EffortlogData> efforttable;

    public ObservableList<EffortlogData> data;

//    @FXML
//    void submit(MouseEvent event) {
//        String selectedProject = projectlist.getSelectionModel().getSelectedItem();
//        if ("PixelCraft".equals(selectedProject)) {
//            Data_controller dataController = new Data_controller();
//            dataController.initData();
//            defectlog = dataController.getDefectlog();
//            defeacttable.setItems(defectlog);
//        } else {
//            defeacttable.getItems().clear(); // Clear the table if it's not "PixelCraft"
//        }
//    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        projectlist.getItems().addAll("PixelCraft", "WebFlow", "SwiftNote");
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        timeTaken.setCellValueFactory(new PropertyValueFactory<>("timeTaken"));
        lifeCycleStep.setCellValueFactory(new PropertyValueFactory<>("lifeCycleStep"));
        effortCategory.setCellValueFactory(new PropertyValueFactory<>("effortCategory"));
        deliverable.setCellValueFactory(new PropertyValueFactory<>("deliverable"));
        effort.setCellValueFactory(new PropertyValueFactory<>("effort"));
    }

    @FXML
    void back(MouseEvent event) {
        // Implementation to go back to the previous view
    }

    // Additional methods for handling UI interactions, such as editing an effort log entry
}
