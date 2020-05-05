package Observer;

public class FitnessInstructor {
	TrainingPerson trainingPerson;
	public FitnessInstructor(TrainingPerson trainingPerson)
	{
		this.trainingPerson = trainingPerson;
	}
	public void ChangeExercise(String exercise)
	{
		System.out.println("Exercise was changed!");
		this.trainingPerson.changeExercise(exercise);
	}
}
