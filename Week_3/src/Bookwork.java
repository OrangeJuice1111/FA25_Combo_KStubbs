import java.util.Scanner;

public class Bookwork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println();
//
//		System.out.println("type something:");
//		String word = input.next();//next looks for 1 single word so when it is not nextLine
//		//it will only print to the first space which means everything else after the first space
//		//gets left in the cache / everything else is called the buffer
//		System.out.println(word);
//		input.nextLine();//doing this clears the buffer out
//		System.out.println("type something:");
//		String words = input.nextLine();
//		System.out.println(words);
//		final double CM_PER_INCH = 2.54;
//		int inch = 100;
//		double cm = inch * CM_PER_INCH; 
//		
		
//		System.out.println("How many inches?");
//		
//		inch = input.nextInt();
//		
//		cm = inch * CM_PER_INCH;//use control space to input an already created variable so you 
//		//dont have to type it again
//		System.out.println(inch + " in = ");
//		System.out.println(cm + " cm");
		
		//to // out lines use control / 
		
//		System.out.println(4.0/3);//when using 2 whole numbers you will only get an integer response 
//		//but when you flip it from 4/3 to 4.0/3 it upgrades to a double
//		
//		System.out.printf("Four thirds  = %.3f/n", 4.0/3);
//		System.out.printf("%d in = %.3f cm/n", inch ,cm);
//		//%d stops it from upgrading to a float
//		
//		String num = "73";
//		double pi = 3.14;
//		
//		System.out.println((int)pi); = (int);
////		System.out.println((int) pi + " " + pi); //another way to write it
//		System.out.println((int)num);
//		// all primitavie types (purple color) start with a lower case letter
//		System.out.println(Integer.parseInt(num) + pi);
//		System.out.println(num + pi);
//		
//		int feet = 76/12;
//		int inches = 76%12;
//		
//		System.out.println(feet + "' " + inches + "\"");
		
		double cm;
		int feet, inches, remainder;
		final int IN_PER_FOOT = 12;//inches are an integer
		final double CM_PER_INCH = 2.54;// CM are a float
		
		System.out.println("Exactly how many inches?");
		cm = input.nextDouble();
		
		inches = (int)(cm/CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;//when using a % is a modular gives you a remainder
		
		System.out.printf("%.2f cm is %d ft and %d in\n", cm, feet, remainder);
		//putting the inputs after the "" means you input and use them
		// you use this way to write it because if you used + instead you would eventually get a stack overflow
		
		
	}

}
