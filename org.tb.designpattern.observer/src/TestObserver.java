/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午1:37
 */

public class TestObserver {
	public static void main(String[] args) {
		Policemen thPolice = new TianHePolicemen();
		Policemen whPolice = new WuHanPolicemen();
		Citizen whCitizen = new WuHanCitizen(whPolice);
		whCitizen.sendMessage("no normal");
		whCitizen.sendMessage("normal");

		System.out.println("==============");
		Citizen thCitizen = new TianHeCitizen(thPolice);
		thCitizen.sendMessage("no normal");
		thCitizen.sendMessage("normal");
	}
}
