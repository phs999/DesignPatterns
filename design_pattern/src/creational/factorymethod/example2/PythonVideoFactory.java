package creational.factorymethod.example2;

public class PythonVideoFactory extends VideoFactory{

	@Override
	public Video getVideo() {
		return new PythonVideo();
	}
	

}
