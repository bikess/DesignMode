package state;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("you can't insert another quarter");
	}
//  退出顾客的25分钱，并进行状态切换
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter  returened");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

//	当曲柄被转动时，我们就调用它的setState()方法，并传入SoldState对象作为参数，将机器的状态
//	转换到SoldState状态。这个SoldState对象可以通过getSoldState()方法取得
	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("you turned");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}

}
