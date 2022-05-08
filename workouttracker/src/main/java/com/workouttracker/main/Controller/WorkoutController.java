package com.workouttracker.main.Controller;

import com.workouttracker.main.WorkoutApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import com.workouttracker.main.WorkoutApplication.*;

public class WorkoutController {

    @FXML
    private Button BigThreeBtn;
    @FXML
    private HBox BigWindow;
    @FXML
    private Button WorkoutsBtn;
    @FXML
    private Label MainLabel;
    @FXML
    private HBox DateCard;
    @FXML
    private TableView EntryTable;
    @FXML
    private Button PeronalBestBtn;

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
        DateCard.setVisible(true);
        MainLabel.setText("Workouts");
        EntryTable.setVisible(true);
    }

    @FXML
    public void loadPB(Event event) {
        try {
            WorkoutApplication.changeScene("personalbest-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }

    }
}