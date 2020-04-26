public class EnduranceExercise extends Exercise{
    String equipment;

    public EnduranceExercise(int intensity,
                             int duration,
                             int repetitions,
                             int sets,
                             String equipment) {
        super(intensity, duration, repetitions, sets);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return " Endurance exercise description: You need the following for this exercise: " + equipment + '\n' +
                " Intensity: " + intensity + "% " + '\n' +
                " Duration: " + duration + " minutes "+ '\n' +
                " Repetitions: " + repetitions + '\n' +
                " Sets: " + sets + '\n' + '\n';
    }
}