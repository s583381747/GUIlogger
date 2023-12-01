package com.example.guilogger;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Effort_LogsController {

    @FXML
    private TableColumn<EffortlogData, Number> index;

    @FXML
    private TableColumn<EffortlogData, String> date;

    @FXML
    private TableColumn<EffortlogData, String> time;

    @FXML
    private TableColumn<EffortlogData, String> lifecyclestep;

    @FXML
    private TableColumn<EffortlogData, String> effortcategory;

    @FXML
    private TableColumn<EffortlogData, String> deliverable;

    @FXML
    private TableColumn<EffortlogData, Number> effort;

    @FXML
    private ChoiceBox<String> list; // Replace ? with String if it's a list of strings

    @FXML
    private TableView<EffortlogData> effortTable; // This TableView should be added to your FXML


    @FXML
    private AnchorPane effortloganchor;

    // Assuming Data_controller is a singleton or you may manage its instantiation differently
//    public ObservableList<EffortlogData> effortlog;
    private ObservableList<EffortlogData> effortlog;
    @FXML
    void back(MouseEvent event) throws IOException {
        new SceneSwitch(effortloganchor, "hello-view.fxml");
    }

    HelloController hello2 = new HelloController();

    //public int indexl = hello2.counter1 + 3;

    @FXML
    void submit(MouseEvent event) {
        String selectedProject = list.getSelectionModel().getSelectedItem();
        if ("PixelCraft".equals(selectedProject)) {
            Data_controller dataController = new Data_controller();
            dataController.initData(); // Make sure this method exists in your Data_controller

            effortlog = dataController.getEffortlog(); // And this getter should return the effort data

            Effort_Log_EditorController eff = new Effort_Log_EditorController();
            if(eff.flag == true)
            {
                dataController.editEffort();
            }

            HelloController hello1 = new HelloController();
            if(hello1.flag1 == true)
            {
                dataController.addData();
            }

            effortlog = dataController.getEffortlog(); // And this getter should return the effort data
            effortTable.setItems(effortlog);
        } else {
            effortTable.getItems().clear(); // Clear the table if it's not "PixelCraft"
        }
    }

    @FXML
    public void initialize() {
        list.getItems().addAll("PixelCraft", "WebFlow", "SwiftNote");
        index.setCellValueFactory(new PropertyValueFactory<>("index"));
        date.setCellValueFactory(new PropertyValueFactory<>("date"));
        time.setCellValueFactory(new PropertyValueFactory<>("timeTaken"));
        lifecyclestep.setCellValueFactory(new PropertyValueFactory<>("lifeCycleStep"));
        effortcategory.setCellValueFactory(new PropertyValueFactory<>("effortCategory"));
        deliverable.setCellValueFactory(new PropertyValueFactory<>("deliverable"));
        effort.setCellValueFactory(new PropertyValueFactory<>("effort"));

    }
}
