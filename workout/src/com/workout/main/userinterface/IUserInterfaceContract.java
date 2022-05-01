package com.workout.main.userinterface;

import com.workout.main.entities.Exercise;
import com.workout.main.entities.WorkoutEntry;

public interface IUserInterfaceContract {

    interface EventListener{
        void onWorkoutInput();
        void onDialogClick();
    }

    interface View{
        void setListener(IUserInterfaceContract.EventListener listener);
        void updateWorkoutEntry(Exercise exercise);
        void updateWorkoutLogs(WorkoutEntry workoutLogs);
        void showDialog();
        void showError();

    }
}
