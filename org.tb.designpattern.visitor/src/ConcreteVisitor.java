import java.util.Collection;

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:39
 */

public class ConcreteVisitor implements Visitor {
	@Override
	public void visitString(StringElement stringE) {
		System.out.println(stringE.getSe());
	}

	@Override
	public void visitFloat(FloatElement floatE) {
		System.out.println(floatE.getFe());
	}

	@Override
	public void visitCollection(Collection collection) {

		for (Object object : collection) {
			if(object instanceof Visitable)
			{
				((Visitable) object).accept(this);
			}
		}
	}
}
