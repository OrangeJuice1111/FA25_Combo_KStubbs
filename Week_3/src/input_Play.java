import java.util.Scanner;

public class input_Play {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//static means everything use this object
											   // instead of having their own
		
		printInput();//here we are calling a method with no parameters or returns

//	
		
		System.out.println("What is the temp in F");
	
		double fTemp = input.nextDouble();
		
		double cTemp = convertToC(fTemp);// input for a floating point number double
		
		double kTemp = convertToK(cTemp);// calling a method that returns a double and takes a double as
				
		System.out.println(fTemp + "°F is " + cTemp + "°C and " + kTemp + "°K");
		
		System.out.printf("%.2f°F is %.2f°C and %.2f°K",fTemp,cTemp,kTemp );
	
		
		System.out.println("Enter Kilos");
		double kilos = input.nextDouble();
		double pounds = convertToPounds(kilos);
		System.out.printf("%.2f", pounds);
	
	
	}
	private static double kilos = convertToPounds(double kilos){
		
	}
	
	
	//private is the access static means its outside of the main
	//void is the return type for returning nothing
	//printInput is the name and there are no params
	private static void printInput(){
		System.out.println("What is your name?");
//		
//		String name = input.next();
//		
//		System.out.println("Great " + name + "!");
//		
//		System.out.println("Enter your age in years");
//		
//		int age = input.nextInt();
//		
//		System.out.println("Your age is "+ age );
	}
	//public lets everyone use this
	//double is the data type of what is returned 
	//double fTemp is the variable used inside this method it is the parameter/argument
	public static double convertToC(double fTemp)
	{
		return (fTemp -32) *5/9;
		
	}
	public static double convertToK(double cTemp)
	{
		return (cTemp + 273.15);
		
	}
}
