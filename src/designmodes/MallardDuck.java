package designmodes;

// 绿头鸭
public class MallardDuck implements Quackable {
	Observable observable;
	
	public MallardDuck(){
		observable = new Observable(this);
		System.out.println("初始化，已经初始化observable");
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
//		当呱呱叫时候，要让所有的观察者知道
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		System.out.println("注册观察者");
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

}
