package decorator;
//  这是装饰者的抽象类
public abstract class Decorater implements DecoraterCommoner {
	Decoratee decoratee;// 持有一个被装饰者的对象
	public Decorater(Decoratee decoratee){
		this.decoratee = decoratee;
	}
	public abstract void outPutDecoratee(String remark);
}
