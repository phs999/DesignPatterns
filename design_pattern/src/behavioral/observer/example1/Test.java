package behavioral.observer.example1;

public class Test {
	public static void main(String[] args) {
		Course course=new Course("Java设计模式");
		Teacher teacher=new Teacher("Jack");
		course.addObserver(teacher);
		
		Question question=new Question();
		question.setUserName("Tom");
		question.setQuestionContent("观察者模式的核心原理是什么？");
		course.produceQuestion(course, question);
	}
}
