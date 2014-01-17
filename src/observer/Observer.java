package observer;
// 这是观察者接口，所有的观察者都必须要实现这个接口 
public interface Observer {
	public void update(Subject obj);
}
