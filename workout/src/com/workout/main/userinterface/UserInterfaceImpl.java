package com.workout.main.userinterface;

import com.workout.main.entities.Exercise;
import com.workout.main.entities.WorkoutEntry;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;


import java.awt.event.KeyEvent;

//public class UserInterfaceImpl implements  IUserInterfaceContract.View, EventHandler<KeyEvent> {
public class UserInterfaceImpl implements  IUserInterfaceContract.View {

    private final Stage stage;
    private final Group root;

    private IUserInterfaceContract.EventListener listener;

    // Size of the window
    private static final double WINDOW_Y = 832;
    private static final double WINDOW_X = 968;

    private static final Color WINDOW_BACKGROUND_COLOR = Color.rgb(76, 76, 82);
    private static final String WORKOUT_TITLE = "Workout Tracker";


    public UserInterfaceImpl(Stage stage){
        this.stage = stage;
        this.root = new Group();
        initializeUserInterface();
    }

    public void initializeUserInterface(){
        stage.setTitle(WORKOUT_TITLE);
        drawBackground(root);
        drawTabs(root);
        stage.show();
    }

    /**
     * Background of the primary window
     * @param root
     */
    private void drawBackground(Group root){
        Scene scene = new Scene(root, WINDOW_X, WINDOW_Y);
        scene.setFill(WINDOW_BACKGROUND_COLOR);
        stage.setScene(scene);
    }

    /**
     * Add tabs to the screen
     * @param root
     */
    private void drawTabs(Group root){
        TabPane tabPane = new TabPane();

        double tabMinWidths = (WINDOW_X - 60) / 3;

        tabPane.setTabMinWidth(tabMinWidths);

        // This stops the user from being able to close any of the tabs
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        // Creating each tab
        Tab workLogs = new Tab("Workout Logs", drawWorkoutsPane());
        Tab bigLifts = new Tab("Big 3 Graphs", drawBigThreePane());
        Tab pbLifts = new Tab("Personal Bests", drawPBPane());

        // Adding each tab
        tabPane.getTabs().add(workLogs);
        tabPane.getTabs().add(bigLifts);
        tabPane.getTabs().add(pbLifts);

        root.getChildren().add(tabPane);
    }

    private Pane drawPBPane(){
        Pane buttonPane = new Pane();
        buttonPane.setPrefSize(WINDOW_X, WINDOW_Y);
        buttonPane.setStyle("-fx-background-color: grey");
        Button pbBtn = new Button("PB");

        pbBtn.setTranslateX(240);
        pbBtn.setTranslateY(200);

        buttonPane.getChildren().add(pbBtn);

        return buttonPane;
    }
    private Pane drawBigThreePane(){
        Pane buttonPane = new Pane();
        buttonPane.setPrefSize(WINDOW_X, WINDOW_Y);
        buttonPane.setStyle("-fx-background-color: red");
        Button bigBtn = new Button("Big Three");

        bigBtn.setTranslateX(440);
        bigBtn.setTranslateY(200);

        buttonPane.getChildren().add(bigBtn);

        return buttonPane;
    }
    private Pane drawWorkoutsPane(){
        Pane buttonPane = new Pane();
        buttonPane.setPrefSize(WINDOW_X, WINDOW_Y);
        buttonPane.setStyle("-fx-background-color: blue");
        Button workoutBtn = new Button("Workout Logs");

        workoutBtn.setTranslateX(440);
        workoutBtn.setTranslateY(300);

        buttonPane.getChildren().add(workoutBtn);

        return buttonPane;
    }


    // Methods from IUserinterfaceContract
    @Override
    public void setListener(IUserInterfaceContract.EventListener listener) {
        this.listener = listener;
    }

    @Override
    public void updateWorkoutEntry(Exercise exercise) {

    }

    @Override
    public void updateWorkoutLogs(WorkoutEntry workoutLogs) {

    }

    @Override
    public void showDialog() {

    }

    @Override
    public void showError() {

    }

//    @Override
//    public void handle(KeyEvent keyEvent) {
//
//    }
}
