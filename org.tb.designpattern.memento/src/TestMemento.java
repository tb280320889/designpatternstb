/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午12:51
 */

public class TestMemento {
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("Meeting!!");
		Caretaker caretaker =new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("Sleeping!!");
		originator.showState();
		originator.setMemento(caretaker.getMemento());
		originator.showState();
	}
}
