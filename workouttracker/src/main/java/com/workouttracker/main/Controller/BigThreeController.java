package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.BigThreeData;
import com.workouttracker.main.Model.PersonalBestData;
import com.workouttracker.main.WorkoutApplication;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class BigThreeController {
    @FXML
    private Button BigThreeBtn;
    @FXML
    private HBox BigWindow;
    private BigThreeData bigData;
    private PersonalBestData pbData;
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
    public void loadPersonalBest(Event event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("personalbest-view.fxml"));
//
//        PersonalBestController personalController = fxmlLoader.getController();
//        personalController.getDataModel(pbData);
//
//        Scene scene = new Scene(fxmlLoader.load(), 1315, 810);
//        Stage stage = new Stage();
//        stage.setTitle("Workout Tracker");
//        stage.setScene(scene);

        try {
            WorkoutApplication.changeScene("personalbest-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }
    }

    @FXML
    public void LoadBenchGraph(Event event) {
    }

    @FXML
    public void LoadSquatGraph(Event event) {
    }

    @FXML
    public void LoadDeadliftGraph(Event event) {
    }

    public void getDataModel(BigThreeData bigData){
        this.bigData = bigData;
    }
}
