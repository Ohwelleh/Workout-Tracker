module com.workouttracker.workouttracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.workouttracker.main to javafx.fxml;
    exports com.workouttracker.main;
    exports com.workouttracker.main.Controller;
    exports com.workouttracker.main.Model;
    opens com.workouttracker.main.Controller to javafx.fxml;
    opens com.workouttracker.main.Model to javafx.fxml;
}