package observer;

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData sWearther = new WeatherData();
		
		
//		观察者对象currentconditiondisplay加入到这个观察者主题中去
		CurrentConditionsDisplay cd = new CurrentConditionsDisplay(sWearther);
//		观察者对象forcastdisplay加入到这个观察者主题中去
		ForecastDisplay fd = new ForecastDisplay(sWearther);
		
		sWearther.setMeasurements(50, 40,50);
		sWearther.setMeasurements(80, 80, 80);
	}

}
