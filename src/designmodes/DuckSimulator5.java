package designmodes;

public class DuckSimulator5 {
	public static void main(String[] args){
		DuckSimulator5 simulator5 = new DuckSimulator5();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator5.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		// TODO Auto-generated method stub
//		创建鸭子和鸭子工厂
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
		
//		建立这个鸭群的观察者
		System.out.println("\nDuck Simulator: with Observer");
		Observer quackologist = new Quackologist();
		
		Quackable mQuackable = duckFactory.createMallardDuck();
		
		mQuackable.registerObserver(quackologist);
		
		simulate(mQuackable);
		
		floackofDucks.registerObserver(quackologist);
		//测试一整群鸭子
		simulate(floackofDucks);

	}
	void simulate(Quackable duck){
		duck.quack();
	}
}
