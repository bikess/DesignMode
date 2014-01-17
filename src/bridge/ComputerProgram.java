package bridge;

public class ComputerProgram extends Program {

	public ComputerProgram(LanguageMethod lm) {
		super(lm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doProgramming() {
		// TODO Auto-generated method stub
		lm.doPramming();
		System.out.println("写电脑程序");
	}

}
