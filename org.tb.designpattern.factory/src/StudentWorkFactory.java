/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午3:03
 */

public class StudentWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		return new StudentWork();
	}
}
