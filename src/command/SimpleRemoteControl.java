package command;
// 遥控器类,遥控器上有很多按钮以及按钮对应的插槽，可以控制电灯
public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl(){
		
	}
//	此方法用来设置插槽控制的命令
	public void setCommand(Command command){
		this.slot = command;
	}
//	但按下按钮时，命令被执行
	public void buttonWasPressed(){
		slot.execute();
	}
}
