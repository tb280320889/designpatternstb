/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午3:12
 */

public class Facade {
	ServiceA  sa;
	ServiceB  sb;
	ServiceC  sc;

	public Facade() {
		sa = new ServiceAIml();
		sb = new ServiceBIml();
		sc = new ServiceCIml();
	}
	public void methodA(){
		sa.methodA();
		sb.methodB();
	}
	public void methodB(){
		sb.methodB();
		sc.methodC();
	}
	public void methodC(){
		sc.methodC();
		sa.methodA();
	}
}
