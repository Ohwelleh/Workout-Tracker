package com.workout.main;

import com.workout.main.userinterface.IUserInterfaceContract;
import com.workout.main.userinterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkoutApplication extends Application{

    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws IOException{

        uiImpl = new UserInterfaceImpl(primaryStage);

        // TODO: This commented out code will be used for loading in previous data.
//        try{
//
//            WorkoutBuildLogic.build(uiImpl);
//
//        } catch (IOException e){
//
//            e.printStackTrace();
//            throw e;
//        }
    }

    public static void main(String[] args){
        launch(args);
    }
}
