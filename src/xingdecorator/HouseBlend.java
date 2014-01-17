package xingdecorator;
// 此类是一种综合咖啡，其继承咖啡类
public class HouseBlend extends Beverage {

	public HouseBlend(){
		Description = "综合咖啡";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
