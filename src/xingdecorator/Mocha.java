package xingdecorator;

// 此类是一种调料，用于装饰咖啡，其继承子咖啡装饰类的抽象类，其必须要持有一个 Beverage类的对象，用于对
// 传递过来的咖啡进行装饰
public class Mocha extends CondimentDecorator {
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.Description+",加摩卡";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.20;
	}

}
