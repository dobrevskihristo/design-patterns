package mediator_factory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equals("USER")) {
			return new UserFactory();
		}
		
		System.out.println("Unknown factory type");
		return null;
	}

}
