package phs999.tank;

import java.io.IOException;
import java.util.Properties;

public class PropertyMgr {
	static Properties properties=new Properties();
	static {
		try {
			properties.load(PropertyMgr.class.getClassLoader().getResourceAsStream("config"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Object get(String key) {
		if (properties==null) {
			return null;
		}
		return properties.get(key);
		
	}
}
