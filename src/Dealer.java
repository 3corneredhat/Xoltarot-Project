import java.util.Collections;

public class Dealer {

	private Deck deck;
	private Card[] fortune;
	
	/**
	 * Constructor. Creates the deck, shuffles it, and initializes the array for the fortune.
	 */
	Dealer() {

		this.deck = new Deck();
		Collections.shuffle(deck.getDeck());
		this.fortune = new Card[3];
	}
	
	/**
	 * Shuffles the cards in the deck.
	 */
	public void shuffleDeck() {
		
	Collections.shuffle(deck.getDeck());
}
	
	/**
	 * Places 3 drawn cards to present as a fortune. 
	 */
	public void setFortune() {
		//Past
		fortune[0] = deck.getCard(0);
		//Present
		fortune[1] = deck.getCard(1);
		//Future
		fortune[2] = deck.getCard(2);
	}
	

}
