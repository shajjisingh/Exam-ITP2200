package HomeWorkoutPlan;


public class StrengthExercise extends Exercise{
    public int intensity;
    public int duration;
    public int repetitions;
    public int sets;
    public String equipment;
    public String weights;

    public StrengthExercise(int intensity, int duration, int repetitions, int sets, String equipment, String weights) {

        StrengthExercise PushUps = new StrengthExercise(80, 15, 10, 4, "Training mat", "No weights");
        StrengthExercise DumbbellCurls = new StrengthExercise(60, 10, 10, 3, "Training mat", "2x 5kg Dumbbell");
        StrengthExercise BentOverRow = new StrengthExercise(60, 10, 12, 3, "Training mat", "1x 5kg Dumbbell");
        StrengthExercise SitUps = new StrengthExercise(60, 15, 20, 4, "Training mat", "No weights");
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

     public String getWeights(){
        return weights; }


    @Override
    public void exercise() {
        System.out.println("A strength exercise is any activity that makes your muscles work harder than usual. " +
                "This increases your muscles' strength, size, power and endurance. The activities involve using " +
                "your body weight or working against a resistance.");

    }




}