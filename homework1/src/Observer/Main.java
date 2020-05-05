package Observer;

public class Main {
	
	public static void main(String[] args) {
		TrainingPerson trainingPerson = new TrainingPerson();
		FitnessInstructor fitnessInstructor = new FitnessInstructor(trainingPerson);
		Observer viewer1 = new Viewer();
		Observer viewer2 = new Viewer();
		Observer viewer3 = new Viewer();
		
		trainingPerson.subscribe(viewer1);
		trainingPerson.subscribe(viewer2);
		trainingPerson.subscribe(viewer3);
		
		fitnessInstructor.ChangeExercise("Lie Down");
		
		fitnessInstructor.ChangeExercise("Get Up");
	}
}
