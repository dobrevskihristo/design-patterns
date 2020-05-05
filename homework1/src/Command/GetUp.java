package Command;

public class GetUp implements Command{
	
	private TrainingPerson trainingPerson;
	
	public GetUp(TrainingPerson trainingPerson) {
		this.trainingPerson = trainingPerson;
	}
	@Override
	public void execute() {
		trainingPerson.setExercise("Get Up");
	}
}
