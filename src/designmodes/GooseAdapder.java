package designmodes;

public class GooseAdapder implements Quackable {

//	此对象模式采用的适配器模式，把本来不可以使用的鹅类的方法，转换成可以使用的方法
	Goose goose;
	public GooseAdapder(Goose goose){
		this.goose = goose;
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		goose.honk();
	}
	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

}
