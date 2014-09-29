/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午4:19
 */

public class ProxyObject implements ObjectTB {
	ObjectTB tb;

	public ProxyObject() {
		System.out.println("Class Proxy");
		tb = new ObjectIml();
	}

	@Override
	public void action() {
		System.out.println("Start Proxy");
		tb.action();
		System.out.println("Close Proxy");
	}
}
