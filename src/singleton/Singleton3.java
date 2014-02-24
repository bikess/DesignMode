package singleton;
// 采用一开始就创建实例，而不是延迟实例化，也就是在
// 定义类的实例变量的时候就立刻实例化。此方法保证多线程安全
public class Singleton3 {
	private static Singleton3 uniqueInstance = new Singleton3();
	
	private Singleton3()
	{
		
	}
	public static Singleton3 getInstance(){
		return uniqueInstance;
	}
}
