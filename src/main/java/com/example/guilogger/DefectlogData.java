package com.example.guilogger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class DefectlogData {
    private final SimpleStringProperty change;
    private final SimpleStringProperty detail;
    private final SimpleStringProperty estimated;
    private final SimpleStringProperty index;
    private final SimpleStringProperty name;
    private final SimpleStringProperty required;

    public DefectlogData(String change, String detail, String estimated, String index, String name, String required) {
        this.change = new SimpleStringProperty(change);
        this.detail = new SimpleStringProperty(detail);
        this.estimated = new SimpleStringProperty(estimated);
        this.index = new SimpleStringProperty(index);
        this.name = new SimpleStringProperty(name);
        this.required = new SimpleStringProperty(required);
    }

    // Getters
    public String getChange() {
        return change.get();
    }

    public String getDetail() {
        return detail.get();
    }

    public String getEstimated() {
        return estimated.get();
    }

    public String getIndex() {
        return index.get();
    }

    public String getName() {
        return name.get();
    }

    public String getRequired() {
        return required.get();
    }

    // Setters
    public void setChange(String change) {
        this.change.set(change);
    }

    public void setDetail(String detail) {
        this.detail.set(detail);
    }

    public void setEstimated(String estimated) {
        this.estimated.set(estimated);
    }

    public void setIndex(String index) {
        this.index.set(index);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setRequired(String required) {
        this.required.set(required);
    }

    // Property methods
    public SimpleStringProperty changeProperty() {
        return change;
    }

    public SimpleStringProperty detailProperty() {
        return detail;
    }

    public SimpleStringProperty estimatedProperty() {
        return estimated;
    }

    public SimpleStringProperty indexProperty() {
        return index;
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public SimpleStringProperty requiredProperty() {
        return required;
    }
}
