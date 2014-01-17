package observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	Subject weaterData;
	public ForecastDisplay(WeatherData wd){
		this.weaterData = wd;
		wd.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(humidity>50){
			System.out.println("this is a rainy weather");
		}else{
			System.out.println("this is a sunny weather");
		}
	}

	@Override
	public void update(Subject obj) {
		// TODO Auto-generated method stub
		WeatherData wd = (WeatherData)obj;
		this.temperature = wd.getTemperature();
		this.humidity = wd.getHumidity();
		this.pressure = wd.getPressure();
		display();
	}

}
