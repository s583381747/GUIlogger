package com.example.guilogger;// Import necessary JavaFX classes and other dependencies
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

// Define a utility class for switching scenes in a JavaFX application
public class SceneSwitch {

    // Constructor for switching scenes
    public SceneSwitch(AnchorPane currentAnchorPane, String fxml) throws IOException {
        // Load the next AnchorPane from the provided FXML file
        AnchorPane nextAnchorPane = FXMLLoader.load(Objects.requireNonNull(HelloApplication.class.getResource(fxml)));

        // Replace the content of the current AnchorPane with the next one
        currentAnchorPane.getChildren().removeAll();
        currentAnchorPane.getChildren().setAll(nextAnchorPane);

        // Get the current Stage (window)
        Stage currentStage = (Stage) currentAnchorPane.getScene().getWindow();

        // Calculate the preferred height and width of the next AnchorPane
        double prefHeight = nextAnchorPane.getPrefHeight();
        double prefWidth = nextAnchorPane.getPrefWidth();

        // If preferred height or width is not set, use the current height or width
        if (prefHeight <= 0) {
            prefHeight = nextAnchorPane.getHeight();
        }
        if (prefWidth <= 0) {
            prefWidth = nextAnchorPane.getWidth();
        }

        // Adjust the size of the current Stage to match the next AnchorPane's size
        currentStage.setHeight(prefHeight + currentStage.getHeight() - currentAnchorPane.getHeight());
        currentStage.setWidth(prefWidth + currentStage.getWidth() - currentAnchorPane.getWidth());
    }
}
