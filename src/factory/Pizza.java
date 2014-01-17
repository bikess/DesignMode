package factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<Pizza> toppings = new ArrayList<>();
	
	public void prepare(){
		System.out.println("preparing"+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i =0;i<toppings.size();i++){
			System.out.println(" "+toppings.get(i));
		}
	}
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut(){
		System.out.println("cutting the pizza into diagonal slices");
	}
	public void box(){
		System.out.println("place pizza in official pizzastore box");
	}
	public String getName(){
		return name;
	}
}