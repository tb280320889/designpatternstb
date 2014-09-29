/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午3:31
 */

public class TestFacade {
	public static void main(String[] args) {
		ServiceA sa = new ServiceAIml();
		ServiceB sb = new ServiceBIml();
		System.out.println("=========");
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
		facade.methodC();
	}
}
