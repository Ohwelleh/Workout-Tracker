package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.Workout;
import javafx.scene.control.Label;
import javafx.fxml.FXML;

public class WorkoutEntryController {
    @FXML
    private Label dateLabel;
    @FXML
    private Label timeLabel;

    private Workout workout;
    public void setData(Workout workout){
        this.workout = workout;
        dateLabel.setText(workout.getExerciseDate());
        timeLabel.setText(workout.getExerciseTime());
    }
}
