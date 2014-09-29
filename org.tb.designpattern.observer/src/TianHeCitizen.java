/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午1:34
 */

public class TianHeCitizen extends Citizen {
	public TianHeCitizen(Policemen policemen) {
		setPolicemen();
		register(policemen);

	}

	@Override
	void sendMessage(String help) {
		setHelp(help);
		for (Policemen policemen : police) {
			policemen.action(this);
		}
	}
}
