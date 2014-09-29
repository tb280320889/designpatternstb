/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午4:53
 */

public class TLRequestHandle implements RequestHandle {
	RequestHandle rh;

	public TLRequestHandle(RequestHandle rh) {
		this.rh = rh;
	}

	@Override
	public void handleRequest(Request request) {
		if (request instanceof  VacationRequest){
			System.out.println("Vacation TL Please!!");
		}else {
			rh.handleRequest(request);
		}
	}
}
