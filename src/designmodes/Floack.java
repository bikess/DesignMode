package designmodes;

import java.util.ArrayList;
import java.util.Iterator;

// 这是采用组合模式，这里每一个叶节点就是Quackable
public class Floack implements Quackable {

	ArrayList<Quackable> quackers = new ArrayList<Quackable>();
	
	public void add (Quackable quacker){
		quackers.add(quacker);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator iterator = quackers.iterator();
		while(iterator.hasNext()){
			Quackable quacker = (Quackable)iterator.next();
			quacker.quack();
		}
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
//		当向群注册观察者时，相当于向群中的任何一个鸭子注册观察者
		Iterator<Quackable> iterator = quackers.iterator();
		while(iterator.hasNext()){
			Quackable quackable = (Quackable)iterator.next();
			quackable.registerObserver(observer);
		}
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
//		每一个群里的被观察者在叫的时候自己通知观察者，不必群来通知了
	}

}
