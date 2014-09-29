/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:08
 */

public class TestStrategy {
	public static void main(String[] args) {
		Context context = new Context(new StrategyImlA());
		context.doMethod();

		context = new Context(new StrategyImlB());
		context.doMethod();

		context = new Context(new StrategyImlC());
		context.doMethod();
	}
}
