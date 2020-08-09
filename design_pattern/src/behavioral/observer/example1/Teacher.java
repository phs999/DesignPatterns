package behavioral.observer.example1;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer{
	private String teacherName;

	public Teacher(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Course course=(Course)o;
		Question question=(Question)arg;
		System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个来自"+question.getUserName()+"的问题："+question.getQuestionContent());
		
		
	}
	
}
