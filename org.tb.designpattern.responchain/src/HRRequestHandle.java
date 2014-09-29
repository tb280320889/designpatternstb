/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午4:42
 */

public class HRRequestHandle implements RequestHandle {
	@Override
	public void handleRequest(Request request) {
		if (request instanceof DimissionRequest){
			System.out.println("Resignation HR Please!");
		}
	}
}
