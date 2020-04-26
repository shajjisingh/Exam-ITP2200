package HomeWorkoutPlan;

public class BalanceExercise extends Exercise {
    public int intensity;
    public int duration;
    public int repetitions;
    public int sets;
    public String equipment;


    public BalanceExercise(int intensity, int duration, int repetitions, int sets, String equipment) {

        BalanceExercise Squat = new BalanceExercise( 60, 15, 25, 4, "Training mat");
        BalanceExercise OneLegShoulderPress = new BalanceExercise( 40,  8,  12,  3, "Training mat");
        BalanceExercise SingleLegDeadLift = new BalanceExercise( 40, 8, 12, 3, "Training mat");
        BalanceExercise SidewaysWalking = new BalanceExercise(45, 10, 20, 3, "Training mat");
        BalanceExercise RockTheBoat = new BalanceExercise(30,  10, 10, 3, "Training mat");
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

     public String getEquipment(){
        return equipment;}



    @Override
    public void exercise () {
        System.out.println("Balance training involves doing exercises that strengthen the muscles that help keep " +
                "you upright, including your legs and core. These kinds of exercises can improve stability and " +
                "help prevent falls.");

    }

}