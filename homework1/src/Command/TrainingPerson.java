package Command;

import java.util.ArrayList;
import java.util.List;

public class TrainingPerson {
	
	private String exercise;
	private List<Viewer> viewers = new ArrayList<Viewer>();
	
	public void setExercise(String exercise)
	{
		this.exercise = exercise;
		System.out.println("Training person changed exercise to "+ this.exercise);
		for(Viewer viewer: this.viewers) {
			viewer.setExercise(this.exercise);
		}		
	}
	
	public void subscribe(Viewer viewer) {
		this.viewers.add(viewer);		
	}
}
