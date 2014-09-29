/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午12:24
 */

public class ConcreteMediator extends Mediator {
	private ColleagueA colleagueA;
	private ColleagueB colleagueB;

	public ConcreteMediator() {
		colleagueA = new ColleagueA();
		colleagueB = new ColleagueB();
	}

	@Override
	public void notice(String content) {
		if(content.equals("Boss"))
			colleagueA.action();
		if(content.equals("Client"))
			colleagueB.action();
	}
}
