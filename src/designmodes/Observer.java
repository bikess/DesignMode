package designmodes;
// 观察者接口，所有的观察者都要实现这个接口
public interface Observer {
	public void update(QuackQbservable duck);
}
