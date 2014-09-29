/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 上午11:51
 */

public class TestIterator {
	public static void main(String[] args) {
		List list = new ListIml();
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============");
		for (int i = 0; i <list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
}
