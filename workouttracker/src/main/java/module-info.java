module com.workouttracker.workouttracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.workouttracker.main to javafx.fxml;
    exports com.workouttracker.main;
    exports com.workouttracker.main.Controller;
    opens com.workouttracker.main.Controller to javafx.fxml;
}