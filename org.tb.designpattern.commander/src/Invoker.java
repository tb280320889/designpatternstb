/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午5:25
 */

public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	public void execute(){
		command.execute();
	}
}
