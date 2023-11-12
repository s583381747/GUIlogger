package com.example.guilogger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class EffortlogData {
    private final SimpleIntegerProperty index;
    private final SimpleStringProperty date;
    private final SimpleStringProperty timeTaken;
    private final SimpleStringProperty lifeCycleStep;
    private final SimpleStringProperty effortCategory;
    private final SimpleStringProperty deliverable;
    private final SimpleIntegerProperty effort;

    public EffortlogData(int index, String date, String timeTaken, String lifeCycleStep,
                         String effortCategory, String deliverable, int effort) {
        this.index = new SimpleIntegerProperty(index);
        this.date = new SimpleStringProperty(date);
        this.timeTaken = new SimpleStringProperty(timeTaken);
        this.lifeCycleStep = new SimpleStringProperty(lifeCycleStep);
        this.effortCategory = new SimpleStringProperty(effortCategory);
        this.deliverable = new SimpleStringProperty(deliverable);
        this.effort = new SimpleIntegerProperty(effort);
    }

    // Getters
    public int getIndex() {
        return index.get();
    }

    public String getDate() {
        return date.get();
    }

    public String getTimeTaken() {
        return timeTaken.get();
    }

    public String getLifeCycleStep() {
        return lifeCycleStep.get();
    }

    public String getEffortCategory() {
        return effortCategory.get();
    }

    public String getDeliverable() {
        return deliverable.get();
    }

    public int getEffort() {
        return effort.get();
    }

    // Setters
    public void setIndex(int index) {
        this.index.set(index);
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public void setTimeTaken(String timeTaken) {
        this.timeTaken.set(timeTaken);
    }

    public void setLifeCycleStep(String lifeCycleStep) {
        this.lifeCycleStep.set(lifeCycleStep);
    }

    public void setEffortCategory(String effortCategory) {
        this.effortCategory.set(effortCategory);
    }

    public void setDeliverable(String deliverable) {
        this.deliverable.set(deliverable);
    }

    public void setEffort(int effort) {
        this.effort.set(effort);
    }

    // Property methods
    public SimpleIntegerProperty indexProperty() {
        return index;
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public SimpleStringProperty timeTakenProperty() {
        return timeTaken;
    }

    public SimpleStringProperty lifeCycleStepProperty() {
        return lifeCycleStep;
    }

    public SimpleStringProperty effortCategoryProperty() {
        return effortCategory;
    }

    public SimpleStringProperty deliverableProperty() {
        return deliverable;
    }

    public SimpleIntegerProperty effortProperty() {
        return effort;
    }
}
