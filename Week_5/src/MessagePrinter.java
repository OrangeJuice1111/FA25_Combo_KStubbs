import java.util.Scanner;

public class MessagePrinter {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		MessagePrinter();
		BeverageSelector();
		Divider();
		Accumulator();
	}

	private static void Accumulator() {
		int total = 0;
		String another = "y";
		while (another.equals("y")) {
			int sum = 0;
			System.out.println("Enter a number");
			int num = input.nextInt();
			if (num > 0) {

				total = total + num;

				System.out.println("Is there another number?");

				another = input.next();
			} else {
				System.out.println("The total for all the numbers you inputed was " + total);
				break;
			}
		}

	}

	private static void Divider() {
		System.out.println("Input a number");
		double num1 = input.nextDouble();
		System.out.println("Input your second number");
		double num2 = input.nextDouble();
		if(num2 <= 0)
		{
			System.out.println("Pick a different number");
		}else {
		double answer = num1 / num2;
		System.out.println("The answer is " + answer + " when you divide " + num1 + " by " + num2);
		}
	}

	private static void BeverageSelector() {
		System.out.println("Enter a number to choose which beverage you want 1 - 3");
		int bev = input.nextInt();
		if(bev == 1)
		{
			System.out.println("You picked water!!");
		}else if (bev == 2)
		{
			System.out.println("you picked Coke!!");
		}else
		{
			System.out.println("You picked coffee!!");
		}
		
	}

	private static void MessagePrinter() {
		System.out.println("This is my first programming test");
		
	}
	}
