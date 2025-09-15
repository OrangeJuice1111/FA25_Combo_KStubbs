
public class StringsWork {

	public static void main(String[] args) {
		String word = "bananas";
		
		for(int i = 0; i < word.length(); i++)//.lenth can be used to do an action for the length of a word
		{
			System.out.println(word.charAt(i));
		}
		String reversed = reverse(word);
		System.out.println(reversed);
		
	}

	private static String reverse(String word) {
		String r = "";
		for(int i = word.length()-1; i >= 0; i--)
		{
			r += word.charAt(i);
		}
		return r;
	}
}
