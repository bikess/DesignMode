package designmodes;

public class DuckSimulator2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator2 dSimulator2 = new DuckSimulator2();
		dSimulator2.simulate();
	}
	
//	每一种会呱呱叫的东西都产生一份实例
	void simulate(){
//		这里采用装饰类来实例化鸭子
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		
//		使用鹅的代码
		Quackable gooseDQuackable = new GooseAdapder(new Goose());
		
		System.out.println("\nDuck Simulator");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDQuackable);
		
//		输出统计的鸭子叫的次数
		System.out.println("the ducks quacked "+QuackCounter.getQuacks()+" times");
	}
	void simulate(Quackable duck){
		duck.quack();
	}
}


