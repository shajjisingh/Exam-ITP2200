package HomeWorkoutPlan;

public class EnduranceExercise extends Exercise{
    public int intensity;
    public int duration;
    public int repetitions;
    public int sets;
    public String equipment;

    public EnduranceExercise(int intensity, int duration, int repetitions, int sets, String equipment) {

        EnduranceExercise Intervals = new EnduranceExercise(80, 32, 4, 4, "Running shoes");
        EnduranceExercise Jogging = new EnduranceExercise(40, 20, 1, 1, "Running shoes");
        EnduranceExercise Biking = new EnduranceExercise(60, 30, 1, 1, "Bike");
        EnduranceExercise Plank = new EnduranceExercise(70, 5, 2, 3, "Training mat");

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
    public void exercise() {
        System.out.println("Also called aerobic exercise, endurance exercise includes activities that " +
                "increase your breathing and heart rate such as walking, jogging and biking and. Endurance activity " +
                "keeps your heart, lungs and circulatory system healthy and improves your overall fitness.");

    }




}