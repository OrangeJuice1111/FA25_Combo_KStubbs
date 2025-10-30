
public class RealTimeRemoteCourse extends OnlineCourse{
	private String zoomInfo;

	public RealTimeRemoteCourse() {
		super();
		zoomInfo = "";
	}

	public RealTimeRemoteCourse(String courseNum, int maxStudents, int students, int credits, String zoomInfo) {
		super(courseNum, maxStudents, students, credits);
		this.zoomInfo = zoomInfo;
	}

	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}

	@Override
	public String toString() {
		return "Course:" + super.getCourseNum() + "\nMax students : " + super.getMaxStudents() + " \nNumber of Students : " + super.getStudents()
		+ "credits : " + super.getCredits() + "\nZoom Information : " + zoomInfo;
	}
	
	
	
	
}
