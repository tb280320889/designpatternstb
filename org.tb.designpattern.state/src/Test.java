/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:16
 */

public class Test {
	public static void main(String[] args) {
		Context context1=new Context();
		context1.setWeather(new Sunshine());
		System.out.println(context1.weatherMessage());
		System.out.println("-----------------------------");
		Context context2 =new Context();
		context2.setWeather(new Rain());
		System.out.println(context2.weatherMessage());
	}
}
