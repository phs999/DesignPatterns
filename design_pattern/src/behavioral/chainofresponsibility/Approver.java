package behavioral.chainofresponsibility;
//批准者
public abstract class Approver {

	protected Approver approver;
	
	public void setNextApprover(Approver approver) {
		this.approver=approver;
	}
	
	//发布课程
	public abstract void deploy(Course course);
	
}
