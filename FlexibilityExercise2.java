public class FlexibilityExercise extends Exercise{
    String requirement;

    public FlexibilityExercise(int intensity,
                               int duration,
                               int repetitions,
                               int sets,
                               String requirement) {
        super(intensity, duration, repetitions, sets);
        this.requirement = requirement;
    }

    @Override
    public String toString() {
        return " Flexibility exercise description: You need the following for this exercise: " + requirement + '\n' +
                " Intensity: " + intensity + "% " + '\n' +
                " Duration: " + duration + " minutes " + '\n' +
                " Repetitions: " + repetitions + '\n' +
                " Sets: " + sets + '\n' + '\n';
    }

}
