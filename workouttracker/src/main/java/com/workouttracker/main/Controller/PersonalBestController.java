package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.PersonalBestData;
import com.workouttracker.main.WorkoutApplication;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PersonalBestController {
    @FXML
    private Button BigThreeBtn;

    private PersonalBestData pbData;
    @FXML
    private HBox BigWindow;
    @FXML
    private Label MainLabel;
    @FXML
    private Button WorkoutsBtn;

    @FXML
    public void LoadBigThree(Event event) {
        try {
            WorkoutApplication.changeScene("bigthree-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }
    }

    @FXML
    public void LoadWorkouts(Event event) {
        try {
            WorkoutApplication.changeScene("workout-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }
    }

    public void getDataModel(PersonalBestData pbData){
        this.pbData = pbData;
    }
}
