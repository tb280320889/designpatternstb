/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午2:50
 */

public class ConcreteDecoratorB extends Decorator {
	@Override
	public void eat() {
		super.eat();
		System.out.println("==========");
		System.out.println("Class DecoratorB");
	}
}
