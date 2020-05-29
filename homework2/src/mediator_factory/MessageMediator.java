package mediator_factory;

public interface MessageMediator {
	
	void sendMessage(String message, User user);
    void addUser(User user);
    void removeUser(User user);
    User findUser(String name);

}
