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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import com.example.guilogger.Data_controller;

public class Defect_ConsoleController implements Initializable {

    @FXML
    private TableColumn<DefectlogData, String> change;

    @FXML
    private ComboBox<String> projectlist;

    @FXML
    private AnchorPane defectloganchor;

    @FXML
    private Label defectlogarch;

    @FXML
    private TableView<DefectlogData> defeacttable;

    @FXML
    private TableColumn<DefectlogData, String> detail;

    @FXML
    private TableColumn<DefectlogData, String> estimated;

    @FXML
    private TableColumn<DefectlogData, String> index;

    @FXML
    private TableColumn<DefectlogData, String> name;

    @FXML
    private TableColumn<DefectlogData, String> required;

    @FXML
    void back(MouseEvent event) throws IOException {
        new SceneSwitch(defectloganchor, "hello-view.fxml");

    }

    public ObservableList<DefectlogData> defectlog;

    @FXML
    void submit(MouseEvent event) {
        String selectedProject = projectlist.getSelectionModel().getSelectedItem();
        if ("PixelCraft".equals(selectedProject)) {
            Data_controller dataController = new Data_controller();
            dataController.initData();
            defectlog = dataController.getDefectlog();
            defeacttable.setItems(defectlog);
        } else {
            defeacttable.getItems().clear(); // Clear the table if it's not "PixelCraft"
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        defeacttable.setEditable(true);
        Data_controller dataController = new Data_controller();

        setupEditableColumns();

        projectlist.getItems().addAll("PixelCraft", "WebFlow", "SwiftNote");
        // The PropertyValueFactory should match the property names in your DefectlogData class
        change.setCellValueFactory(new PropertyValueFactory<>("change"));
        detail.setCellValueFactory(new PropertyValueFactory<>("detail"));
        estimated.setCellValueFactory(new PropertyValueFactory<>("estimated"));
        index.setCellValueFactory(new PropertyValueFactory<>("index"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        required.setCellValueFactory(new PropertyValueFactory<>("required"));
    }

    private void setupEditableColumns() {
        setupEditableColumn(change, "change");
        setupEditableColumn(detail, "detail");
        setupEditableColumn(estimated, "estimated");
        setupEditableColumn(index, "index");
        setupEditableColumn(name, "name");
        setupEditableColumn(required, "required");

    }

    private void setupEditableColumn(TableColumn<DefectlogData, String> column, String propertyName) {
        column.setCellFactory(TextFieldTableCell.forTableColumn());
        column.setOnEditCommit(event -> {
            DefectlogData data = event.getRowValue();
            switch (propertyName) {
                case "change": data.setChange(event.getNewValue()); break;
                case "detail": data.setDetail(event.getNewValue()); break;
                case "estimated": data.setEstimated(event.getNewValue()); break;
                // Add cases for other properties as needed
            }
        });
    }

    public void update(MouseEvent mouseEvent) {
    }
}
