package Command;

public class Main {
	
	public static void main(String[] args) {
		FitnessInstructor fitnessInstructor = new FitnessInstructor();
		TrainingPerson trainingPerson = new TrainingPerson();
		
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trainingPerson.subscribe(viewer1);
		trainingPerson.subscribe(viewer2);
		trainingPerson.subscribe(viewer3);
		
		Command lieDownCommand = new LieDown(trainingPerson);
		Command getUpCommand = new GetUp(trainingPerson); 
		
		fitnessInstructor.setCommand(lieDownCommand);
		fitnessInstructor.ChangeExercise();
		
		fitnessInstructor.setCommand(getUpCommand);
		fitnessInstructor.ChangeExercise();	
	}
}
