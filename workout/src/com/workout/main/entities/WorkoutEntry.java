package com.workout.main.entities;

import java.io.Serializable;
import java.util.ArrayList;

public class WorkoutEntry implements Serializable {
    private ArrayList<Exercise> exercises;

    private String currentExercises[];
    private String workoutDate, workoutTime;
    private String workoutName;

    public WorkoutEntry(String workoutDate, String workoutTime, String workoutName) {
        this.workoutDate = workoutDate;
        this.workoutTime = workoutTime;
        this.workoutName = workoutName;
        this.exercises = new ArrayList<Exercise>();
    }

    // Add Exercise to list
    public void addExercise(String name, double weight, int totalSets, double totalReps, String trainingGoal){
        Exercise newExercise = new Exercise(name, weight, totalSets, totalReps, trainingGoal);
        exercises.add(newExercise);
    }

    // Setters
    public void setWorkoutDate(String workoutDate) {
        this.workoutDate = workoutDate;
    }

    public void setWorkoutTime(String workoutTime) {
        this.workoutTime = workoutTime;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    // Getters
    public String getWorkoutDate(){
        return workoutDate;
    }

    public String getWorkoutTime(){
        return workoutTime;
    }

    public String getWorkoutName(){
        return workoutName;
    }
    public ArrayList<Exercise> getExercises(){
        return exercises;
    }
}
