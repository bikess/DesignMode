package singleton;
// 基本的单例模式类，不能保证多线程安全
public class Singleton1 {
	private static Singleton1 uniqueInstance ;
//	构造方法必须是私有的
	private Singleton1(){
		
	}
//	通过getInstance方法来获得类的唯一的实例
	public static Singleton1 getInstance(){
		if(uniqueInstance==null){
			uniqueInstance = new Singleton1();
		}
		return uniqueInstance;
	}
}
