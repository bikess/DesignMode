package decorator;

public class DecoraterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Decoratee dee = new ConcreteADecoratee();
//		对dee进行装饰一下
		Decorater der = new ConcreteADecorater(dee);
		der.outPutDecoratee("nimei");
	}

}
