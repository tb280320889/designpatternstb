/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 上午11:47
 */

public interface List {
	Iterator iterator();
	Object get(int index);
	int size();
	void add(Object obj);
}
