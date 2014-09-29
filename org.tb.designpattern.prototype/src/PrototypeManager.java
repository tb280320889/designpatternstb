import java.util.HashMap;

/**        IntelliJ IDEA
 *	Created by TangBin
 *	Date : 14-9-7
 *	Time : 下午1:09
 */

class ProtoType implements Cloneable {
	@SuppressWarnings("NullableProblems")
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class PrototypeManager {
	private static PrototypeManager prototypeManager;
	private HashMap<String, ProtoType> prototypes = null;

	private PrototypeManager() {
		prototypes = new HashMap<String, ProtoType>();
	}

	public static PrototypeManager getPrototypeManager() {
		if (prototypeManager == null)
			prototypeManager = new PrototypeManager();
		return prototypeManager;
	}

	public void register(String name, ProtoType prototype) {
		prototypes.put(name, prototype);
	}

	public void unRegister(String name) {
		prototypes.remove(name);
	}

	public ProtoType getPrototype(String name) throws CloneNotSupportedException {
		if (prototypes.containsKey(name)) {
			return (ProtoType) (prototypes.get(name)).clone();
		} else {
			ProtoType object = null;
			try {
				object = (ProtoType) Class.forName(name).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			register(name, object);
			return object;
		}

	}
}
