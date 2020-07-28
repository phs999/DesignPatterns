package behavioral.chainofresponsibility;

public class AticleApprover extends Approver{

	@Override
	public void deploy(Course course) {

		if (course.getArticle()!=null&&!course.getArticle().equals("")) {
			System.out.println(course.getName()+"含有文章手记，内容正常，批准");
			if (approver!=null) {
				approver.deploy(course);
			}
		}else {
			System.out.println(course.getName()+"不含有文章手记或内容不正常，不批准，流程结束");
			return;
		}
	}

}
