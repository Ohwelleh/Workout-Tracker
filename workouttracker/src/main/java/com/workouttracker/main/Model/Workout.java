package com.workouttracker.main.Model;

import java.util.ArrayList;
import java.util.List;

public class Workout {

    private String exerciseDate;
    private String exerciseTime;
    private List<ExerciseEntry> exercises;

    public Workout(String exerciseDate, String exerciseTime) {
        this.exerciseDate = exerciseDate;
        this.exerciseTime = exerciseTime;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(String exerciseName, String totalSets, String rangeOfReps, String workoutType){
        ExerciseEntry newExercise = new ExerciseEntry(exerciseName, totalSets, rangeOfReps, workoutType);
        exercises.add(newExercise);
    }

    public void deleteExercise(String exerciseName){
        // TODO: See if you can use the table view index values to speed this up.
        int i;
        for(i = 0; i < exercises.size(); i++){
            if(exercises.get(i).getExerciseName().equals(exerciseName)){
                exercises.remove(i);
                break;
            }
        }
    }

    public void editExercise(String exerciseName, String totalSets, String rangeOfReps, String workoutType, int indexLocation){
        // TODO: See if you can use the table view index values to speed this up.
        ExerciseEntry updatedExercise = new ExerciseEntry(exerciseName, totalSets, rangeOfReps, workoutType);
        exercises.set(indexLocation, updatedExercise);
    }

    // Setters
    public void setExerciseDate(String exerciseDate) {
        this.exerciseDate = exerciseDate;
    }

    public void setExerciseTime(String exerciseTime) {
        this.exerciseTime = exerciseTime;
    }

    public void setExercises(List<ExerciseEntry> exercises) {
        this.exercises = exercises;
    }

    // Getters
    public String getExerciseDate() {
        return exerciseDate;
    }

    public String getExerciseTime() {
        return exerciseTime;
    }

    public List<ExerciseEntry> getExercises() {
        return exercises;
    }
}
