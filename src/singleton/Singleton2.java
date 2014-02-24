package singleton;
// 改进的单例模式，可以保证多线程的安全，但是由于把获得
// 类对象的方法改为了同步的方法，因此在多线程的程序中会影响性能
public class Singleton2 {
private static Singleton2 uniqueInstance;

private Singleton2(){
	
}
public static synchronized Singleton2 getInstance(){
	if(uniqueInstance==null){
		uniqueInstance = new Singleton2();
	}
	return uniqueInstance;
}
}
