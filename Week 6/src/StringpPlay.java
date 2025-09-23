
public class StringpPlay {

	public static void main(String[] args) {
		String str = "Computer Science combo class";
		
		int index = 12;
		
		char ch = 'F';
		
		System.out.printf("Origninal String = %s%n", str);
		
			
//		str = stringMod(index, ch, str);
		str = buildMod(index, ch, str);
		
		System.out.printf("Modified String = %s%n", str);
	}

	private static String buildMod(int index, char ch, String str) {
		StringBuilder string = new StringBuilder(str);
		string.setCharAt(index, ch);
		return string.toString();//toString allows you to build your string and return it as a string as well
	}//aka the return type was a string and not a string builder so you have to turn it back into a string

	private static String stringMod(int index, char ch, String str) {
		return str.substring(0, index) + ch + str.substring(index + 1);
	}

}
