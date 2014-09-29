

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 上午11:38
 */

public class IteratorIml implements Iterator {
	private List list;
	private int index;

	public IteratorIml(List list) {
		index = 0;
		this.list = list;
	}

	@Override
	public Object next() {
		Object obj = list.get(index);
		index++;
		return obj;
	}

	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void last() {
		index = list.size();
	}

	@Override
	public boolean hasNext() {
		return index < list.size();
	}
}
