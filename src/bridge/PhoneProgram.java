package bridge;

public class PhoneProgram extends Program {

	public PhoneProgram(LanguageMethod lm) {
		super(lm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doProgramming() {
		// TODO Auto-generated method stub
		lm.doPramming();
		System.out.println("写手机程序");
	}

}
