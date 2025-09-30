import java.util.Arrays;
import java.util.Random;

public class ArrayPlay {

	public static void main(String[] args) {
		
		
		int[] counts = { 1, 31, 43, 52 };
		double[] values;// [] makes it an array
		String words[] = { "hello", "world", "goodbye", "cruel","big","bad","contentious" };

		int index = findWord(words, "big");
		
		System.out.printf("found %s at index %d %n", words[index], index);
		
		words[index] = "bigger";
		
		index = findWord(words, "big");
		if(index >-1)
		{
			System.out.printf("found %s at index %d %n", words[index], index);
		}
		else
			System.out.println("Not Found");
		values = new double[10];
		for (int i = 0; i < values.length; i++) {
			values[i] = i;
		}

		double[] newVals = values;//makes a copy of data so its easy to change and wont mess up actual code

		System.out.println(Arrays.toString(values));// puts everything in one line and automatically add commas and
													// spaces
		for (int i = 0; i < newVals.length; i++) {
			System.out.println(newVals[i]);
			values[i] = i;
		}

		System.out.println(counts[2]);

		counts[2] = 0;

		System.out.println(counts[2]);

		counts[3] -= 25;

		System.out.println(counts[3]);

		System.out.printf("%s %s %s", words[2], words[3], words[1]);// %s is for calling a string word

		words[3] += words[0];
		System.out.println(words[3]);
		System.out.println(words[3].charAt(9));
		int[] randoms = createRandArr(10);
		printArray(randoms);
		int average= arrAvg(randoms);
		System.out.printf("The average of these numbers is %d", average);
		
		for (int num : randoms)
		{
			System.out.printf("%d, ", num);
		}
		System.out.println();
		for(String word : words)
		{
			System.out.printf("%s, ", word);
		}

	}

	private static int findWord(String[] words, String target) {
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(target)) return i;
		}
		return -1;//return -1 because it can never return because you cant have that in an Array
	}
		

	private static int arrAvg(int[] randoms) {
		int total = 0;
		for (int i = 0; i < randoms.length; i++) {
			total += randoms[i];
			
		}
		return total/randoms.length;
	}

	private static void printArray(int[] randoms) {
		for (int i = 0; i < randoms.length; i++) {
			System.out.printf("Index %d is %d. %n", i, randoms[i]);
		}
		
	}

	private static int[] createRandArr(int size) {
		Random rand = new Random();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100)+1;
		}
		return arr;
	}
}