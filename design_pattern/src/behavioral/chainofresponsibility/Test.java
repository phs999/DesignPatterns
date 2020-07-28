package behavioral.chainofresponsibility;

public class Test {
	public static void main(String[] args) {
		Approver articleApprover=new AticleApprover();
		Approver videoApprover=new VideoApprover();
		Course course=new Course();
		course.setName("XX课程");
		//course.setArticle("详细手记文章");
		course.setVideo("详细视频讲解");
		
		articleApprover.setNextApprover(videoApprover);
		articleApprover.deploy(course);
	}
}
