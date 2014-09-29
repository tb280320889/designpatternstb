import java.util.ArrayList;
import java.util.List;

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午1:17
 */

public abstract class Citizen {
	String help = "normal";
	List<Policemen> police;

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	abstract void sendMessage(String help);

	public void setPolicemen() {
		this.police = new ArrayList<>();
	}

	public void register(Policemen policemen) {
		this.police.add(policemen);
	}

	public void unRegister(Policemen policemen) {
		this.police.remove(policemen);
	}
}
