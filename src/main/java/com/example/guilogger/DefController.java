package com.example.guilogger;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class DefController {

    @FXML
    private TableView<DefData.Deliverable> deliverabletable;

    @FXML
    private TableColumn<DefData.Deliverable, String> deliverabletabledeliverable;

    @FXML
    private TableColumn<DefData.Deliverable, Integer> deliverabletableindex;

    @FXML
    private TableView<DefData.EffortCategory> effortcategoriestable;

    @FXML
    private TableColumn<DefData.EffortCategory, String> effortcategoriestableeffortcategory;

    @FXML
    private TableColumn<DefData.EffortCategory, Integer> effortcategoriestableindex;

    @FXML
    private TableView<DefData.Interruption> interruptions;

    @FXML
    private TableColumn<DefData.Interruption, Integer> interruptionsindex;

    @FXML
    private TableColumn<DefData.Interruption, String> interruptionsinterruptions;

    @FXML
    private TableView<DefData.LifecycleStep> lifecyclesteptable;

    @FXML
    private TableColumn<DefData.LifecycleStep, DefData.Deliverable> lifecyclesteptabledeliverable;

    @FXML
    private TableColumn<DefData.LifecycleStep, DefData.EffortCategory> lifecyclesteptableeffortcategory;

    @FXML
    private TableColumn<DefData.LifecycleStep, Integer> lifecyclesteptableindex;

    @FXML
    private TableColumn<DefData.LifecycleStep, String> lifecyclesteptablelifecyclestep;

    @FXML
    private TableView<DefData.Plan> plans;

    @FXML
    private TableColumn<DefData.Plan, Integer> plansindex;

    @FXML
    private TableColumn<DefData.Plan, String> plansplans;

    @FXML
    private TableView<DefData.Project> projecttable;

    @FXML
    private TableColumn<DefData.Project, Integer> projecttablefour;

    @FXML
    private TableColumn<DefData.Project, Integer> projecttableindex;

    @FXML
    private TableColumn<DefData.Project, String> projecttablename;

    @FXML
    private TableColumn<DefData.Project, Integer> projecttableone;

    @FXML
    private TableColumn<DefData.Project, Integer> projecttablethree;

    @FXML
    private TableColumn<DefData.Project, Integer> projecttabletwo;

    public DefController() {
    }

    @FXML
    void back(MouseEvent event) {
        // Your event handling code here
    }

    // Initialize the tables and add dummy data
    @FXML
    void initialize() {
        // Initialize and add dummy data for Deliverable table
        deliverabletabledeliverable.setCellValueFactory(new PropertyValueFactory<>("deliverable"));
        deliverabletableindex.setCellValueFactory(new PropertyValueFactory<>("index"));
        deliverabletable.getItems().addAll(
                new DefData.Deliverable("Deliverable 1", 1),
                new DefData.Deliverable("Deliverable 2", 2),
                new DefData.Deliverable("Deliverable 3", 3)
        );

        effortcategoriestableeffortcategory.setCellValueFactory(new PropertyValueFactory<>("effortCategory"));
        effortcategoriestableindex.setCellValueFactory(new PropertyValueFactory<>("index"));
        effortcategoriestable.getItems().addAll(
                new DefData.EffortCategory("Category A", 1),
                new DefData.EffortCategory("Category B", 2),
                new DefData.EffortCategory("Category C", 3)
        );
        interruptionsindex.setCellValueFactory(new PropertyValueFactory<>("index"));
        interruptionsinterruptions.setCellValueFactory(new PropertyValueFactory<>("interruptions"));
        interruptions.getItems().addAll(
                new DefData.Interruption(1, "Interruption 1"),
                new DefData.Interruption(2, "Interruption 2"),
                new DefData.Interruption(3, "Interruption 3")
        );

        lifecyclesteptableindex.setCellValueFactory(new PropertyValueFactory<>("index"));
        lifecyclesteptablelifecyclestep.setCellValueFactory(new PropertyValueFactory<>("lifecycleStep"));
        lifecyclesteptableeffortcategory.setCellValueFactory(new PropertyValueFactory<>("effortCategory"));

        // Add dummy data to the LifecycleStep table
        lifecyclesteptable.getItems().addAll(
                lifecyclesteptable.getItems().addAll(
                        new DefData.LifecycleStep(1, "Lifecycle Step 1", "Effort Category A"),
                        new DefData.LifecycleStep(2, "Lifecycle Step 2", "Effort Category B"),
                        new DefData.LifecycleStep( "Lifecycle Step 3", "Effort Category C",1)
                );

    }

}
