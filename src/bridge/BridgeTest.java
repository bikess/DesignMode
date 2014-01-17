package bridge;

public class BridgeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		用C语音编写手机程序
		LanguageMethod lm = new CLanguageMethod();
		Program pm = new PhoneProgram(lm);
		pm.doProgramming();
		
//		用JAVA语言写电脑程序
		LanguageMethod lp = new JavaLanguageMethod();
		Program pl = new ComputerProgram(lp);
		pl.doProgramming();
	}

}
