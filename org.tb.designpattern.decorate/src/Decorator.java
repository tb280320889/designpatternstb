/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午2:46
 */

public abstract class Decorator implements Person {
	protected Person person;

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public void eat() {
		person.eat();
	}

}
