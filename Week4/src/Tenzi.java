import java.util.Random;
import java.util.Scanner;

public class Tenzi {

	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		System.out.println("how many players?");
		int numPlayers = input.nextInt();
		final int MAX = 5;
		int winner = -1;

		int[] picks = new int[numPlayers];
		int[] scores = new int[numPlayers];
		fillScores(scores);
		printScores(scores);
		getPicks(picks);

		while (winner == -1) {
			for (int i = 0; i < 10; i++) {
				int num = rand.nextInt(6) + 1;
				System.out.println(num + " ");
				checkPicks(picks, scores, num);
			}
			System.out.println();
			printScores(scores);
			winner = checkWinner(MAX, scores);
		}
		System.out.printf("player %d wins TENZI!!");
		int num = rand.nextInt(6) + 1;
		System.out.println(num);

	}

	private static int checkWinner(int MAX, int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= MAX)
				return i;
		}
		return -1;// return -1 because you could have a player 0 but not a player -1
	}

	private static void checkPicks(int[] picks, int[] scores, int num) {
		for (int i = 0; i < picks.length; i++)// dont put ; after for loop or otherwise error
		{
			if (picks[i] == num)
				scores[i]++;
		}

	}

	private static void getPicks(int[] picks) {
		for (int i = 0; i < picks.length; i++) {
			System.out.printf("player %d pick a number between 1-6", i + 1);
			picks[i] = input.nextInt();
		}

	}

	private static void printScores(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("player %d -> %d %n",i +1, scores[i]);

		}
		System.out.println();

	}

	private static void fillScores(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = 0;

		}

	}

}
