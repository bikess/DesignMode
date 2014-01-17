package adapter;

public class AppleAdapter implements TargetCharge {

	private Adaptee apple = new Adaptee();
	@Override
	public void Charge(String chakou) {
		// TODO Auto-generated method stub
		System.out.println(chakou+"电源适配器");
		apple.ordinaryCharge(chakou);
	}

}
