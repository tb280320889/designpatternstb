/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午5:23
 */

public class CommandIml extends Command {
	public CommandIml(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.receive();
	}
}
