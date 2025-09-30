package week7;

import java.util.Scanner;

public class BinaryConverter {

	static Scanner input = new Scanner(System.in); 
	public static void main(String[] args) {
		//456
		//4 in the hundreds, 5 in the tens, 6 in the ones
		//10^2 , 10 ^1, 10^0
		
		//10111 ---> 23
		//1 in the ones, 1 in the twos, 1 in the fours, zero in the eight, 1 in the sixteens
		//23 / 2 -> 11 with an r of 1
		//11 / 2 -> 5 with an r of 1
		//5 / 2 -> 2 with an r of 1
		//2 / 2 -> 1 with an r of 0
		// 1 / 2 -> 0 with an r of 1
		
		System.out.println("Enter the number you wish to convert");
		int num = input.nextInt();
		
		displayBin(num);
	}
	private static void displayBin(int num) {
		if(num > 0)
		{
			displayBin(num / 2);
			System.out.print(num % 2);
		}
		
	}

}
