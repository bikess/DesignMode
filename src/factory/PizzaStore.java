package factory;
// 此类是一个抽象工厂类，用于创建各种的pizza，创建各种的产品
public abstract class PizzaStore {
	
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
		return pizza;
	}
// Pizzza创建的抽象方法，子类实现这个方法，用来创建具体的Pizza
	public abstract Pizza createPizza(String type);
}
