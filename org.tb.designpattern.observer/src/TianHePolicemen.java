/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午1:37
 */

public class TianHePolicemen implements Policemen {
	@Override
	public void action(Citizen citizen) {
		String help = citizen.getHelp();
		if(help.equals("normal"))
			System.out.println("OKOKOK!!");
		if(help.equals("no normal"))
			System.out.println("TianHe Police go!!");
	}
}
