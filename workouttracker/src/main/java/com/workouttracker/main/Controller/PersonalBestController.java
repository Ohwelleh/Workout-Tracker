package com.workouttracker.main.Controller;

import com.workouttracker.main.Model.PersonalBestData;
import com.workouttracker.main.Model.PersonalBestEntry;
import com.workouttracker.main.WorkoutApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;

import java.util.HashMap;
import java.util.Map;

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
    private TableView<PersonalBestEntry> personalBestTable;
    @FXML
    private TableColumn<PersonalBestEntry, String> strengthPRCol;
    @FXML
    private TableColumn<PersonalBestEntry, String> exerciseNameCol;
    @FXML
    private TableColumn<PersonalBestEntry, String> repsPRCol;


    private PersonalBestData mockData(){
        PersonalBestData fakeData = new PersonalBestData();
        for(int i = 1; i < 21; i++){
            String tempName = "Exercise " + i;
            String[] tempData = new String[2];
            int strength = i * 100;
            int reps = i * 5;
            tempData[0] = Integer.toString(strength);
            tempData[1] = Integer.toString(reps);
            fakeData.addPersonalBest(tempName, tempData);
        }
        return fakeData;
    }

    @FXML
    private void initialize(){
        exerciseNameCol.setCellValueFactory(new PropertyValueFactory<>("ExerciseName"));
        strengthPRCol.setCellValueFactory(new PropertyValueFactory<>("StrengthPR"));
        repsPRCol.setCellValueFactory(new PropertyValueFactory<>("RepsPR"));

        pbData = mockData();
        HashMap<String, String[]> data = pbData.getPersonalBest();
        ObservableList<PersonalBestEntry> dataList = FXCollections.observableArrayList();

        for(Map.Entry<String, String[]> entry : data.entrySet()){
            dataList.add(new PersonalBestEntry(entry.getKey(), entry.getValue()[0], entry.getValue()[1]));
        }
        personalBestTable.setItems(dataList);

    }

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
