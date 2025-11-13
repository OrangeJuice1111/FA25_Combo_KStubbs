import java.io.*;
import java.util.Scanner;

public class TotalCalculation {

	public static void main(String[] args) {
		double total = 0.0;
		double sTax = 0.053;

		try {
			Scanner fileReader = new Scanner(new File("items.txt"));
			while (fileReader.hasNextDouble()) 
			{
				total += fileReader.nextDouble();
			}
			fileReader.close();

			double Tax = total * sTax;
			double fTotal = total + Tax;

			PrintWriter fileWriter = new PrintWriter(new File("total.txt"));
			fileWriter.printf("Total: $%.2f\n", total);
			fileWriter.printf("Tax: $%.2f\n", Tax);
			fileWriter.printf("Total + Tax : $%.2f\n", fTotal);
			fileWriter.close();

			System.out.println("Results written in total.txt");

		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
