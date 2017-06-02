/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = {"1","2","3"};
		String[] suit = {"Spades","Hearts","Diamonds"};
		int[] value = {1,2,3};
		Deck deck = new Deck(rank,suit,value);
		
		System.out.println(deck.size());
		System.out.println(deck.isEmpty());
		System.out.println(deck.deal());
	}
}
