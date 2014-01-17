package factory;
//  这是一个纽约风味的pizza店，是一个具体的工厂类，用于具体制造具体的产品
public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type.equals("cheese")){
			pizza = new NyStyleCheesePizza();
		}
		if(type.equals("veggie")){
			pizza = new NyStyleVeggiePizza();
		}
		return pizza;
	}

}
