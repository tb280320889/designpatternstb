import java.util.Collection;

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:32
 */

public interface Visitor {
	public void visitString(StringElement stringE);

	public void visitFloat(FloatElement floatE);
	
	public void visitCollection(Collection collection);
}
