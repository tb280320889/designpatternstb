/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午2:47
 */

public class ConcreteDecoratorA extends Decorator {
	@Override
	public void eat() {
		super.eat();
		reEat();
		System.out.println("DecoratorA");
	}

	private void reEat() {
		System.out.println("Re eating");
	}
}
