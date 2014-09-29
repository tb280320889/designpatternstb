/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午2:50
 */

public class TestDecorator {
	public static void main(String[] args) {
		Man man = new Man();
		ConcreteDecoratorA a = new ConcreteDecoratorA();
		ConcreteDecoratorB b = new ConcreteDecoratorB();
		a.setPerson(man);
		b.setPerson(a);
		b.eat();
	}
}
