package creational.abstractfactory;

public class PythonCourseFactory implements CourseFactory{

	@Override
	public Video getVideo() {
		return new PythonVideo();
	}

	@Override
	public Article getAticle() {
		return new PythonArticle();
	}

}
