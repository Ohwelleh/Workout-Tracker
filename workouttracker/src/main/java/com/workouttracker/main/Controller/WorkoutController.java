package com.workouttracker.main.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class WorkoutController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}