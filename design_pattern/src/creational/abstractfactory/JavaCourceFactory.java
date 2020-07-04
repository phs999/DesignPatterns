package creational.abstractfactory;

public class JavaCourceFactory implements CourseFactory{

	@Override
	public Video getVideo() {
		return new JavaVideo();
	}

	@Override
	public Article getAticle() {
		return new JavaArticle();
	}

}
