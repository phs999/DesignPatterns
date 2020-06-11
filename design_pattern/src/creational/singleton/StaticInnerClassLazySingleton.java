package creational.singleton;

public class StaticInnerClassLazySingleton {
	private StaticInnerClassLazySingleton() {
		
	}
	private static class InnerClass{
		private static StaticInnerClassLazySingleton staticInnerClassLazySingleton=new StaticInnerClassLazySingleton();
	}
	public static StaticInnerClassLazySingleton getInstance() {
		return InnerClass.staticInnerClassLazySingleton;
	}

}
