package command;
// 一个具体的命令类实现命令接口，命令的接收者是电灯对象，由电灯对象接收请求
public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

}
