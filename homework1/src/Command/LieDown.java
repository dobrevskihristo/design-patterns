package Command;

public class LieDown implements Command{
	
	private TrainingPerson trainingPerson;
	
	public LieDown(TrainingPerson trainingPerson) {
		this.trainingPerson = trainingPerson;
	}
	@Override
	public void execute() {
		trainingPerson.setExercise("Lie Down");
	}
}