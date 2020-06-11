package creational.singleton;

public class DoubleCheckLazySingleton {
	private static volatile DoubleCheckLazySingleton doubleCheckLazySingleton;
	private DoubleCheckLazySingleton() {
		
	}
	public static DoubleCheckLazySingleton getInstance() {
		if (doubleCheckLazySingleton==null) {
			synchronized (DoubleCheckLazySingleton.class) {
				if (doubleCheckLazySingleton==null) {
					doubleCheckLazySingleton=new DoubleCheckLazySingleton();
				}
			}
		}
		return doubleCheckLazySingleton;
	}

}
