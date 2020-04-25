package HomeWorkoutPlan;

import javax.swing.*;

public class Exercise {

    //fields
    public static void main(String[] args){

        Exercise PushUps = new Exercise();

        Exercise Intervals = new Exercise();

        Exercise Squat = new Exercise();

        Exercise ForwardLunges = new Exercise();

        Exercise DumbbellCurls = new Exercise();

        Exercise OneLegShoulderPress = new Exercise();

        Exercise SingleLegDeadLift = new Exercise();

        Exercise BentOverRow = new Exercise();

        Exercise Jogging = new Exercise();

        Exercise SeatedHeadTowardKneeStretch = new Exercise();

        Exercise SidewaysWalking = new Exercise();

        Exercise Biking = new Exercise();

        Exercise FrogStretch = new Exercise();

        Exercise LungingHipForwardStretch = new Exercise();

        Exercise Plank = new Exercise();

        Exercise SideLunges = new Exercise();

        Exercise SeatStraddleLotus = new Exercise();

        Exercise StandingHamstringStretch = new Exercise();

        Exercise TricepsStretch = new Exercise();

        Exercise SitUps = new Exercise();

        Exercise KneesToChest = new Exercise();

        Exercise RockTheBoat = new Exercise();

        PushUps.intensity = 100;
        PushUps.duration = 10;
        PushUps.repetitions = 12;
        PushUps.sets = 3;
        PushUps.equipment = "Training mat";
        PushUps.weights = "";
        PushUps.category = "StrengthExercise";
        System.out.println("Push ups, intensity: " + PushUps.intensity + " , duration: " + PushUps.duration + " , repetitions: " + PushUps.repetitions + ", sets: " + PushUps.sets + " , equipment" + PushUps.equipment + " , weights: " + PushUps.weights + " , category: " + PushUps.category);

        Intervals.intensity = 80;
        Intervals.duration = 32;
        Intervals.repetitions = 4;
        Intervals.sets = 4;
        Intervals.equipment = "Running shoes";
        Intervals.weights = "";
        Intervals.category = "Endurance";

        Squat.intensity = 60;
        Squat.duration = 15;
        Squat.repetitions = 25;
        Squat.sets = 4;
        Squat.equipment = "Training mat";
        Squat.weights = "";
        Squat.category = "Balance";

        ForwardLunges.intensity = 20;
        ForwardLunges.duration = 10;
        ForwardLunges.repetitions = 25;
        ForwardLunges.sets = 5;
        ForwardLunges.equipment = "Training mat";
        ForwardLunges.weights = "2x dumbbells";
        ForwardLunges.category = "Flexibility";

        DumbbellCurls.intensity = 60;
        DumbbellCurls.duration = 10;
        DumbbellCurls.repetitions = 10;
        DumbbellCurls.sets = 3;
        DumbbellCurls.equipment = "Training mat";
        DumbbellCurls.weights = "10kg dumbbell";
        DumbbellCurls.category = "Strength";

        OneLegShoulderPress.intensity = 40;
        OneLegShoulderPress.duration = 8;
        OneLegShoulderPress.repetitions = 12;
        OneLegShoulderPress.sets = 3;
        OneLegShoulderPress.equipment = "Training mat";
        OneLegShoulderPress.weights = "5kg dumbbell";
        OneLegShoulderPress.category = "Balance";

        SingleLegDeadLift.intensity = 40;
        SingleLegDeadLift.duration = 8;
        SingleLegDeadLift.repetitions = 12;
        SingleLegDeadLift.sets = 3;
        SingleLegDeadLift.equipment = "Training mat";
        SingleLegDeadLift.weights = "";
        SingleLegDeadLift.category = "Balance";

        BentOverRow.intensity = 65;
        BentOverRow.duration = 10;
        BentOverRow.repetitions = 12;
        BentOverRow.sets = 3;
        BentOverRow.equipment = "Training mat";
        BentOverRow.weights = "5kg dumbbell";
        BentOverRow.category = "Strength";

        Jogging.intensity = 40;
        Jogging.duration = 20;
        Jogging.repetitions = 1;
        Jogging.sets = 1;
        Jogging.equipment = "Running shoes";
        Jogging.weights = "";
        Jogging.category = "Endurance";

        SeatedHeadTowardKneeStretch.intensity = 35;
        SeatedHeadTowardKneeStretch.duration = 10;
        SeatedHeadTowardKneeStretch.repetitions = 15;
        SeatedHeadTowardKneeStretch.sets = 5;
        SeatedHeadTowardKneeStretch.equipment = "Training mat";
        SeatedHeadTowardKneeStretch.weights = "";
        SeatedHeadTowardKneeStretch.category = "Flexibility";

        SidewaysWalking.intensity = 45;
        SidewaysWalking.duration = 10;
        SidewaysWalking.repetitions = 20;
        SidewaysWalking.sets = 3;
        SidewaysWalking.equipment = "";
        SidewaysWalking.weights = "";
        SidewaysWalking.category = "Balance";

        Biking.intensity = 60;
        Biking.duration = 30;
        Biking.repetitions = 0;
        Biking.sets = 0;
        Biking.equipment = "Bike";
        Biking.weights = "";
        Biking.category = "Endurance";

        FrogStretch.intensity = 40;
        FrogStretch.duration = 10;
        FrogStretch.repetitions = 15;
        FrogStretch.sets = 3;
        FrogStretch.equipment = "Training mat";
        FrogStretch.weights = "";
        FrogStretch.category = "Flexibility";

        LungingHipForwardStretch.intensity = 40;
        LungingHipForwardStretch.duration = 10;
        LungingHipForwardStretch.repetitions = 15;
        LungingHipForwardStretch.sets = 4;
        LungingHipForwardStretch.equipment = "Training mat";
        LungingHipForwardStretch.weights = "";
        LungingHipForwardStretch.category = "Flexibility";

        Plank.intensity = 70;
        Plank.duration = 5;
        Plank.repetitions = 1;
        Plank.sets = 3;
        Plank.equipment = "Training mat";
        Plank.weights = "";
        Plank.category = "Endurance";

        SideLunges.intensity = 20;
        SideLunges.duration = 5;
        SideLunges.repetitions = 25;
        SideLunges.sets = 3;
        SideLunges.equipment = "Training mat";
        SideLunges.weights = "";
        SideLunges.category = "Flexibility";

        SeatStraddleLotus.intensity = 20;
        SeatStraddleLotus.duration = 7;
        SeatStraddleLotus.repetitions = 15;
        SeatStraddleLotus.sets = 3;
        SeatStraddleLotus.equipment = "Training mat";
        SeatStraddleLotus.weights = "";
        SeatStraddleLotus.category = "Flexibility";

        StandingHamstringStretch.intensity = 20;
        StandingHamstringStretch.duration = 10;
        StandingHamstringStretch.repetitions = 15;
        StandingHamstringStretch.sets = 3;
        StandingHamstringStretch.equipment = "Training mat";
        StandingHamstringStretch.weights = "";
        StandingHamstringStretch.category = "Flexibility";

        TricepsStretch.intensity = 30;
        TricepsStretch.duration = 12;
        TricepsStretch.repetitions = 20;
        TricepsStretch.sets = 3;
        TricepsStretch.equipment = "Training mat";
        TricepsStretch.weights = "";
        TricepsStretch.category = "Flexibility";

        SitUps.intensity = 60;
        SitUps.duration = 15;
        SitUps.repetitions = 15;
        SitUps.sets = 4;
        SitUps.equipment = "Training mat";
        SitUps.weights = "";
        SitUps.category = "Strength";

        KneesToChest.intensity = 15;
        KneesToChest.duration = 10;
        KneesToChest.repetitions = 20;
        KneesToChest.sets = 3;
        KneesToChest.equipment = "Training mat";
        KneesToChest.weights = "";
        KneesToChest.category = "Flexibility";

        RockTheBoat.intensity = 30;
        RockTheBoat.duration = 10;
        RockTheBoat.repetitions = 10;
        RockTheBoat.sets = 3;
        RockTheBoat.equipment = "Training mat";
        RockTheBoat.weights = "";
        RockTheBoat.category = "BalanceExercise";


    }

    private int intensity;
    private int duration;
    private int repetitions;
    private int sets;
    private String equipment;
    private String weights;
    private String category;





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

    public String getEquipment() {
        return equipment;
    }

    public String getWeights() {
        return weights;
    }


};