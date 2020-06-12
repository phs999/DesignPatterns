package creational.singleton;

import java.io.Serializable;

/**
 * 饿汉模式
 * @author phs
 *
 */
public class HungrySingleton implements Serializable {
	private static final HungrySingleton hungrySingleton=new HungrySingleton();
	
	private HungrySingleton() {
	}
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
