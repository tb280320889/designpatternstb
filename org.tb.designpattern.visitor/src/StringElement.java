/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:32
 */

public class StringElement implements Visitable {
		private String se;

	public String getSe() {
		return se;
	}

	public StringElement(String se) {

		this.se = se;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitString(this);
	}
}
