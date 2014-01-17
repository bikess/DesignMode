package xingdecorator;
// 此类是一种浓缩咖啡，其继承咖啡类。
public class Espresso extends Beverage {

	public Espresso(){
		Description = "浓缩咖啡";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
