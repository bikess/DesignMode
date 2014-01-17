package observer;

import java.util.ArrayList;
// 这是一个具体的主题对象类，也就是一个具体的被观察者。要实现观察主题接口Subject,并且
// 要实现相应的注册、删除、通知观察者的方法。通知观察者的时候，采取的是传递一个观察者对象的方式
// 让观察者通过这个对象主动的拉去内容。而不是直接传统参数，采取推送的方式
public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i=0;i<observers.size();i++){
			Observer ob = (Observer)observers.get(i);
			ob.update(this);
		}
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
//	这个方法是测试时候用，用来设置被观察者主题的数据的变化，从而模拟数据变化而通知观察者
	public void setMeasurements(float temperature, float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	private void measurementsChanged() {
		// TODO Auto-generated method stub
		notifyObservers();
	}
	
}
