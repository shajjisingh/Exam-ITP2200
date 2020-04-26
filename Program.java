import java.util.*;

public class Program implements Comparable {
	private List<Exercise> exercises = new ArrayList<>();
	private final int numOfTotalExercises = 4;
	private float duration = 0.0f;
	private float intensityLevel = 0.0f;
	private List<String> preferredExercise = new ArrayList<>();
	private int highestIntensity = 0;
	private boolean balanced = false;
	public Program(List<String> preferredExercise, int intensity) {
		this.preferredExercise = preferredExercise;
		this.intensityLevel = intensity;
		this.getAppropriateExercise();
		this.sortExercises();
	}
	public Program(String preferredExercise[], int intensity) {
		this.preferredExercise = Array.asList(preferredExercise);
		this.intensityLevel = intensity;
		this.getAppropriateExercise();
		this.sortExercises();
	}
	private void getAppropriateExercise() {
		for (Exercise e : this.preferredExercise) {
			switch (e.toLowerCase()) {
				case "strength":
				case "strengthexercise":
				case "strength exercise":
				{
					Exercise strengthExercise = new StrengthExercise();
					if (strengthExercise.intensity > this.intensityLevel / 1.10 && strengthExercise.intensity < this.intensityLevel * 1.10) {
						exercises.add(strengthExercise);
						this.duration += strengthExercise.duration;
						if (strengthExercise.intensity > this.highestIntensity) this.highestIntensity = strengthExercise.intensity;
					}
					break;
				}
				case "endurance":
				case "enduranceexercise":
				case "endurance exercise":
				{
					Exercise enduranceExercise = new EnduranceExercise();
					if (enduranceExercise.intensity > this.intensityLevel / 1.10 && enduranceExercise.intensity < this.intensityLevel * 1.10) {
						exercises.add(enduranceExercise);
						this.duration += enduranceExercise.duration;
						if (enduranceExercise.intensity > this.highestIntensity) this.highestIntensity = enduranceExercise.intensity;
					}
					break;
				}
				case "flexibility":
				case "flexibilityexercise":
				case "flexibility exercise":
				{
					Exercise flexibilityExercise = new FlexibilityExercise();
					if (flexibilityExercise.intensity > this.intensityLevel / 1.10 && flexibilityExercise.intensity < this.intensityLevel * 1.10) {
						exercises.add(flexibilityExercise);
						this.duration += flexibilityExercise.duration;
						if (flexibilityExercise.intensity > this.highestIntensity) this.highestIntensity = flexibilityExercise.intensity;
					}
					break;
				}
				case "balance":
				case "balanceexercise":
				case "balance exercise":
				{
					Exercise balanceExercise = new BalanceExercise();
					if (balanceExercise.intensity > this.intensityLevel / 1.10 && balanceExercise.intensity < this.intensityLevel * 1.10) {
						exercises.add(balanceExercise);
						this.duration += balanceExercise.duration;
						if (balanceExercise.intensity > this.highestIntensity) this.highestIntensity = balanceExercise.intensity;
					}
					break;
				}
			}
			return this.exercises;
		}
	}

	@Override
	public int compareTo(Exercise other) {
		int compare = ((Exercise) other).intensity;
		return this.intensity - compare;
	}

	private void sortExercises() {
		Collections.sort(this.exercises);
		List<String> className = new ArrayList<>();
		this.exercises.forEach(e -> {
			if (className.size() == 0) className.add(e.getClass().toString());
			else if (className.indexOf(e.getClass().toString()) != -1) continue;
			else className.add(e.getClass().toString());
		});
		if (className.size() == this.numOfTotalExercises) this.balanced = true;
	}
	public float getIntensityLevel() {
		return this.intensityLevel;
	}
}
