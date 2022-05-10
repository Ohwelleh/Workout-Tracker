package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.BigThreeData;
import com.workouttracker.main.Model.ExerciseEntry;
import com.workouttracker.main.Model.PersonalBestData;
import com.workouttracker.main.Model.Workout;
import com.workouttracker.main.MyListener;
import com.workouttracker.main.WorkoutApplication;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WorkoutController {

    private BigThreeData bigThree;
    private PersonalBestData pbData;
    private List<Workout> workouts = new ArrayList<>();
    private MyListener myListener;

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
    private Button PeronalBestBtn;
    @FXML
    private VBox selectedWorkout;
    @FXML
    private Label selectedDateLabel;
    @FXML
    private Label selectedTimeLabel;
    @FXML
    private ScrollPane scrollWindow;
    @FXML
    private GridPane workoutGrid;
    @FXML
    private TableView<ExerciseEntry> EntryTable;
    @FXML
    private TableColumn<ExerciseEntry, String> exerciseNameCol;
    @FXML
    private TableColumn<ExerciseEntry, String> weightCol;
    @FXML
    private TableColumn<ExerciseEntry, String> setsCol;
    @FXML
    private TableColumn<ExerciseEntry, String> repsCol;

    private List<Workout> getData(){
        List<Workout> workouts = new ArrayList<>();
        Workout tempWorkout;
        for(int i = 1; i < 21; i++){
            tempWorkout = new Workout("May " + i, "5:00 AM");
            int k = i * 3;
            for(int j = 1; j < 5; j++){
                tempWorkout.addExercise("Exercise " + k, "" + (j * 2), "2-3", "" + (j * 150),"S");
            }
            workouts.add(tempWorkout);
        }
        return workouts;
    }

    @FXML
    private void initialize(){
        // This load everytime I switch to this controller.
        System.out.println("Starting WorkController");
        exerciseNameCol.setCellValueFactory(new PropertyValueFactory<>("ExerciseName"));
        weightCol.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        setsCol.setCellValueFactory(new PropertyValueFactory<>("TotalSets"));
        repsCol.setCellValueFactory(new PropertyValueFactory<>("RangeOfReps"));

        int column = 0;
        int row = 1;
        bigThree = new BigThreeData();
        pbData = new PersonalBestData();

        // Getting the Mock workout data.
        workouts.addAll(getData());
        if(workouts.size() > 0) {
            setChosenWorkout(workouts.get(0));
            myListener = new MyListener() {
                @Override
                public void onClickListener(Workout workout) {
                    setChosenWorkout(workout);
                }
            };
        }


        // Adding the Mock data to the grid on the scroll area.
        try {

            for (int i = 0; i < workouts.size(); i++) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(WorkoutApplication.class.getResource("workoutEntry.fxml"));
                AnchorPane anchorPane = loader.load();

                WorkoutEntryController wkEntryController = loader.getController();
                wkEntryController.setData(workouts.get(i), myListener);
                workoutGrid.add(anchorPane, column, row++);

                workoutGrid.setMinWidth(Region.USE_COMPUTED_SIZE);
                workoutGrid.setPrefWidth(Region.USE_COMPUTED_SIZE);
                workoutGrid.setMaxWidth(Region.USE_COMPUTED_SIZE);

                workoutGrid.setMinHeight(Region.USE_COMPUTED_SIZE);
                workoutGrid.setPrefHeight(Region.USE_COMPUTED_SIZE);
                workoutGrid.setMaxHeight(Region.USE_COMPUTED_SIZE);


                GridPane.setMargin(anchorPane, new Insets(5));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    // Method for changing the scene to the Big Three graphs scene when Big 3 button pressed.
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

    // Method for changing the scene to the Personal Best scene when Personal Best button pressed.
    @FXML
    public void loadPB(Event event) {
        try {
            WorkoutApplication.changeScene("personalbest-view.fxml");
        }catch (Exception e){

            e.printStackTrace();
        }

    }

    // Method for updating the chosen workout pane.
    private void setChosenWorkout(Workout workout){
        EntryTable.getItems().clear();
        selectedDateLabel.setText(workout.getExerciseDate());
        selectedTimeLabel.setText(workout.getExerciseTime());
        EntryTable.setItems(workout.getExercises());
        System.out.println(workout.getExercises());
        EntryTable.refresh();
    }

    // Methods for initializing the custom data objects.
    public void initializeDataModels(BigThreeData bigThree, PersonalBestData pbData){
        this.bigThree = bigThree;
        this.pbData = pbData;
    }

    // Methods for passing the custom data objects.
    public BigThreeData getBigThree(){
        return  bigThree;
    }

    public PersonalBestData getPbData(){
        return pbData;
    }
}