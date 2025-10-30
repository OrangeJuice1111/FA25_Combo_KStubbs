
public class War_Driver {

	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subDeck(0, 25));

		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26, 51));
		Pile center = null;
		int diff = -1;

		while (!p1.isEmpty() && !p2.isEmpty()) {
			if (diff != 0) {
				center = new Pile();
			}

			Card c1 = p1.popCard();
			Card c2 = p2.popCard();

			center.addCard(c1);
			center.addCard(c2);

			diff = c1.getRank() - c2.getRank();
			if (diff > 0) {
				while(center.isEmpty())
				{
					Card card = center.popCard();
					System.out.println(card);
					p1.addCard(card);
				}

			} else if (diff < 0) {
				while(!center.isEmpty())
				{
					Card card = center.popCard();
					System.out.println(card);
					p2.addCard(card);
				}
			} else {
				for (int i = 0; i < 3; i++) {
					if (!p2.isEmpty() && !p1.isEmpty()) {
						center.addCard(p1.popCard());
						center.addCard(p2.popCard());
					}
				}
			}
		}
		if (p2.isEmpty())
			System.out.println("Player 1 Wins!!");
		else
			System.out.println("Player 2 Wins!!");

//		deck.printCards();
//		System.out.println();
//		System.out.println();
//		//deck.bubbleSort();
//		//deck.InsertionSort();
//		deck.selectionSort();
//		deck.printCards();
	}

	private static int binSearch(Card[] cards, Card target) {
		int low = 0;
		int high = cards.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			int comp = cards[mid].compareTo(target);
			if (comp == 0)
				return mid;
			else if (comp < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
			System.out.println(low + ", " + high);
		}
		return -1;
	}

	private static int search(Card[] cards, Card target) {
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].equals(target))
				return i;
		}
		return -1;
	}

}
