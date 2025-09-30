
public class BookWork {
	
	public static void newLine() {
	// static is important becuase its already created memory
	//static says its not taking anything
	//void means its not returning anything
	
		System.out.println();
	}
	public static void main(String[] args) { //the main means the computer will run it first
		System.out.println("Hello");
		newLine();
		System.out.println("cruel");
		newLine();
		threeLines();
		System.out.println("World");
		
		print("Hello World!");
		printN("Hello", 3);
		int hour = 9;
		int minute = 28;
		printTime(hour, minute);
		
		double root = Math.sqrt(17.0);
		double angle = 1.5;
		double height = Math.sin(angle);
		newLine();
		System.out.println(root + " " + height);
		System.out.println(Math.toDegrees(Math.PI));
		System.out.println(Math.cos(angle + Math.PI / 2.0));
		String name = "Kyle";
		String starName = starFiller(name);
		print(starName);
		
	}

	private static String starFiller(String name) {
		String ret = "";
		for(int i = 0; i < name.length(); i++)//loops will do there thing with one and only one statement
			//this is why there are no curly braces
			ret+="*" + name.charAt(i);// charAt means the charecter at string name (i)
		//aka its adding a * before every letter in your name 
		ret += "*"; //this is how to add the * to the end of your name 
		return ret;
		
	}
	private static void printTime(int hour, int minute) {// you can change hour and minute to h and m 
		//because once it receives the int it doesnt care what the name of it is
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);//the ln in println gives it the new line 
		//but if its not there everything will print on the same line
	}
	private static void printN(String s, int num) {
		for(int i = 0; i < num; i++)
		{
			System.out.println(s);
		}
		
	}
	private static void print(String s) {
		System.out.println(s);// if you want to print twice write this line twice
		
	}
	private static void threeLines () {
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	public static void newLine() {
		
		System.out.println();
	}
	
}
