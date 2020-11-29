/**
 * The class that hold the information used in the help functionality.
 */
package xoltarot.model;

import java.util.HashMap;

public class Help {

	public HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	
	public Help(){
		
		hmap.put(0,"\tThe 'Today's Fortune' function generates a fortune for a specified inquiry. "
				+ "Inquiries must be limited to a single word. After entering the inquiry, you are "
				+ "then shown the cards for your fortune. Clicking each card shows the description in"
				+ "the text box. To save a fortune, simply click 'Save Fortune' and you will then be"
				+ "able to see you fortune in the future. To get a new fortune, click 'New Fortune,' "
				+ "enter your new inquiry, and click the deck to see your new fortune. Each card "
				+ "will offer insight to your topic regarding the past, present, and future!");
		hmap.put(1,"\tThe 'Card Search' function allows you to search for a specific card in the Major"
				+ "Arcana and view the description. This can be done by searching for the name of the"
				+ "card or by selecting one from the list. After choosing a card, clicking the 'Display "
				+ "Card Description' will load a pop up window and also display the card image.");
		hmap.put(2,"\tThe 'Past Fortunes' function allows you to see your past fortunes. Clicking the"
				+ "'Show Past Fortune' button loads all of your previous fortunes. The information"
				+ "that is displayed is the date, the topic of inquiry, and the cards for Past, "
				+ "Present, and Future.");
	}
	
	public String getDescription(int n) {
		return hmap.get(n);
	}
	
}
