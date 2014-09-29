/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午3:39
 */

public class WhiteAnimalFactory implements IAnimalFactory {
	@Override
	public ICat createCat() {
		return new WhiteCat();
	}

	@Override
	public IDog createDog() {
		return new WhiteDog();
	}
}
