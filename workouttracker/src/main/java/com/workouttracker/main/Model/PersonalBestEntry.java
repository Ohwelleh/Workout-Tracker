package com.workouttracker.main.Model;

import javafx.beans.property.SimpleStringProperty;

public class PersonalBestEntry {
    private SimpleStringProperty exerciseName;
    private SimpleStringProperty strengthPR;
    private SimpleStringProperty repsPR;

    public PersonalBestEntry(String exerciseName, String strengthPR, String repsPR) {
        this.exerciseName = new SimpleStringProperty(exerciseName);
        this.strengthPR = new SimpleStringProperty(strengthPR);
        this.repsPR = new SimpleStringProperty(repsPR);
    }

    public String getExerciseName() {
        return exerciseName.get();
    }

    public String getStrengthPR() {
        return strengthPR.get();
    }

    public String getRepsPR() {
        return repsPR.get();
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = new SimpleStringProperty(exerciseName);
    }

    public void setStrengthPR(String strengthPR) {
        this.strengthPR = new SimpleStringProperty(strengthPR);
    }

    public void setRepsPR(String repsPR) {
        this.repsPR = new SimpleStringProperty(repsPR);
    }
}
