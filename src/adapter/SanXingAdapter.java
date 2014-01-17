package adapter;
// 这个是三星手机的电源适配器类
public class SanXingAdapter implements TargetCharge{

	private Adaptee sanxing =new Adaptee();
	@Override
	public void Charge(String chakou) {
		// TODO Auto-generated method stub
		System.out.println(chakou+"电源适配器");
		sanxing.ordinaryCharge(chakou);
	}
	
}
