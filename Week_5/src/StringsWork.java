import java.util.Scanner;

public class StringsWork {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String word = "bananas";
		
		for(int i = 0; i < word.length(); i++)//.lenth can be used to do an action for the length of a word
		{
			System.out.println(word.charAt(i));
		}
		System.out.println(word.charAt(2)+ " is the " + (word.indexOf("n", 3)+1) + " letter");
		
		System.out.println(word.substring(0, 3));// the (0, 3) starts at the first letter and prints (0,1,2) but not the letter at the spot 3
		System.out.println(word.substring(3, 6));
		System.out.println(word.substring(0,3) + "d" + word.substring(3));//inserts the letter d after the 3rd letter
		
		
		
		String reversed = reverse(word);
		System.out.println(reversed);
		
		
		System.out.println("Shall we go?");
		String answer = input.nextLine();
		answer = answer.toLowerCase();//will change any input to lower case letters
		
		if( answer.equals("yes"))// for Strings you use .equals instead of == to use or read an input
		{
			System.out.println("Lets GO!!!");
		}else
		{
			System.out.println("Wha, Wha, Whaaaaa.....");
		}
		
		String name1 = "Alan Turning";
		String name2 = "Ada Lovelace";
		int diff = name1.compareTo(name2);//this means if name 1 comes before name2 you get a -1 if name 2 comes first you get a 1
		
		if(diff < 0)
		{
			System.out.println(name1 + " comes before " + name2);//spaces before and after the words in the "" so that it will read normally becuase the input that comes after doesnt have a space at the beggining and just sldies in how it is inputed
		}else if (diff > 0)
		{
			System.out.println(name2 + " comes before " + name1);
		}else
		{
			System.out.println("the name are the same");
		}
		
		System.out.println("Enter the hour");
		int hour = input.nextInt();
		System.out.println("Enter the minute");
		int min = input.nextInt();
		
		String time = timeString(hour, min);
		System.out.println(time);
	}

	private static String timeString(int hour, int min) {
		String ampm;
		if( hour < 12)
		{
			ampm = "AM";
			if(hour == 0)
			{
				hour = 12;
			}
		}else
		{
			ampm = "PM";
			hour = hour -12;
		}
		return String.format("%02d:%02d %s", hour, min, ampm);//tells us take up 2 spaces and add a zero if it takes up only 1 space
	}

	private static String reverse(String word) {
		String r = "";
		for(int i = word.length()-1; i >= 0; i--)//-1 is there so that you stay in bounds
		{
			r += word.charAt(i);
		}
		return r;
	}
}
