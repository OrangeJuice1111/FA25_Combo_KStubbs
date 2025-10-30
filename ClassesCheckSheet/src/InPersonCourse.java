
public class InPersonCourse extends Course{
	private String roomNum;

	public InPersonCourse() {
		super();
		roomNum = "";
	}
	
	public InPersonCourse(String courseNum, int maxStudents, int students, int credits, String roomNum) {
		super(courseNum, maxStudents, students, credits);
		this.roomNum = roomNum;
		
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	@Override
	public String toString() {
		return "Course:" + super.getCourseNum() + "\nMax students : " + super.getMaxStudents() + " \nNumber of Students : " + super.getStudents()
				+ "credits : " + super.getCredits() + "\nRoom Number : " + roomNum;
	}
	
	
	

}
