package mediator_factory;

public class ChatUser implements User {
	
	private MessageMediator mediator;
	private String name;

    public String getName() {
		return name;
	}

	public ChatUser(MessageMediator mediator, String name) {
    	this.mediator = mediator;
        this.name = name;
        mediator.addUser(this);
    }

	@Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        message = this.name + ": " + message;
        mediator.sendMessage(message, this);

    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " received from " + message);
    }

	

}
