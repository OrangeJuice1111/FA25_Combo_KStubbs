import java.util.Scanner;

public class Stringhomework {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many strings will you input?");
		int num = input.nextInt();
		String[] array = new String[26];
		
		bubblesort(array);
		
	}
	public static void bubblesort(String[] array) {
		  for (int i=0; i<array.length-1; i++) // Insert i'th record
		    for (int j=1; j<array.length-i; j++)
		      if (array[j-1].compareTo(array[j])
		        swap(array, j-1, j);
		}
}