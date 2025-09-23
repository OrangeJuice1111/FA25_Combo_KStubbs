
public class inClassLoops {

	public static void main(String[] args) {

		int count = countFor();

		System.out.println(count);

		int terms = 10;
		int rows =20;

		ForFibonacci(terms);

		rightTri(rows);
		
		equilTri(rows);

	}
	
	private static void equilTri(int rows) {
		for(int i = 1; i < rows + 1; i++)
		{
			for(int j = 0; j < rows - i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j < i + 1; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void rightTri(int rows) {
		for(int i = 0; i < rows; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	private static void ForFibonacci(int terms) {
		if (terms < 1) {
			System.out.println("please use postive integers only");
			return;// this isnt actually returning anything just stopping the method from
					// continuing
		}
		int firstTerm = 0;
		int secondTerm = 1;

		System.out.printf("Fibonacci sequence up to %d terms", terms);

		if (terms == 1) {
			System.out.println(firstTerm);
			return;
		}

		System.out.println(firstTerm + ", " + secondTerm);
		for (int i = 2; i < terms; i++) {
			int nextTerm = firstTerm + secondTerm;
			System.out.println(", " + nextTerm);

			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	private static int countFor() {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count = count + i;
		}
		return count;
	}

}
