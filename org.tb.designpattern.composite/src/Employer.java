import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA
 * User : TangBin
 * Date : 14-9-8
 * Time : 下午12:41
 */

public abstract class Employer {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void add(Employer employer);

	public abstract void delete(Employer employer);

	public ArrayList<Employer> subOrdinates;

	public void printInfo() {
		System.out.println(name);
	}

	public ArrayList<Employer> getSubOrdinates() {
		return this.subOrdinates;
	}
}
