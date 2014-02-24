package designmodes;

public class DuckSimulator3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator3 simulator3 = new DuckSimulator3();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		
		simulator3.simulate(duckFactory);
	}

	public void simulate(AbstractDuckFactory duckFactory) {
		// TODO Auto-generated method stub
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable goose = new GooseAdapder(new Goose());
		System.out.println("\n Duck Simulator:with Abstract Factory");
		
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);
		
		System.out.println("The ducks quacked"+QuackCounter.getQuacks()+"times");
	}
	void simulate(Quackable duck){
		duck.quack();
	}
}
