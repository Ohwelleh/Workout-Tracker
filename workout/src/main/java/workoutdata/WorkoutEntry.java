package java.workoutdata;

import java.util.ArrayList;

public class WorkoutEntry {

    private ArrayList<ExerciseItem> exercises;
    private String workoutDate;

    public WorkoutEntry(String date){

        workoutDate = date;
        exercises = new ArrayList<ExerciseItem>();
    }

    public void addExercise(String name, float weight, int sets, float reps, String goal){
        ExerciseItem newExercise = new ExerciseItem(name, weight, sets, reps, goal);
        exercises.add(newExercise);
    }

    public void removeExercise(String name){
        
        int i;
        for(i = 0; i < exercises.size(); i++){
            if(name.equals(exercises.get(i).getExerciseName())){
                break;
            }
        }

        exercises.remove(i);
    }

    // Getters
    public String getWorkoutDate() {
        return workoutDate;
    }

    // Setters
    public void setWorkoutDate(String workoutDate) {
        this.workoutDate = workoutDate;
    }
}