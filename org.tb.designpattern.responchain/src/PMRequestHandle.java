/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午4:49
 */

public class PMRequestHandle implements RequestHandle {
	RequestHandle rh;

	public PMRequestHandle(RequestHandle rh) {
		this.rh = rh;
	}

	@Override
	public void handleRequest(Request request) {
		if(request instanceof AddMoneyRequest ){
			System.out.println("Add Money PM Please!!!");
		}
		else {
			rh.handleRequest(request);
		}
	}
}
