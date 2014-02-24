package state;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine machine){
		this.gumballMachine = machine;
	}
	@Override
//	若有人投入了25分钱，我们就打印出一条消息，说我们可以接受25分钱，然后改变机器的状态到HasQuarterState
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you inserted a quarter");
//		状态切换到有25分钱状态
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you haven't inserted aquarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned ,but there is no quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("you need to pay first");
	}

}
