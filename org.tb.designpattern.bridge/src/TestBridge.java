/**        IntelliJ IDEA
 *	Created by TangBin
 *	Date : 14-9-7
 *	Time : 下午5:53
 */

public class TestBridge {
	public static void main(String[] args) {
		Person man = new Man();
		Person lady = new Lady();
		Clothing jacket = new Jacket();
		Clothing trouser = new Trouser();
		jacket.personDressCloth(man);
		jacket.personDressCloth(lady);
		trouser.personDressCloth(man);
		trouser.personDressCloth(lady);
	}
}
