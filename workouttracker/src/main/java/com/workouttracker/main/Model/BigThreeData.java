package com.workouttracker.main.Model;

import java.util.HashMap;

public class BigThreeData {

    private HashMap<String, String> benchPress;
    private HashMap<String, String> squats;
    private HashMap<String, String> deadlift;

    public BigThreeData(){
        benchPress = new HashMap<String, String>();
        squats = new HashMap<String, String>();
        deadlift = new HashMap<String, String>();
    }

    // Insertion
    public void addBenchEntry(String date, String weight){
        if(benchPress.containsKey(date)){
            benchPress.replace(date, weight);
        }else{
            benchPress.put(date, weight);
        }
    }

    public void addSquatEntry(String date, String weight){
        if(squats.containsKey(date)){
            squats.replace(date, weight);
        }else{
            squats.put(date, weight);
        }
    }

    public void addDeadliftEntry(String date, String weight){
        if(deadlift.containsKey(date)){
            deadlift.replace(date, weight);
        }else{
            deadlift.put(date, weight);
        }
    }

    // Deletions
    public void removeBenchEntry(String date){
        benchPress.remove(date);
    }
    public void removeSquatEntry(String date){
        squats.remove(date);
    }
    public void removeDeadliftEntry(String date){
        deadlift.remove(date);
    }

    // Getters
    public HashMap<String, String> getBenchPress() {
        return benchPress;
    }

    public HashMap<String, String> getSquats() {
        return squats;
    }

    public HashMap<String, String> getDeadlift() {
        return deadlift;
    }
}
