package HomeWorkoutPlan;

public class FlexibilityExercise extends Exercise{
    public int intensity;
    public int duration;
    public int repetitions;
    public int sets;
    public String requirements = "Stretches should be held until a mild discomfort is felt in muscle or joint";

    public FlexibilityExercise(int intensity, int duration, int repetitions, int sets, String requirements) {

        FlexibilityExercise ForwardLunges = new FlexibilityExercise( 20, 10, 25, 5, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise SeatedHeadTowardKneeStretch = new FlexibilityExercise( 35,  10,  15,  4, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise FrogStretch = new FlexibilityExercise( 40, 10, 15, 3, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise LungingHipForwardStretch = new FlexibilityExercise(40, 10, 15, 4, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise SideLunges = new FlexibilityExercise(20,  7, 25, 3, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise SeatStraddleLotus = new FlexibilityExercise(20,  7, 15, 3, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise StandingHamstringStretch = new FlexibilityExercise(20,  10, 15, 3, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise TricepsStretch = new FlexibilityExercise(30,  12, 20, 3, "Stretches should be held until a mild discomfort is felt in muscle or joint");
        FlexibilityExercise KneesToChest = new FlexibilityExercise(15,  10, 20, 3, "Stretches should be held until a mild discomfort is felt in muscle or joint");
    }

    //getter

    public int getIntensity(){
        return intensity;}

    public int getDuration(){
        return duration;}

    public int getRepetitions(){
        return repetitions;}

    public int getSets(){
        return sets;}

    public String getRequirements(){
        return requirements;}

    @Override
    public void exercise() {
        System.out.println("Flexibility is the range of motion in a joint or group of joints or the ability " +
                "to move joints effectively through a complete range of motion. Flexibility training includes " +
                "stretching exercises to lengthen the muscles and may include activities like yoga.");

    }




}