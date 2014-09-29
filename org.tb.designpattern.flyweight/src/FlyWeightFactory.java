import java.util.HashMap;
import java.util.Map;

/**
 * IntelliJ IDEA
 * Created by Administrator
 * Date : 14-9-8
 * Time : 下午3:55
 */

public class FlyWeightFactory {
	private static Map<String, FlyWeightIml> flyweights = new HashMap<>();

	public FlyWeightFactory(String arg) {
		flyweights.put(arg, new FlyWeightIml());
	}

	public static FlyWeight getFlyWeight(String key) {
		if (flyweights.get(key) == null) {
			flyweights.put(key, new FlyWeightIml());
		}
		return flyweights.get(key);
	}

	public static int getSize() {
		return flyweights.size();
	}
}
