/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 上午11:48
 */

public class ListIml implements List {
	private Object[] list;
	private int index;
	private int size;

	public ListIml() {
		index = 0;
		size = 0;
		list = new Object[100];
	}

	@Override
	public Iterator iterator() {
		return new IteratorIml(this);
	}

	@Override
	public Object get(int index) {
		return list[index];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void add(Object obj) {
		list[index++] = obj;
		size++;
	}
}
