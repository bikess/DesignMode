package decorator;

public class ConcreteADecoratee extends Decoratee implements DecoraterCommoner{

	public ConcreteADecoratee(){
		super.remark = "具体A类被装饰者";
	}
	@Override
	public void outPutDecoratee(String remark) {
		// TODO Auto-generated method stub
		System.out.println(remark);
	}

}
