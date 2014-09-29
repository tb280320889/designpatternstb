/**
 * Created by TangBin on 14-9-7.
 */
public class Man extends Person {
	public Man(){
		setSex("man!!!");
	}
	@Override
	public void dress() {
		Clothing clothing = getClothing();
		clothing.personDressCloth(this);
	}
}
