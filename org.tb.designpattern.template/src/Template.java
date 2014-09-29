/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午2:24
 */

public abstract class Template {
	public abstract void print();
	public void update(){
		System.out.println("Start printing!");
		for (int i = 0; i < 10; i++) {
			print();
		}
	}
}
