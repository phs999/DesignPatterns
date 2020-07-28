package behavioral.chainofresponsibility;

public class VideoApprover extends Approver{

	@Override
	public void deploy(Course course) {

		if (course.getVideo()!=null&&!course.getVideo().equals("")) {
			System.out.println(course.getName()+"含有视频，内容正常，批准");
			if (approver!=null) {
				approver.deploy(course);
			}
		}else {
			System.out.println(course.getName()+"不含有视频或内容不正常，不批准，流程结束");
			return;
		}
	}

}
