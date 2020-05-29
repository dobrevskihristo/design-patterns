package mediator_factory;

public abstract class AbstractFactory {
	
	abstract User getUser(String user, String name, MessageMediator med);
}
