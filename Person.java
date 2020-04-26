package HomeWorkoutPlan;

import java.util.ArrayList;
import java.util.List;

public class Person {

    List<Program> programs = new ArrayList<Program>();



    //fields

    private Exercise preferredExercise;

    private int acceptableIntensity;

    Program currentProgram;


    //getters and setters

    public Exercise getPreferredExercise() {
        return preferredExercise;
    }

    public void setPreferredExercise(Exercise preferredExercise) {
        this.preferredExercise = preferredExercise;
    }


    public int getAcceptableIntensity() {
        return acceptableIntensity;
    }

    public void setAcceptableIntensity(int acceptableIntensity) {
        this.acceptableIntensity = acceptableIntensity;
    }


    public Program getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(Program currentProgram) {
        this.currentProgram = currentProgram;
    }


    //methods


    public void suggestProgram() {


        List<Program> suggestions = new ArrayList<Program>();

        for (Program program : programs) {

            if(program.getIntensityLevel()*90 < program.getIntensityLevel()*100 || 	program.getIntensityLevel()*100 > program.getIntensityLevel()*110) {

                suggestions.add(program);

            }

        }

        System.out.println(suggestions);

    }


}





