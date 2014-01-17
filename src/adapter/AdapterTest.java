package adapter;

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		三星手机充电
		TargetCharge sanxing = new SanXingAdapter();
		sanxing.Charge("三星");
		//苹果手机充电
		TargetCharge apple = new AppleAdapter();
		apple.Charge("苹果");
	}

}
