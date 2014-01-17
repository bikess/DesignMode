package decorator;
// 此类是被装饰者的抽象类
public abstract class Decoratee implements DecoraterCommoner {
	public String remark = "装饰者";
	public String getRemark(){
		return remark;
	}
	public abstract void outPutDecoratee(String remark);
}
