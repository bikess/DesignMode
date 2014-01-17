package xingdecorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		要一杯浓缩咖啡，不要任何调料
		Beverage beverage1 = new Espresso();
		System.out.println(beverage1.getDescription()+"$"+beverage1.cost());

//		我要浓缩咖啡加豆奶加奶泡多少钱呢/
//		制造一个Espresso对象
		Beverage beverage2 = new Espresso();
//		用Soy进行装饰
		beverage2 = new Soy(beverage2);
//		再用Whip进行装饰
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()+"$"+beverage2.cost());
		
		
		Beverage beverage3 = new Whip(new Soy(new Espresso()));
		System.out.println(beverage3.getDescription()+"$"+beverage3.cost());
		
//		我要加豆奶，加双份摩卡，加奶泡的综合咖啡
		Beverage beverage4 = new Whip(
				new Mocha(
						new Mocha(
								new Soy(
										new HouseBlend()))));
	}

}
