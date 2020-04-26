package HomeWorkoutPlan;

import javax.swing.*;

public class Exercise {

    //fields

    private int intensity;
    private int duration;
    private int repetitions;
    private int sets;




    //setters

    public void setIntensity(int intensity) {

        if (intensity > 0) {

            this.intensity = intensity;

        } else {

            throw new IllegalArgumentException("not valid");
        }


    };

    public void setDuration(int duration) {

        if (duration > 0) {

            this.duration = duration*2;

        } else {

            throw new IllegalArgumentException("not valid");
        }

    };

    public void setRepetitions(int repetitions) {

        if (repetitions > 0) {

            this.repetitions = repetitions;

        } else {

            throw new IllegalArgumentException("not valid");
        }


    };

    public void setSets(int sets) {

        if (sets > 0) {

            this.sets = sets;
        } else {
            throw new IllegalArgumentException("not valid");
        }

    };


    //getters

    public int getIntensity() {
        return intensity;
    }

    public int getDuration() {
        return duration;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public int getSets() {
        return sets;
    }


};