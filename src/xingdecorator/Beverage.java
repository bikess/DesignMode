package xingdecorator;
// 这是一个抽象类，是装饰者和被装饰者都要实现的类，同时每一个装换者都要只有一个此类的一个对象，以便进行
// 对象之间的组合,这个抽象类，也可以用接口来实现的！！
public abstract class Beverage {
	String Description = "未知咖啡";
//	返回咖啡的描述在这已经实现，但是必须要在子类中进行重写实现
	public String getDescription(){
		return Description;
	}
	public abstract double cost();
}
