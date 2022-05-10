package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.Workout;
import com.workouttracker.main.MyListener;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class WorkoutEntryController {
    @FXML
    private Label dateLabel;
    @FXML
    private Label timeLabel;

    private Workout workout;
    private MyListener myListener;

    public void setData(Workout workout, MyListener myListener){
        this.workout = workout;
        this.myListener = myListener;
        dateLabel.setText(workout.getExerciseDate());
        timeLabel.setText(workout.getExerciseTime());
    }

    // This method handles when a workout entry is clicked and updates the Chosen workout pane area.
    @FXML
    private void click(MouseEvent mouseEvent){
        myListener.onClickListener(workout);
    }
}
