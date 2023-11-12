package com.example.guilogger;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TablePosition;
import javafx.scene.control.TableView;
import javafx.collections.ListChangeListener;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;

public class Effort_Log_EditorController {

    public AnchorPane effortlogeditor_anchor;

    @FXML
    private TableColumn<EffortlogData, String> index;

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
    private TableColumn<EffortlogData, String> effort;

    @FXML
    private ComboBox<String> list;


    @FXML
    private TableView<EffortlogData> effortTable; // This TableView should be added to your FXML


    @FXML
    private TextField update_filed;

    private TablePosition<EffortlogData, ?> lastSelectedCell;

    private ObservableList<EffortlogData> effortlog;

    @FXML
    void back(MouseEvent event) throws IOException {
        new SceneSwitch(effortlogeditor_anchor, "hello-view.fxml");
    }

    @FXML
    void submit(MouseEvent event) {
        String selectedProject = list.getSelectionModel().getSelectedItem();
        if ("PixelCraft".equals(selectedProject)) {
            Data_controller dataController = new Data_controller();
            dataController.initData(); // Make sure this method exists in your Data_controller
            effortlog = dataController.getEffortlog(); // And this getter should return the effort data
            effortTable.setItems(effortlog);
        } else {
            effortTable.getItems().clear(); // Clear the table if it's not "PixelCraft"
        }
    }

    @FXML
    public void initialize() {
        effortTable.setEditable(true);
        Data_controller dataController = new Data_controller();
        list.getItems().addAll("PixelCraft", "WebFlow", "SwiftNote");

        // Set up columns
        setupEditableColumns();

        effortTable.getSelectionModel().setCellSelectionEnabled(true);
        effortTable.getSelectionModel().getSelectedCells().addListener((ListChangeListener<TablePosition>) c -> {
            if (!c.getList().isEmpty()) {
                TablePosition selectedCell = c.getList().get(0); // This is the first selected cell
                int row = selectedCell.getRow();
                TableColumn<EffortlogData, ?> column = selectedCell.getTableColumn();
                EffortlogData data = effortTable.getItems().get(row);
                Object cellData = column.getCellObservableValue(data).getValue();
                update_filed.setText(cellData.toString());
            }
        });
    }

    private void setupEditableColumns() {
        // Assuming EffortlogData has String properties for these fields
        setupEditableColumn(date, "date");
        setupEditableColumn(time, "timeTaken");
        setupEditableColumn(lifecyclestep, "lifeCycleStep");
        setupEditableColumn(effortcategory, "effortCategory");
        setupEditableColumn(deliverable, "deliverable");
        setupEditableColumn(index, "index");
        setupEditableColumn(effort, "effort");
    }

    private void setupEditableColumn(TableColumn<EffortlogData, String> column, String propertyName) {
        column.setCellValueFactory(new PropertyValueFactory<>(propertyName));
        column.setCellFactory(TextFieldTableCell.forTableColumn());
        column.setOnEditCommit(event -> {
            EffortlogData data = event.getRowValue();
            switch (propertyName) {
                case "date": data.setDate(event.getNewValue()); break;
                case "timeTaken": data.setTimeTaken(event.getNewValue()); break;
                case "lifeCycleStep": data.setLifeCycleStep(event.getNewValue()); break;
                case "effortCategory": data.setEffortCategory(event.getNewValue()); break;
                case "deliverable": data.setDeliverable(event.getNewValue()); break;
                // Add cases for other properties as needed
            }
        });
    }


    public void update(MouseEvent mouseEvent) {
    }
}

