package designmodes;

public class DuckSimulator4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator4 simulator4 = new DuckSimulator4();
		AbstractDuckFactory factory = new CountingDuckFactory();
		simulator4.simulate(factory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		// TODO Auto-generated method stub
		Quackable redheadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapder(new Goose());
		System.out.println("\nDuck Simlulator4: with Composite - Flocks");
//		创建一个鸭子的主群
		Floack floackofDucks = new Floack();
		floackofDucks.add(redheadDuck);
		floackofDucks.add(duckCall);
		floackofDucks.add(rubberDuck);
		floackofDucks.add(gooseDuck);
//		创建一个鸭子的绿头鸭群
		Floack floackMallards = new Floack();
		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();
//		将所有的绿头鸭子加入绿头鸭群
		floackMallards.add(mallardOne);
		floackMallards.add(mallardTwo);
		floackMallards.add(mallardThree);
		floackMallards.add(mallardFour);
//		将绿头鸭群加入到主群中	
		floackofDucks.add(floackMallards);
		System.out.println("\n Duck Simulator:Whole Flock Simulation");
//		测试一整群鸭子
		simulate(floackofDucks);
		System.out.println("\n Duck Simulator:Mallard Flock Simulation");
//		测试绿头鸭群
		simulate(floackMallards);
		
		System.out.println("\n The ducks quacked"+QuackCounter.getQuacks()+" times");
	}
	public void simulate(Quackable quacker){
		quacker.quack();
	}
}
