/**        IntelliJ IDEA
 *	Created by Administrator
 *	Date : 14-9-7
 *	Time : 下午4:35
 */

//饿汉式
public class Singleton1 {
	//在自己内部定义自己的一个实例
	//private 只供自己内部调用
	private static Singleton1 instance = new Singleton1();

	//构造函数设置为私有
	private Singleton1() {
	}

	//静态工厂方法,提供一个外部访问得到的对象的静态方法
	public static Singleton1 getInstance() {
		return instance;
	}
}
