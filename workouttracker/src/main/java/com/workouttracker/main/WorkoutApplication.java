package com.workouttracker.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkoutApplication extends Application {

    private static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(WorkoutApplication.class.getResource("workout-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1315, 810);
        primaryStage.setTitle("Workout Tracker");
        primaryStage.setScene(scene);
        primaryStage.show();
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