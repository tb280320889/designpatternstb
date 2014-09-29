/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午3:04
 */

public class TestFactory {
	public static void main(String[] args) {
		IWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();

		IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
		teacherWorkFactory.getWork().doWork();


	}
}
