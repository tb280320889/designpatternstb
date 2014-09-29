import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA
 * User : TangBin
 * Date : 14-9-8
 * Time : 下午12:44
 */

public class TestComposite {
	public static void main(String[] args) {
		Employer pm = new ProjectManager("ProjectManager");
		Employer pa = new ProjectAssitant("ProjectAssistant");
		Employer programmer1 = new Programmer("pg1");
		Employer programmer2 = new Programmer("pg2");
		pm.add(pa);
		pm.add(programmer2);
		ArrayList<Employer> ems = pm.getSubOrdinates();
		for (Employer em : ems) {
			System.out.println(em.getName());
		}
	}
}
