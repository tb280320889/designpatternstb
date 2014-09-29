import java.util.ArrayList;

/**
 *	Created with IntelliJ IDEA
 *	User : TangBin
 *	Date : 14-9-8
 *	Time : 下午12:43
 */


public class ProjectManager extends Employer {
	public ProjectManager(String name) {
		setName(name);
		subOrdinates = new ArrayList<>();
	}

	@Override
	public void add(Employer employer) {
		subOrdinates.add(employer);
	}

	@Override
	public void delete(Employer employer) {
		subOrdinates.add(employer);
	}
}
