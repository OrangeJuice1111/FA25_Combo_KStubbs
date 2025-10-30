
public class Course {
	private String courseNum;
	private int students;
	private int maxStudents;
	private int credits;
	
	
	
	public Course() {
		super();
		this.courseNum = "";
		this.students = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}
	public Course(String courseNum, int maxStudents, int students, int credits) {
		super();
		this.courseNum = courseNum;
		this.students = students;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}
	public String getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	public int getMaxStudents() {
		return maxStudents;
	}
	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Course:" + courseNum + "\nMax students : " + maxStudents + " \nNumber of Students : " + students
				+ "credits : " + credits;
	}
	
	

}
