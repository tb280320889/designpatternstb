/**
 * Created by TangBin on 14-9-7.
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.adapteeMethod();
		target.adapterMethod();
	}
}
