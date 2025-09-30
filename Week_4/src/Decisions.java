import java.util.Scanner;

public class Decisions {
	 static Scanner input = new Scanner(System.in);//scanner is used for input
	 //when moving this outside of main you have to add a static or otherwise it will be mad at you 
	public static void main(String[] args) {
		
		// x == y -> does x = y?
		//x != -> is x not equal to y?
		//x > y -> is x greater than y
		//x < is x less than  y
		//x >= y
		//x < = y
		
		int x =10;
		if(x % 2 == 0)// if you put a ; after the if you arent able to run an else statement because
			//you already ended the statement
		//everything in the () will be evaluated in a boolean statement aka true of false
		{
			System.out.println("x is even");
		}else
		{
			System.out.println("x is odd");
			
		}
		
		if(x > 0)
		{
			System.out.println("x is positive");
		}
		else if (x < 0)
		{
			System.out.println("x is negative");
		}else
		{
			System.out.println("x is zero");//arrays and bites start at zero otherwise we would lose data
			
		}
		
		System.out.println("Enter a number from 1 to 4");
		int num = input.nextInt();
		if (num == 1)// == stands for equivalent to
		{
			System.out.println("one");
		}else if (num ==2)
		{
			System.out.println("two");
		}else if (num == 3)
		{
			System.out.println("three");
		}else 
		{
			System.out.println("four");
		}
		
		switch(num)
		{
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;// break tells the system to stop
				//if you didnt have a break it would output every num until the end instead of just the one you inputed
				
		}
		
		String food = "bannana";
		
		switch(food)
		{
		//if(food == "apple" || food == "banana" || food "cherry") is the other way to write whats below but a little more confusing 
			case "apple":// case is followed by a : and not a ;
			case "bannana":
			case "cherry":
				System.out.println("Fruit");
				break;// break is followed by a ;
			case "broccoli":
			case "carrot":
			case "peas":
				System.out.println("Veggie");
				break;
		}
		
//		if(x > 0 && x < 10); //numbers 1-9 also || means or
		// x < 0 || x > 10 any number not 1-9 because it had to be less than zero or greater than 10
		//!(x > 0) any negative number
		x = 4;
		int y =0;
		
		if(x==0)
		{
			if (y==0)
			{
				System.out.println("both x and y are zero");
			}
				
		}
		if(x== 0 && y == 0)System.out.println("Both are zero");
		//this form is considered quick and dirty and is used for debugging
		if(x==0 || y == 0)System.out.println("either x or y is zero");
		
		//!(a && b) is the same as !a || !b
		//!(a || b) is the same as !a && !b
		//! stands for not
		//&& stands for and
		
		//and goes before or when there are no parenthesis 
		//parenthesis are important
		
		boolean flag;
		flag = true;// works as an if the "hero" or "monster" is alive keep fighting 
		//if flag flips to false stop the fight
		
		
		System.out.println(isSingleDigit(0));
		int userNum = getNum();
		while(!isSingleDigit(userNum))
		// dont need == because a boolean is a true or false 
		{
			System.out.println("that is not a single digit");
			userNum = getNum();
		}
		System.out.println("great job following instructions");
	}
	private static int getNum() {
		System.out.println("enter a single digit number");
		int userNum = input.nextInt();
		return userNum;
	}
	public static boolean isSingleDigit(int num)//has to be a public static because we are outside of main
	//not a public static void because we are returning something
	{
		return num > -10 && num < 10;//this will tell if the num is a single digit or not
	}
}

