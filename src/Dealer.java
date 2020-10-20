
public class Dealer {

	private Deck deck;
	private Card[] fortune;

	Dealer() {

		this.deck = new Deck();
		this.fortune = new Card[3];
		this.deck.shuffleDeck(); 

	}
	
	public void setFortune() {
		
		fortune[0] = deck.getCard(0);
		fortune[1] = deck.getCard(1);
		fortune[2] = deck.getCard(2);
	}
	

}
