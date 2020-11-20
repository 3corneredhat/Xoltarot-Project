package xoltarot.model;
public class Card {
	
	private String description; 
	private String name; 
	
	/**
	 * Constructor
	 * @param d The card description.
	 * @param n The card name.
	 */
	Card(String d, String n){
		
		this.description = d; 
		this.name = n; 
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

}
