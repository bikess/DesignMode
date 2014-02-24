package designmodes;


public class Quackologist implements Observer {

	public Quackologist(){
		
	}
	@Override
	public void update(QuackQbservable duck) {
		// TODO Auto-generated method stub
//		打印出叫的对象
		System.out.println("Quackologist:"+duck+" just quacked.");
	}

}
