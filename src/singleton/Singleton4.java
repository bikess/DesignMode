package singleton;
// 采用双重检查加锁的方式来创建类的实例。即加关键字volatile
// 首先检查是否实例已经创建，若尚未创建，才进行同步，此时只有第一次回同步
public class Singleton4 {
	private static volatile Singleton4 uniqueInstance = new Singleton4();
	
	private Singleton4()
	{
		
	}
	public static Singleton4 getInstance(){
		return uniqueInstance;
	}
}
