package com.workouttracker.main.Controller;

import com.workouttracker.main.WorkoutApplication;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class BigThreeController {
    @FXML
    private Button BigThreeBtn;
    @FXML
    private HBox BigWindow;
    @FXML
    private Label MainLabel;
    @FXML
    private Button WorkoutsBtn;
    @FXML
    private Button PersonalBestBtn;

    @FXML
    public void LoadBigThree(Event event) {
    }

    @FXML
    public void LoadWorkouts(Event event) {
        try {
            WorkoutApplication.changeScene("workout-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }
    }

    @FXML
    public void loadPersonalBest(Event event) {
        try {
            WorkoutApplication.changeScene("personalbest-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
