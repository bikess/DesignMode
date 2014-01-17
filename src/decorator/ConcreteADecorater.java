package decorator;

public class ConcreteADecorater extends Decorater implements DecoraterCommoner {

	public ConcreteADecorater(Decoratee decoratee) {
		super(decoratee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void outPutDecoratee(String remark) {
		// TODO Auto-generated method stub
		System.out.println("装饰后的类");
		decoratee.outPutDecoratee(remark);
	}

}
