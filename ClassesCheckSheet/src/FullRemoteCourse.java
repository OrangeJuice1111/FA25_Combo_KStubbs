
public class FullRemoteCourse extends OnlineCourse{

	private String courseContact;

	public FullRemoteCourse() {
		super();
		courseContact = "";
	}

	public FullRemoteCourse(String courseNum, int maxStudents, int students, int credits, String courseContact) {
		super(courseNum, maxStudents, students, credits);
		this.courseContact = courseContact;
	}

	public String getCourseContact() {
		return courseContact;
	}

	public void setCourseContact(String courseContact) {
		this.courseContact = courseContact;
	}

	@Override
	public String toString() {
		return "Course:" + super.getCourseNum() + "\nMax students : " + super.getMaxStudents() + " \nNumber of Students : " + super.getStudents()
		+ "credits : " + super.getCredits() + "\nCourse Contact : " + courseContact;
	}
	
	

}
