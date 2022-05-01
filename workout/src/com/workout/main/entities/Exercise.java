package com.workout.main.entities;

public class Exercise {
    private String name;
    private double weight;
    private int totalSets;
    private double totalReps;
    private String trainingGoal;

    public Exercise(String name, double weight, int totalSets, double totalReps, String trainingGoal){
        this.name = name;
        this.weight = weight;
        this.totalReps = totalReps;
        this.totalSets = totalSets;
        this.trainingGoal = trainingGoal;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTotalSets(int totalSets) {
        this.totalSets = totalSets;
    }

    public void setTotalReps(double totalReps) {
        this.totalReps = totalReps;
    }

    public void setTrainingGoal(String trainingGoal) {
        this.trainingGoal = trainingGoal;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getTotalSets() {
        return totalSets;
    }

    public double getTotalReps() {
        return totalReps;
    }

    public String getTrainingGoal() {
        return trainingGoal;
    }
}
