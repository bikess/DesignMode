package observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weaterData;
//	 构造器需要weatherData对象，然后在这个weaterData对象上注册自己
	public CurrentConditionsDisplay(Subject wSubject){
		this.weaterData = wSubject;
//		 在观察主题是注册自己
		weaterData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature 
				+ "F degrees and " + humidity + "% humidity");
	}

//	当接受到变化时候，更新自己。更新方式采取的拉的方式
	@Override
	public void update(Subject obj) {
		// TODO Auto-generated method stub
		if (obj instanceof WeatherData){
			WeatherData weatherdata = (WeatherData)obj;
			this.temperature = weatherdata.getTemperature();
			this.humidity = weatherdata.getHumidity();
			display();
		}
	}

}
