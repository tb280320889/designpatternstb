/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午12:30
 */

public class TestMediator {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		mediator.notice("Boss");
		mediator.notice("Client");
	}
}
