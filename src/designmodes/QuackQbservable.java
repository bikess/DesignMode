package designmodes;

// OuackObservable是一个接口，任何想要被观察的Quackable都
// 必须实现QuackObservable接口
public interface QuackQbservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
