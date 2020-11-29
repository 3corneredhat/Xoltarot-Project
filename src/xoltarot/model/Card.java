/**
 * The Card class used to represent a card object. 
 */
package xoltarot.model;
public class Card {
	
	public final int number;
	public final String name; 
	public final String description; 
	
	
	/**
	 * Constructor
	 * @param num The card number.
	 * @param n The card name.
	 * @param d The card description.
	 */
	Card(int num, String n, String d){
		
		this.number = num;
		this.name = n; 
		this.description = d; 
	}
	
	/**
	 * @return The card description.
	 */
	public String getDescription() {
		
		return description; 
	}
	
	/**
	 * @return The card name.
	 */
	public String getName() {
		
		return name; 
	}
	
	/**
	 * @return The card number.
	 */
	public int getNum() {
		
		return number; 
	}

}
