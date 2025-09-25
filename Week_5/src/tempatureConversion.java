import java.util.Scanner;

public class tempatureConversion {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double far = 0;
		System.out.println("What is the tempature?");
		far = input.nextDouble();
		double cel = 0;
		cel = (((far - 32)*5)/9);
		double kelvin = 0;
		kelvin = cel + 273.15;
		
		System.out.printf("The tempature in Celcius is %.2f%n "
				+ "and the tempature in Kelvin is %.2f%n" ,cel, kelvin);
	}
}
