import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	private ArrayList<Card> deck;
	private Card tarotCard;

	void createDeck() {

		tarotCard = new Card("The Fool", "The Fool is a card of new beginnings, " 
				+ "opportunity and potential. Just like the young man, "
				+ "you are at the outset of your journey, " + "standing at the cliff‘s edge, and about to take "
				+ "your first step into the unknown. Even though you "
				+ "don’t know exactly where you are going, you are being "
				+ "called to commit yourself and follow your heart, no "
				+ "matter how crazy this leap of faith might seem to you. "
				+ "Now is a time when you need to trust where the Universe " 
				+ "is taking you.");
		deck.add(tarotCard);

		tarotCard = new Card("The Magician", "As a master manifestor, the " + "Magician brings you the tools,"
				+ " resources and energy you need to make your dreams come true. Seriously, everything "
				+ "you need right now is at your fingertips. You have the spiritual "
				+ "(fire), physical (earth), mental (air) and emotional (water) resources "
				+ "to manifest your desires. And when you combine them with the energy of "
				+ "the spiritual and earthly realms, you will become a manifestation powerhouse! "
				+ "The key is to bring these tools together synergistically so that the "
				+ "impact of what you create is greater than the separate parts. This is "
				+ "alchemy at its best!");
		deck.add(tarotCard);

		tarotCard = new Card("The High Priestess", "The High Priestess is the guardian of the "
				+ "subconscious mind and the teacher of sacred knowledge and hidden mysteries. Sitting "
				+ "at the threshold of the conscious and subconscious mind, the High Priestess has an innate "
				+ "ability to travel between these realms effortlessly. She teaches you that the world is not always "
				+ "as it seems and more profound influences are often at play. She ushers you through the thin veil of "
				+ "awareness, offering you a deep, intuitive understanding of the Universe and a heightened "
				+ "awareness of secret or hidden informatio.");
		deck.add(tarotCard);

		tarotCard = new Card("The Empress", "The Empress signifies a strong connection with our femininity. Femininity "
				+ "translates in many ways – elegance, sensuality, fertility, creative expression, nurturing – and is necessary "
				+ "for creating balance in both men and women. The Empress calls on you to connect with your feminine energy. Create "
				+ "beauty in your life. Connect with your senses through taste, touch, sound, smell and sight. Draw on these senses to "
				+ "experience pleasure and deep fulfilment. Treat yourself to a day spa, learn massage, enjoy a fine restaurant or spend "
				+ "more time with your partner. Discover different approaches to expressing yourself creatively, be it through painting, "
				+ "music, drama or other art forms. This may be the perfect chance to take up a new hobby that enables you to access this "
				+ "part of yourself.");
		deck.add(tarotCard);

		tarotCard = new Card("The Emperor", "The Emperor represents a powerful leader who demands respect and authority. Status, power and "
				+ "recognition are essential to you, and you are most comfortable in a leadership role where you can command and direct others. "
				+ "As a leader, you rule with a firm but fair hand. You have a clear vision of what you want to create, and you organise those"
				+ " around you to manifest your goal. You listen to the advice of others, but you prefer to have the final say. Conflict doesn’t "
				+ "scare you, and you won’t hesitate to use your power to protect those you care about. And in return, those people will repay you "
				+ "with the loyalty and respect you deserve. Claim your authority as leader and influencer and "
				+ "don’t let others put you down.");
		deck.add(tarotCard);

		tarotCard = new Card("The Hierophant","The Hierophant card represents an established set of spiritual values and beliefs and is often "
				+ "correlated with religion and other formal doctrines. Before you can discover your own belief systems and make your own choices "
				+ "(as associated with the next card, the Lovers), the Hierophant encourages you to learn the fundamental principles from a trusted"
				+ " source.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Lovers", "The Lovers card represents conscious connections and meaningful relationships. "
				+ "The arrival of this card in a Tarot reading shows that you have a beautiful, soul-honouring connection with a loved one. You may"
				+ " believe you have found your soul mate or life partner, and the sexual energy between you both goes way beyond instant "
				+ "gratification and lust to something that is very spiritual and almost Tantric. While the Lovers card typically refers to a romantic"
				+ " tie, it can also represent a close friendship or family relationship where love, "
				+ "respect and compassion flow.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Chariot", "The Chariot is a card of willpower, determination and strength. You have discovered how to make decisions in "
				+ "alignment with your values with the Lovers card, and now you are taking action on those decisions. When the Chariot appears in a Tarot "
				+ "reading, take it as a sign of encouragement. You have set your objectives and are now channelling your inner power with a fierce dedication "
				+ "to bring them to fruition. When you apply discipline, commitment and willpower to achieve your goals, "
				+ "you will succeed."); 
		deck.add(tarotCard);
		
	}

	void shuffleDeck() {
		Collections.shuffle(deck);
	}

	Card getCard(int pos) {
		return deck.get(pos);
	}
}
