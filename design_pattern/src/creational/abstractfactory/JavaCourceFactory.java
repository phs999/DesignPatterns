package creational.abstractfactory;

public class JavaCourceFactory implements CourseFactory{

	@Override
	public Video getVideo() {
		return new JavaVideo();
	}

	@Override
	public Aticle getAticle() {
		return new JavaAticle();
	}

}
