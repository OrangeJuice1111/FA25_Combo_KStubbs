import java.util.Scanner;

public class CircleCalculation {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the radius of your circle");
		double rad = input.nextDouble();
		double dia = d(rad);
		double area = a(rad);
		double cir = c(rad);
		System.out.printf("The Diamter of the circle is %.2f%n", dia);
		System.out.printf("The Area of the circle is %.2f%n", area);
		System.out.printf("The Circumfrence of the circle is %.2f%n", cir);

	}

	private static double c(double rad) {
		double cir = 0;
		cir = 2 * Math.PI * rad;
		return cir;

	}

	private static double a(double rad) {
		double area = 0;
		area = Math.PI * (rad * rad);
		return area;
	}

	private static double d(double rad) {
		double di = 0;
		di = 2 * rad;
		return di;
	}
}
