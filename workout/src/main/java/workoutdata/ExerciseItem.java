package java.workoutdata;

public class ExerciseItem {

    private String exerciseName;
    private float weight;
    private int numberOfSets;
    private float numberOfReps;
    private String trainingGoal;

    public ExerciseItem(String exerciseName, float weight, int numberOfSets, float numberOfReps, String trainingGoal){

        this.exerciseName = exerciseName;
        this.weight = weight;
        this.numberOfSets = numberOfSets;
        this.numberOfReps = numberOfReps;
        this.trainingGoal = trainingGoal;

    }

    // Getters
    public String getExerciseName() {
        return exerciseName;
    }

    public float getNumberOfReps() {
        return numberOfReps;
    }

    public float getWeight() {
        return weight;
    }

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public String getTrainingGoal() {
        return trainingGoal;
    }

    // Setters
    public void setExerciseName(String exerciseName){
        this.exerciseName = exerciseName;
    }

    public void setNumberOfReps(float numberOfReps) {
        this.numberOfReps = numberOfReps;
    }

    public void setNumberOfSets(int numberOfSets){
        this.numberOfSets = numberOfSets;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setTrainingGoal(String trainingGoal){
        this.trainingGoal = trainingGoal;
    }

}