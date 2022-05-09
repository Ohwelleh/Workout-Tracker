package com.workouttracker.main.Model;

public class ExerciseEntry {

    private String exerciseName;
    private String totalSets;
    private String rangeOfReps;
    private String workoutType;

    public ExerciseEntry(String exerciseName, String totalSets, String rangeOfReps, String workoutType) {
        this.exerciseName = exerciseName;
        this.totalSets = totalSets;
        this.rangeOfReps = rangeOfReps;
        this.workoutType = workoutType;
    }

    // Setters
    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setTotalSets(String totalSets) {
        this.totalSets = totalSets;
    }

    public void setRangeOfReps(String rangeOfReps) {
        this.rangeOfReps = rangeOfReps;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    // Getters
    public String getExerciseName() {
        return exerciseName;
    }

    public String getTotalSets() {
        return totalSets;
    }

    public String getRangeOfReps() {
        return rangeOfReps;
    }

    public String getWorkoutType() {
        return workoutType;
    }
}
