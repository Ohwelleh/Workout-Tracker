package com.workouttracker.main.Model;

import javafx.beans.property.SimpleStringProperty;

public class ExerciseEntry {

    private SimpleStringProperty exerciseName;
    private SimpleStringProperty totalSets;
    private SimpleStringProperty rangeOfReps;
    private SimpleStringProperty weight;
    private SimpleStringProperty workoutType;

    public ExerciseEntry(String exerciseName, String totalSets, String rangeOfReps, String weight, String workoutType) {
        this.exerciseName = new SimpleStringProperty(exerciseName);
        this.totalSets = new SimpleStringProperty(totalSets);
        this.rangeOfReps = new SimpleStringProperty(rangeOfReps);
        this.workoutType = new SimpleStringProperty(workoutType);
        this.weight = new SimpleStringProperty(weight);
    }

    // Setters
    public void setWeight(String weight) {

        this.weight = new SimpleStringProperty(weight);
    }
    public void setExerciseName(String exerciseName) {

        this.exerciseName = new SimpleStringProperty(exerciseName);
    }

    public void setTotalSets(String totalSets) {

        this.totalSets = new SimpleStringProperty(totalSets);
    }

    public void setRangeOfReps(String rangeOfReps) {

        this.rangeOfReps = new SimpleStringProperty(rangeOfReps);
    }

    public void setWorkoutType(String workoutType) {

        this.workoutType = new SimpleStringProperty(workoutType);
    }

    // Getters
    public String getExerciseName() {

        return exerciseName.get();
    }
    public String getWeight(){
        return weight.get();
    }
    public String getTotalSets() {
        return totalSets.get();
    }

    public String getRangeOfReps() {
        return rangeOfReps.get();
    }

    public String getWorkoutType() {
        return workoutType.get();
    }
}
