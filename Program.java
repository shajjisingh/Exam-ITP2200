package HomeWorkoutPlan;

public class Program{

    Program ProgramOne = new Program();
    Program ProgramTwo = new Program();
    Program ProgramTree = new Program();
    Program ProgramFour = new Program();


    //fields
    private Exercise[] exercises;
    private int duration;
    private int intensityLevel;
    private String balanced;
    private String category;


//getters and setters

    public Exercise[] getExercises() {
        return exercises;
    }

    public void setExercises(Exercise[] exercises) {
        this.exercises = exercises;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) { this.duration = duration*2; }

    public int getIntensityLevel() {
        return intensityLevel;
    }

    public void setIntensityLevel(int intensityLevel) {
        this.intensityLevel = intensityLevel;
    }

    public void setCategory(String category) {

        if (category == category) {

            this.category = balanced;

        } else {

            throw new IllegalArgumentException("This program is not balanced");
        }


    };


}


