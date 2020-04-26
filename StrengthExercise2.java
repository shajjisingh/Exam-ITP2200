public class StrengthExercise extends Exercise {
    int weights;
    String equipment;

    public StrengthExercise(int intensity,
                            int duration,
                            int repetitions,
                            int sets,
                            int weights,
                            String equipment) {
        super(intensity, duration, repetitions, sets);
        this.weights = weights;
        this.equipment = equipment;
    }
    @Override
    public String toString() {
        return " Strength exercise description: You need the following for this exercise: " + weights + " kg " + equipment + '\n' +
                " Intensity: " + intensity + "% " + '\n' +
                " Duration: " + duration + " minutes "+ '\n' +
                " Repetitions: " + repetitions + '\n' +
                " Sets: " + sets + '\n' + '\n';
    }
}