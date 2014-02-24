package designmodes;

public class DuckSimulator1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuckSimulator1 dSimulator1 = new DuckSimulator1();
		dSimulator1.simulate();
	}
	
//	每一种会呱呱叫的东西都产生一份实例
	void simulate(){
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
//		使用鹅的代码
		Quackable gooseDQuackable = new GooseAdapder(new Goose());
		
		System.out.println("\nDuck Simulator");
		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDQuackable);
	}
	void simulate(Quackable duck){
		duck.quack();
	}
}
