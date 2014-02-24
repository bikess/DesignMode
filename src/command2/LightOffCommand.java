package command2;

import command.Command;

public class LightOffCommand implements Command {
	Light light;
	public LightOffCommand(Light light){
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

}
