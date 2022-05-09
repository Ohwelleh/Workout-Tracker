package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.BigThreeData;
import com.workouttracker.main.Model.PersonalBestData;
import com.workouttracker.main.WorkoutApplication;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
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
    private LineChart<String, Number> liftGraph;

    @FXML
    private void initialize(){
        liftGraph.setAnimated(false);
        liftGraph.setTitle("Bench");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Strength Weights");
        series.getData().add(new XYChart.Data<>("Apr 11", 150));
        series.getData().add(new XYChart.Data<>("Apr 18", 165));
        series.getData().add(new XYChart.Data<>("Apr 25", 165));
        series.getData().add(new XYChart.Data<>("May 2", 170));
        series.getData().add(new XYChart.Data<>("May 9", 175));

        liftGraph.getData().add(series);
    }

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

        liftGraph.getData().clear();

        liftGraph.setTitle("Bench");

        XYChart.Series<String, Number> series = new XYChart.Series<String, Number>();
        series.setName("Strength Weights");
        series.getData().add(new XYChart.Data<>("Apr 11", 150));
        series.getData().add(new XYChart.Data<>("Apr 18", 165));
        series.getData().add(new XYChart.Data<>("Apr 25", 165));
        series.getData().add(new XYChart.Data<>("May 2", 170));
        series.getData().add(new XYChart.Data<>("May 9", 175));

        liftGraph.getData().add(series);

    }

    @FXML
    public void LoadSquatGraph(Event event) {
        liftGraph.getData().remove(0);

        liftGraph.setTitle("Squat");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Strength Weights");
        series.getData().add(new XYChart.Data<>("Apr 11", 250));
        series.getData().add(new XYChart.Data<>("Apr 18", 265));
        series.getData().add(new XYChart.Data<>("Apr 25", 165));
        series.getData().add(new XYChart.Data<>("May 2", 270));
        series.getData().add(new XYChart.Data<>("May 9", 175));

        liftGraph.getData().add(series);
    }

    @FXML
    public void LoadDeadliftGraph(Event event) {
        liftGraph.getData().remove(0);

        liftGraph.setTitle("Deadlift");

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Strength Weights");
        series.getData().add(new XYChart.Data<>("Apr 11", 224));
        series.getData().add(new XYChart.Data<>("Apr 18", 200));
        series.getData().add(new XYChart.Data<>("Apr 25", 333));
        series.getData().add(new XYChart.Data<>("May 2", 400));
        series.getData().add(new XYChart.Data<>("May 9", 123));

        liftGraph.getData().add(series);
    }

    public void getDataModel(BigThreeData bigData){
        this.bigData = bigData;
    }
}
