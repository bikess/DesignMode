package observer;
// 本例是headfirst观察者建立气象站的代码实例。 此接口是主题接口，即被观察者接口，所有需要被观察的接口
// 需要实现这个接口，并实现接口的 注册、删除、通知 观察者的方法
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
