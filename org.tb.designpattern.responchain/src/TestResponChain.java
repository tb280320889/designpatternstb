/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午4:55
 */

public class TestResponChain {
	public static void main(String[] args) {
		RequestHandle hr = new HRRequestHandle();
		RequestHandle pm = new PMRequestHandle(hr);
		RequestHandle tl = new TLRequestHandle(pm);

		Request request1 = new DimissionRequest();
		tl.handleRequest(request1);

		System.out.println("==========");
		Request request2 = new AddMoneyRequest();
		tl.handleRequest(request2);

		System.out.println("==========");
		Request request3 = new DimissionRequest();
		pm.handleRequest(request3);

	}
}
