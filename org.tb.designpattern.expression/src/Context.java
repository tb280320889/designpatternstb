import java.util.ArrayList;
import java.util.List;

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 上午11:00
 */

public class Context {
	private String content;
	private List<Expression> list = new ArrayList<>();

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	public  void add(Expression eps){
		list.add(eps);
	}
	public List<Expression> getList(){
		return list;
	}
}
