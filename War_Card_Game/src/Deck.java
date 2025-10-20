import java.util.Random;

public class Deck {
	private Card[] cards;

	public Deck(int n) {
		this.cards = new Card[n];
	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;

		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				cards[index] = new Card(rank, suit);
				index++;
			}
		}

	}

	public Card[] getCards() {
		return cards;
	}

	public void shuffle() {
		for (int i = 0; i < cards.length - 1; i++) {
			swap(i, randomInt(i, cards.length));
		}
		// for each index of i {
		// choose a random number between i and length - 1
		// swap the ith card and the randomly chosen card
		// aka you need another card using "temp"
	}

	private static int randomInt(int low, int high) {
		Random rand = new Random();
		// return a random number between low and high
		// including both
		int num = rand.nextInt(high - low) + low;
		return num;
	}

	private void swap(int i, int j) {
		Card temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
	}

	public void printCards() {
		int n = 0;
		for (Card card : cards) {
			System.out.print(card + ", ");
			if (n % 13 == 0 && n != 0)
				System.out.println();
			n++;
		}
	}
}