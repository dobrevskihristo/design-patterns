package mediator_factory;

public class UserFactory extends AbstractFactory {

	@Override
	User getUser(String user, String name, MessageMediator med) {
		if(user.equals("USER")) {
			return new ChatUser(med, name);
		}
		
		if(user.equals("BOT")) {
			return new ChatBot(med, name);
		}
		
		return null;
	}

}
