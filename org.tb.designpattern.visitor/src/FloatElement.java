/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:35
 */

public class FloatElement implements Visitable {
	private Float fe;

	public Float getFe() {
		return fe;
	}

	public FloatElement(Float fe) {

		this.fe = fe;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitFloat(this);
	}
}
