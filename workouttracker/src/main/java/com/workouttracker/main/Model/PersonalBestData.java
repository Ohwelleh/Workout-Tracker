package com.workouttracker.main.Model;

import java.util.HashMap;

public class PersonalBestData {
    private HashMap<String, String[]> personalBest;

    public PersonalBestData(){
        personalBest = new HashMap<String, String[]>();
    }

    public void addPersonalBest(String exerciseName, String[] weight){
        personalBest.put(exerciseName, weight);
    }

    public void updatePersonalBest(String exerciseName, String workoutType, String[] weight){
        // TODO: Find a better way to determine if new value is larger than old value
        if(personalBest.containsKey(exerciseName) && !workoutType.equals("B")){
            String[] updatedData = personalBest.get(exerciseName);
            if(workoutType.equals("S")){
                updatedData[0] = weight[0];
            }else{
                updatedData[1] = weight[0];
            }
            personalBest.put(exerciseName, updatedData);
        }else{
            addPersonalBest(exerciseName, weight);
        }
    }


    // Getter
    public HashMap<String, String[]> getPersonalBest() {
        return personalBest;
    }
}
