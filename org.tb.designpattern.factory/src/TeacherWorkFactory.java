/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午3:04
 */

public class TeacherWorkFactory implements IWorkFactory {
	@Override
	public Work getWork() {
		return new TeacherWork();
	}
}
