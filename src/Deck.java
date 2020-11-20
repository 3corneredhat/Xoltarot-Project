package application;

import java.util.ArrayList;

public class Deck {

	public ArrayList<Card> deck = new ArrayList<Card>();
	private Card tarotCard;
	
	/**
	 * Creates a deck of tarot cards.
	 */
	public Deck() {

		tarotCard = new Card("The Fool", "The Fool is a card of new beginnings, " 
				+ "opportunity and potential. Just like the young man, "
				+ "you are at the outset of your journey, " 
				+ "standing at the cliff�s edge, and about to take "
				+ "your first step into the unknown. Even though you "
				+ "don�t know exactly where you are going, you are being "
				+ "called to commit yourself and follow your heart, no "
				+ "matter how crazy this leap of faith might seem to you. "
				+ "Now is a time when you need to trust where the Universe " 
				+ "is taking you.");
		deck.add(tarotCard);

		tarotCard = new Card("The Magician", "As a master manifestor, the " 
				+ "Magician brings you the tools,"
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
				+ "translates in many ways � elegance, sensuality, fertility, creative expression, nurturing � and is necessary "
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
				+ " around you to manifest your goal. You listen to the advice of others, but you prefer to have the final say. Conflict doesn�t "
				+ "scare you, and you won�t hesitate to use your power to protect those you care about. And in return, those people will repay you "
				+ "with the loyalty and respect you deserve. Claim your authority as leader and influencer and "
				+ "don�t let others put you down.");
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
		
		tarotCard = new Card("Strength", "The Strength card represents strength, determination, and power � like the Chariot. However, while the Chariot "
				+ "signifies outer strength and will, the Strength card speaks to the inner strength and the human spirit's ability to overcome any obstacle. "
				+ "Strength is about knowing you can endure life�s obstacles. You have great stamina and persistence, balanced with underlying patience and inner "
				+ "calm. You are committed to what you need to do, and you go about it in a way that shows your composure and maturity.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Hermit", "The Hermit shows that you are taking a break from everyday life to draw your energy and attention inward and find the answers "
				+ "you seek, deep within your soul. You realise that your most profound sense of truth and knowledge is within yourself and not in the distractions of the "
				+ "outside world. You leave behind the mundane to set off on a journey of self-discovery, led only by your inner wisdom and guiding light. Now is the perfect "
				+ "time to go on a weekend retreat or sacred pilgrimage, anything in which you can contemplate your motivations, personal values and principles, and get closer to "
				+ "your authentic self.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Wheel of Fortune", "The Wheel of Fortune reminds you that the wheel is always turning and life is in a state of constant change. If you�re going "
				+ "through a difficult time rest assured that it will get better from here. Good luck and good fortune will make their return in time. Similarly, if things are "
				+ "going well, know this, too, will change and life may return to �normal� soon. This cycle shows why it is so important to cherish the blissful moments in your "
				+ "life and make the most of them while they are within reach � because in a flash they could be gone.");
		deck.add(tarotCard);
		
		tarotCard = new Card("Justice" , "The Justice card represents justice, fairness, truth and the law. You are being called to account for your actions and will be judged "
				+ "accordingly. If you have acted in alignment with your Higher Self and for the greater good of others, you have nothing to worry about. However, if you haven�t,"
				+ " you will be called out and made to own up to your actions. If this has you shaking in your boots, know that the Justice card isn�t as black and white as you "
				+ "may think. A level of compassion and understanding accompany Justice, and although you may have done something you regret, this card suggests that you will be "
				+ "treated fairly and without bias. Be ready to take responsibility for your actions and stand accountable for the ensuing consequences.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Hanged Man", "The Hanged Man reminds you that sometimes you have to put everything on hold before you can take the next step, or the Universe "
				+ "will do it on your behalf (and it may not always be at the most convenient time!). You may have heard the saying, �What got you here won�t get you there�, and "
				+ "that indeed is at play in this card. The Hanged Man calls you to release the old mental models and behavioural patterns that no longer serve you so you can see "
				+ "your world from a new perspective and embrace new opportunities that would have otherwise been hidden from you if you didn�t hit the brakes.");
		deck.add(tarotCard);
		
		tarotCard = new Card("Death", "After a period of pause and reflection with the Hanged Man, the Death card symbolises the end of a major phase or aspect of your life that you "
				+ "realise is no longer serving you, opening up the possibility of something far more valuable and essential. You must close one door to open another. You need to put "
				+ "the past behind you and part ways, ready to embrace new opportunities and possibilities. It may be difficult to let go of the past, but you will soon see its importance "
				+ "and the promise of renewal and transformation. If you resist these necessary endings, you may experience pain, both emotionally and physically, but if you exercise your "
				+ "imagination and visualise a new possibility, you allow more constructive patterns to emerge.");
		deck.add(tarotCard);
		
		tarotCard = new Card("Temperance", "Temperance is the card for bringing balance, patience and moderation into your life. You are being invited to stabilise your energy and "
				+ "to allow the life force to flow through you without force or resistance. It�s time to recover your flow and get your life back into order and balance.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Devil", "The Devil card represents your shadow (or darker) side and the negative forces that constrain you and hold you back from being the best "
				+ "version of yourself. You may be at the effect of negative habits, dependencies, behaviours, thought patterns, relationships, and addictions. You have found yourself "
				+ "trapped between the short-term pleasure you receive and the longer-term pain you experience. Just as the Lovers card speaks to duality and choice, so too does the Devil; "
				+ "however, with the Devil, you are choosing the path of instant gratification, even if it is at the expense of your long-term well-being. In effect, you have sold your "
				+ "soul to the devil!");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Tower", "When the Tower card appears in a Tarot reading, expect the unexpected � massive change, upheaval, destruction and chaos. It may be a divorce, "
				+ "death of a loved one, financial failure, health problems, natural disaster, job loss or any event that shakes you to your core, affecting you spiritually, mentally and "
				+ "physically. There�s no escaping it. Change is here to tear things up, create chaos and destroy everything in its path (but trust me, it�s for your Highest Good).");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Star", "As the Star follows the Tower card in the Tarot, it comes as a welcome reprieve after a period of destruction and turmoil. You have endured many "
				+ "challenges and stripped yourself bare of any limiting beliefs that have previously held you back. You are realising your core essence, who you are beneath all the layers. "
				+ "No matter what life throws your way, you know that you are always connected to the Divine and pure loving energy. You hold a new sense of self, a new appreciation for the "
				+ "core of your Being.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Moon", "The Moon represents your fears and illusions and often comes out when you are projecting fear into your present and your future, based on your past "
				+ "experiences. You may have a painful memory that caused emotional distress, and rather than dealing with the emotions you pushed them down deep into your subconscious. Now, "
				+ "these emotions are making a reappearance, and you may find yourself under their influence on a conscious or subconscious level. For example, if you had a car accident when "
				+ "you were young but didn�t deal with the emotions, you may get sad or anxious every time you get into the backseat of a car. To remedy this, connect with your subconscious "
				+ "mind and release any fears or anxieties holding you back. Hypnosis, therapy and shamanic healing can support this process.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The Sun", "The Sun represents success, radiance and abundance. The Sun gives you strength and tells you that no matter where you go or what you do, your positive "
				+ "and radiant energy will follow you and bring you happiness and joy. People are drawn to you because you can always see the bright side and bring such warmth into other people�s "
				+ "lives. This beautiful, warm energy is what will get you through the tough times and help you succeed. You are also in a position where you can share your highest qualities and "
				+ "achievements with others. Radiate who you are and what you stand for; shine your love on those you care about.");
		deck.add(tarotCard);
		
		tarotCard = new Card("Judgement", "The Judgement card is calling you to rise up and embrace a higher level of consciousness for the service of your Highest Good. You are experiencing a "
				+ "spiritual awakening and realising that you are destined for so much more. This is your cosmic up-levelling! You hear the call and are ready to act. Tune in to a higher "
				+ "frequency. Let go of your old self and step into this newest version of who you really are.");
		deck.add(tarotCard);
		
		tarotCard = new Card("The World", "When the World card appears in a Tarot reading, you are glowing with a sense of wholeness, achievement, fulfilment and completion. A long-term project, "
				+ "period of study, relationship or career has come full circle, and you are now revelling in the sense of closure and accomplishment. This card could represent graduation, a "
				+ "marriage, the birth of a child or achieving a long-held dream or aspiration. You have finally accomplished your goal or purpose. Everything has come together, and you are "
				+ "in the right place, doing the right thing, achieving what you have envisioned. You feel whole and complete.");
		deck.add(tarotCard);
	}

	/**
	 * Gets the card object.
	 * @param pos The position of the card in the deck.
	 * @return The card object from the deck.
	 */
	Card getCard(int pos) {
		return deck.get(pos);
	}
	
	/**
	 * @return Returns the deck object for manipulation in other classes.
	 */
	ArrayList<Card> getDeck(){
		return deck; 
	}
}
