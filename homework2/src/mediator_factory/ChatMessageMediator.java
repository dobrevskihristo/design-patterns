package mediator_factory;

import java.util.ArrayList;
import java.util.List;

public class ChatMessageMediator implements MessageMediator {
    private List<User> users;
    private boolean botAlreadyAdded = false;

    public ChatMessageMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
    	if (message.contains("addBot")) {
    		if (!botAlreadyAdded) {
    			AbstractFactory userFactory = FactoryProducer.getFactory("USER");
    	        User bot1 = userFactory.getUser("BOT", "bot1", this);
    	        addUser(bot1);
    	        botAlreadyAdded = true;
			} else {
		        System.out.println("BOT ALREADY ADDED!");
			}
	        
		} else {
	        for (User u : this.users) {
	            if (u != user) {
	                u.receive(message);
	            }
	        }	
		}
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);

    }

	@Override
	public void removeUser(User user) {
		System.out.println(((ChatUser) user).getName() + " was removed! The word 'cat' is forbidden in this chat!");
		this.users.remove(user);
	}

	@Override
	public User findUser(String name) {
		for (User u : this.users) {
            if (u instanceof ChatUser) {
                if (((ChatUser) u).getName().contentEquals(name)) {
					return u;
				}
            }
        }
		return null;
	}

}
