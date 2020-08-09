package behavioral.observer.example1;

import java.util.Observable;

/**
 * 课程-被观察者（主题对象）
 * @author phs
 *
 */
public class Course extends Observable{

	private String courseName;
	
	public Course(String courseName) {
		this.courseName=courseName;
	}

	public String getCourseName() {
		return courseName;
	}
	
	public void produceQuestion(Course course,Question question) {
		System.out.println(question.getUserName()+" 在 "+course.courseName+" 提交了一个问题");
		setChanged();
		notifyObservers(question);
	}
	
}
