import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the numerical grade you received?");
		int num = input.nextInt();
		if(num >= 92) 
		{
			System.out.println("You got an A!!");
		}else if (num == 91 || num >= 89)
		{
			System.out.println("You got an A-");
		}else if (num == 91 || num >= 89)
		{
			System.out.println("You got an ");
		}else if (num == 89 || num >= 87)
		{
			System.out.println("You got an A-");
		}else if (num == 91 || num >= 89)
		{
			System.out.println("You got an A-");
		}else if (num == 91 || num >= 77)
		{
			System.out.println("You got an A-");
		}else if (num == 76 || num >= 72)
		{
			System.out.println("You got an C");
		}else if (num == 71 || num >= 69)
		{
			System.out.println("You got an C-");
		}else if (num == 68 || num >= 67)
		{
			System.out.println("You got an D+");
		}else if (num == 66 || num >= 59)
		{
			System.out.println("You got an D");
		}else if (num == 60 || num >= 0)
		{
			System.out.println("You got an f :(");
		}else
		{
			System.out.println("error this number doesnt count");
		}

	}

}
