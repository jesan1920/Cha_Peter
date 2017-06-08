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
		String[] rank = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] suit = {"Hearts", "Diamonds", "Spades", "Clubs"};
		int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
            
		
		Deck deck = new Deck(rank,suit,value);
		
		System.out.println(deck.size());
		System.out.println(deck.isEmpty());
		System.out.println(deck.deal());
		System.out.println(deck);
	}
}
