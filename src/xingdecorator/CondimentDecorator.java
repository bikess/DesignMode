package xingdecorator;
// 这是所有装饰者的抽象类，其必须要继承咖啡类，即与被装饰者共同继承的类。下面所有的装饰者都要继承这个类
public abstract class CondimentDecorator extends Beverage {
//	所有的继承的装饰者类，必须重写这个方法
	public abstract String getDescription();
}
