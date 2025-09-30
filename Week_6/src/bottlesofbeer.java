import java.util.Scanner;

public class bottlesofbeer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many bottles of beer do you have?");
		int bottle = input.nextInt();
		int bottles = bottle;
		while(bottles > 1)
		{
			System.out.println(bottles + " bottles of beer on the wall " + bottles + " bottles of beer");
			bottles --;
			System.out.println("take one down pass it around " + bottles + " of beer on the wall");
		}
		System.out.println("1 bottle of beer on the wall 1 bottle of beer");
		System.out.println("take it down pass it around no more bottles of beer on the wall");
		System.out.println("0 bottles of beer on the wall 0 bottles of beer");
		System.out.println("go to the store buy some more " + bottle + " bottles of beer on the wall");
	}

}
