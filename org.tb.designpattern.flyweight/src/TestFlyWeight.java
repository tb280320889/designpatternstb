/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午4:00
 */

public class TestFlyWeight {
	public static void main(String[] args) {
		FlyWeight flyWeight1 = FlyWeightFactory.getFlyWeight("a");
		flyWeight1.action(1);

		FlyWeight flyWeight2 = FlyWeightFactory.getFlyWeight("a");
		System.out.println(flyWeight1 == flyWeight2);

		FlyWeight flyWeight3 = FlyWeightFactory.getFlyWeight("c");
		flyWeight3.action(3);

		FlyWeight flyWeight4 = FlyWeightFactory.getFlyWeight("d");
		flyWeight4.action(4);

		FlyWeight flyWeight5 = FlyWeightFactory.getFlyWeight("e");
		flyWeight5.action(5);

		System.out.println(FlyWeightFactory.getSize());
	}
}
