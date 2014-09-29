/**        IntelliJ IDEA
 *	Created by Administrator
 *	Date : 14-9-7
 *	Time : 下午4:35
 */

public class Singleton2 {
	//懒汉式
	private static Singleton2 instance = null;

	//设置私有构造函数
	private Singleton2() {
	}

	//静态工厂方法
	public static synchronized Singleton2 getInstance() {
		if (instance == null)
			instance = new Singleton2();
		return instance;
	}
}
