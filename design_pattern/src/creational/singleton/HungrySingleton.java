package creational.singleton;

/**
 * 饿汉模式
 * @author phs
 *
 */
public class HungrySingleton {
	private static final HungrySingleton hungrySingleton=new HungrySingleton();
	
	private HungrySingleton() {
	}
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
