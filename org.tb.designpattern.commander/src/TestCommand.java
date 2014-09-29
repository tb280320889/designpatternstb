/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午5:27
 */

public class TestCommand {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd =  new CommandIml(receiver);
		Invoker i = new Invoker();
		i.setCommand(cmd);
		i.execute();

	}
}
