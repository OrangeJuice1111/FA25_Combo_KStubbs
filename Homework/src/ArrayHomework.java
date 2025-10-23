import java.util.Scanner;

public class ArrayHomework {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Values, enter -1 to stop");
		
		int[] array = new int[100];
		for(int i = 0; i < 100; i++) {
			int in = input.nextInt();
			array[i]= in;
			if (in == -1)
				break;
		}
		int index = 99;
			for(int i = 99; i > 1; i--)
			{
				if(array[i] == -1)
				{
					index = i-1;
					break;
				}
				
			}
			for(int i = index; i >= 0; i--)
			{
				System.out.println(array[i]);
			}
			

		
	}
	
	
}