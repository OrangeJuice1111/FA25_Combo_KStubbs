import java.util.Scanner;

public class BookWork {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//x = y;
		//x == y;
		//x != y;
		// x >= y;
		//these only work on primative objects aka non capital commands
		int x =10;
		if (x > 0)
		{
			System.out.println("x is positive");
		}else if (x < 0)
		{
			System.out.println("X is negative");
		}else
		{
			System.out.println("X is zero");
		}
		if(x % 2 == 0)
		{
			
			System.out.println("X is even");
		}else
		{
			System.out.println("X is odd");
		}
		
		System.out.println("Enter a number between 1-5");
		int num = input.nextInt();
		String word;
		
		switch(num)
		{
			case 1:
				word = "One";
				break;
			case 2:
				word = "Two";
				break;
			case 3:
				word = "Three";
				break;
			case 4:
				word = "Four";
				break;
			case 5:
				word = "Five";
				break;
			default://this tells the program what to do if we get an input that doesn't hit the parameters
				word = "unknown";
				break;
		}
		System.out.println(word);
		int n = 10;
		while (n > 0)//condition//used when we don't know how many times something will have to run
		{
			System.out.println(n);
			n--;//this is a changer
			//if you change it to n-x where x is any number and it will then proceed to count by that number in whatever direction you specify
		}
		System.out.println("blast off");
	//init, condition, changer all in one	
		for(int i = 0; i < 10; i++)// called array loops because we know exactly how many times it will run
		{//make sure to use i in for loops or otherwise issues
			System.out.println(i);
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.println();
		}
		
		System.out.println("enter the number of columns for the times table");
		int cols = input.nextInt();
		
		System.out.println("enter the number of rows for the times table");;
		int rows = input.nextInt();
		
		for(int i = 0; i <= rows; i++)
		{
			for(int j = 0; j <= cols; j++)//when you have already used i in a for loop use j next for simplicity when they are both in the same operation
			{
				System.out.printf("%4d", (i * j));//when there is a % inside a print f it tells it how to format aka 4 spaces and a digit and in this case digit is i*j
			}
			System.out.println();
		}

		for(char c = 'A', count = 0; c <= 'z'; c++, count++)
		{
			if(count % 10 == 0)System.out.println();
			System.out.print(c + " ");

			
		}
		System.out.println("Done");
	}
	
}
