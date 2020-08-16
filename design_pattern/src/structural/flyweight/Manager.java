package structural.flyweight;

public class Manager implements Employee{

	private String titleString="部门经理";
	private String department;//部门
	private String reportContent;//报告内容
	
	public Manager(String department) {
		this.department=department;
	}
	@Override
	public void report() {
		System.out.println(reportContent);
	}
	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	
	
	

}
