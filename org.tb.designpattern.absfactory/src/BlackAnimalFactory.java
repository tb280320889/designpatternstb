/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-9
 * Time : 下午3:38
 */

public class BlackAnimalFactory implements IAnimalFactory {
	@Override
	public ICat createCat() {
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		return new BlackDog();
	}
}
