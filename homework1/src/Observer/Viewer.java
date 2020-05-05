package Observer;

public class Viewer implements Observer{
	
	private String exercise;
	private Observable trainingPerson;
	
	public Viewer() {}
	
	public String getExercise() {
		return this.exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}
	
	@Override
	public void update() {
		if(trainingPerson != null) {
			exercise = trainingPerson.getUpdate();
			System.out.println("Viewer changed exercise to "+ this.exercise);
		}
	}

	@Override
	public void setTrainingPerson(Observable trainingPerson) {
		this.trainingPerson = trainingPerson;
	}

}
