/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 上午11:05
 */

public class TestExpression {
	public static void main(String[] args) {
		Context context = new Context();
		context.add(new SimpleExpression());
		context.add(new AdvancedExpression());
		context.add(new SimpleExpression());
		for (Expression eps : context.getList()) {
			eps.interpret(context);
		}
	}
}
