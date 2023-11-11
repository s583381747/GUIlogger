package com.example.guilogger;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StoryData {
    private final SimpleStringProperty userStory;
    private final SimpleIntegerProperty weight;

    public StoryData(String userStory, int weight) {
        this.userStory = new SimpleStringProperty(userStory);
        this.weight = new SimpleIntegerProperty(weight);
    }

    public String getUserStory() {
        return userStory.get();
    }

    public void setUserStory(String userStory) {
        this.userStory.set(userStory);
    }

    public int getWeight() {
        return weight.get();
    }

    public void setWeight(int weight) {
        this.weight.set(weight);
    }
}
