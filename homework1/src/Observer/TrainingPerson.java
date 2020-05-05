package Observer;

import java.util.ArrayList;
import java.util.List;

public class TrainingPerson implements Observable{
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String exercise;

	public void changeExercise(String exercise) {
		this.exercise = exercise;
		System.out.println("Training person changed exercise to "+ this.exercise);
		this.notifyObservers();
	}

	@Override
	public void subscribe(Observer observer) {
		observer.setTrainingPerson(this);
		this.observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return exercise;
	}

}
