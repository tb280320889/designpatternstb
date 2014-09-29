import java.util.ArrayList;

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:38
 */

public class TestVisitor {
	public static void main(String[] args) {
		Visitor visitor = new ConcreteVisitor();
		StringElement stringElement = new StringElement("abc");
		stringElement.accept(visitor);

		FloatElement floatElement = new FloatElement(1.5f);
		floatElement.accept(visitor);
		System.out.println("-------------------------");
		ArrayList<Object> result = new ArrayList<>();
		result.add(new StringElement("abc"));
		result.add(new StringElement("abc"));
		result.add(new StringElement("abc"));
		result.add(new FloatElement(1.5f));
		result.add(new FloatElement(1.5f));
		result.add(new FloatElement(1.5f));
		visitor.visitCollection(result);
	}
}
