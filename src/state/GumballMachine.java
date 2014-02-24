package state;

public class GumballMachine {
	State soldOutState;  //糖果售完状态
	State noQuarterState; //没有投入25分钱状态
	State hasQuarterState;//投入25分钱状态
	State soldState;//销售糖果状态
	
//	当前状态,开始被设置为糖果手挽状态
	State state = soldOutState;
//	记录糖果数，开始时候机器没有糖果
	int count = 0;
//	初始化糖果机
	public GumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = numberGumballs;
		if(numberGumballs>0){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
//	通过此方法进行状态的切换
	public void setState(State state){
		this.state = state;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}

	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count!=0){
			count--;
		}
	}
}
