package bridge;
// 编程序的抽象类，抽象出编程序. 只有语音方法的实例，用来表示用何种方法（语言）进行编程
public abstract class Program {
	LanguageMethod lm;
	public Program(LanguageMethod lm){
		this.lm = lm;
	}
	public void setLanguageMethod(LanguageMethod lm){
		this.lm = lm;
	}
	public LanguageMethod getLanguageMethod(){
		return this.lm;
	}
	public abstract void doProgramming();
}
