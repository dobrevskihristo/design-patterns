package Command;

public class FitnessInstructor {
	private Command command;	

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void ChangeExercise() {
		System.out.println("Exercise was changed!");
		this.command.execute();
	}
}
