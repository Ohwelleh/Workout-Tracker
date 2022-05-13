package com.workouttracker.main;

import com.workouttracker.main.Controller.BigThreeController;
import com.workouttracker.main.Controller.PersonalBestController;
import com.workouttracker.main.Controller.WorkoutController;
import com.workouttracker.main.Model.BigThreeData;
import com.workouttracker.main.Model.PersonalBestData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkoutApplication extends Application {

    private static Stage primaryStage;
    private static WorkoutController wkController;
    private static BigThreeController bigController;
    private static PersonalBestController personalController;
    private PersonalBestData pbData;
    private BigThreeData bigThreeData;
    private static boolean startUP;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(WorkoutApplication.class.getResource("workout-view.fxml"));
        startUP = true;
        Scene scene = new Scene(fxmlLoader.load(), 1315, 810);
        primaryStage.setTitle("Workout Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static boolean isStartUP() {
        return startUP;
    }

    public PersonalBestData getPbData() {
        return pbData;
    }

    public BigThreeData getBigThreeData() {
        return bigThreeData;
    }

    public static void setStartUP(boolean startUP) {
        WorkoutApplication.startUP = startUP;
    }

    public void setPbData(PersonalBestData pbData) {
        this.pbData = pbData;
    }

    public void setBigThreeData(BigThreeData bigThreeData) {
        this.bigThreeData = bigThreeData;
    }

    public static void changeScene(String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(WorkoutApplication.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load(), 1315, 810);
        primaryStage.setScene(scene);

    }
    public static void main(String[] args) {
        launch();
    }
}