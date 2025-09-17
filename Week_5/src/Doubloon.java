import java.util.Scanner;

public class Doubloon {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//a word is said to be a doubloon is said to be one if every word appears exactly twice
		System.out.println("Enter a word and I will tell you if its a Doubloon");
		String word = input.next();
		word = word.toLowerCase();//sets everything to lowercase so your answers line up with the parameters
		boolean isDub = isDoubloon(word);
		
		if(isDub)
		{
			System.out.println("It's a Doubloon!!");
		}else
		{
			System.out.println("No doubloon's here");
		}
	}
	private static boolean isDoubloon(String word) {
		int len = word.length();
		
		for (int i = 0; i < len; i++) {//loops through each letter
			int count = 0;
			char letter = word.charAt(i);//loops thorugh counting to check how many times each letter shows up
			for(int j = 0; j <len; j++)
			{
				if(word.charAt(j) == letter)
				{
					count++;
				}
			}
			if(count != 2)
			{
				return false;
			}
			
		}
		return true;
	}

}
