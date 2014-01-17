package adapter;
// 适配器设计模式，这里的代码是对象适配器模式。例如电源适配器，电源插座就是需要适配的类，因为电源
// 插座已经具有我们需要的充电的功能了，但是我们目前接口，手机的充电确无法使用这个接口，必须采用
// 电源适配器,对插座进行适配,装换车手机需要的目表接口
// 这个Adaptee是需要适配的类，
public class Adaptee {

	/**
	 * @param args
	 */
	public void ordinaryCharge(String chakou){
		System.out.println("调用插座进行充电");
	}
	
}
