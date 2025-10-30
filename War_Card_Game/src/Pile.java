import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> cards;
	
	public Pile() {
		this.cards = new ArrayList<Card>();//<> is referencing the what the array list is going to be made of
	}
	
	public int size()
	{
		return this.cards.size();
	}

	public Card popCard()
	{
		return this.cards.remove(0);//0 is the top card/ first card in the pile
	}//remove takes it from the pile and puts it "into your hand" so you can move it around but its no longer connected to the pile
	
	public void addCard(Card card)
	{
		this.cards.add(card);
	}
	
	public boolean isEmpty()
	{
		return this.cards.isEmpty();
	}
	public void addDeck(Deck deck)//sending the function a Deck named deck aka could be (Deck mine) and you would send it a deck named mine
	{
		for(Card card: deck.getCards())
		{
			this.cards.add(card);
		}
	}
}
