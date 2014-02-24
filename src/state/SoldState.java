package state;

public class SoldState implements State {

	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("please wait,we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("sorry,you already turned the crank");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("turning twice doesn't get your another gumball");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if(gumballMachine.getCount()>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("0 ops, out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
