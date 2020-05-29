package mediator_factory;

public class Main {
	
	public static void main(String[] args) {
		
		MessageMediator mediator = new ChatMessageMediator();
		AbstractFactory userFactory = FactoryProducer.getFactory("USER");
		User user1 = userFactory.getUser("USER", "user1", mediator);
		User user2 = userFactory.getUser("USER", "user2", mediator);
		User user3 = userFactory.getUser("USER", "user3", mediator);
		
		user3.send("cat");
		user1.send("Hi all!");
		user2.send("addBot");
		user3.send("Hi all!");
		user1.send("addBot");
		user3.send("cat");
	}
}
