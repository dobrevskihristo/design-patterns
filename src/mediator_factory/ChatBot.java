package mediator_factory;


public class ChatBot implements User {
	
	private MessageMediator mediator;
	private String name;
	
	public ChatBot(MessageMediator mediator, String name) {
		this.mediator = mediator;
        this.name = name;
        mediator.addUser(this);
    }

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receive(String msg) {
		if (msg.contains("cat")) {
			String[] strings = msg.split(":");
			User userToRemove = mediator.findUser(strings[0]);
			mediator.removeUser(userToRemove);
		} else {
			System.out.println("BOT" + " received from " + msg);
		}
	}
	
	

}
