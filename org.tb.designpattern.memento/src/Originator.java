/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午12:49
 */

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	public Memento createMemento(){
		return new Memento(state);
	}
	public void setMemento(Memento memento){
		state = memento.getState();
	}
	public void showState(){
		System.out.println(state);
	}
}
