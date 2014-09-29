/**
 * Created by TangBin on 14-9-7.
 */
public class Lady extends Person {
	public Lady(){
		setSex("lady!!!");
	}
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
}

