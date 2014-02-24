package designmodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackQbservable {

	ArrayList<Observer> observers = new ArrayList<Observer>();
	QuackQbservable duck;
	public Observable(QuackQbservable duck){
		this.duck = duck;
		System.out.println("初始化Observable");
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		System.out.println("添加注册观察者");
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Iterator iterator = observers.iterator();
		while(iterator.hasNext()){
			Observer observer = (Observer)iterator.next();
			observer.update(duck);
		}
	}

}
