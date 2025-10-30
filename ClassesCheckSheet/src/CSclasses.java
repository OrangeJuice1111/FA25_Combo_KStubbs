
public class CSclasses {

	public static void main(String[] args) {
		
		Course[] courseList = new Course[3];
		
		courseList[0] = new InPersonCourse ("CSC119", 20, 6, 12, "CP119");
		courseList[1] = new FullRemoteCourse ("CSC119", 20, 6, 12, "email@school");
		courseList[2] = new RealTimeRemoteCourse ("CSC119", 20, 6, 12, "Room Code 12345");
		
		for(Course list: courseList)
		{
			System.out.println(list);
			System.out.println();
		}

	}

}
