package com.workout.main.userinterface;

public interface IUserInterfaceContract {

    interface EventListener{
        void onWorkoutInput();
        void onDialogClick();
    }

    interface View{
        void setListener(IUserInterfaceContract.EventListener listener);

        void updateWorkoutEntry();

        void updateWorkoutLogs();
        void showDialog();
        void showError();

    }
}
