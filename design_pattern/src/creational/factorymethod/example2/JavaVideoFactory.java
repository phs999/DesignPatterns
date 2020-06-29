package creational.factorymethod.example2;

public class JavaVideoFactory extends VideoFactory{

	@Override
	public Video getVideo() {
		return new JavaVideo();
	}

}
