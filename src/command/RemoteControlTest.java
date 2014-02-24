package command;

public class RemoteControlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteControl rControl = new SimpleRemoteControl();
		
		Light light = new Light();
		
		LightOnCommand lighton = new LightOnCommand(light);
		
		rControl.setCommand(lighton);
		rControl.buttonWasPressed();
	}

}
