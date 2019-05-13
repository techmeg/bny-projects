/**
 * 
 */
package march19week;

import java.util.Arrays;

/**
 * @author margaret.parsons
 *
 */
public class deckOfCards {

	/**
	 * pick four random cards from a deck
	 */
	public static void main(String[] args) {
		// declare and size arrays for deck and random cards
		int[] deck = new int[52];
		int numberRandoms = 6;

		String[] randCardVal = new String [numberRandoms];
		String[] randCardSuit = new String [numberRandoms];
		
		//initialize cards
		for(int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		//shuffle deck
		for(int i = deck.length-1; i>0; i--) {
			int j =(int)(Math.random()*(i));
			
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}

		//evaluate random cards
		for (int i=0; i<numberRandoms; i++) {
		//assign suits
			if (deck[i]/13 == 0) {
				randCardSuit[i] = "Spades";
			}else if (deck[i]/13 == 1) {
				randCardSuit[i] = "Hearts";
			}else if (deck[i]/13 == 2) {
				randCardSuit[i] = "Diamonds";
			}else if (deck[i]/13 == 3) {
				randCardSuit[i] = "Clubs";
			}
		//assign card names	
			if (deck[i]%13>0 && deck[i]%13< 11){
			randCardVal[i]=Integer.toString((deck[i]%13+1));
			}else if (deck[i]%13==0) {
				randCardVal[i] = "Ace";
			}else if (deck[i]%13==10) {
				randCardVal[i] = "Jack";
			}else if (deck[i]%13==11) {
				randCardVal[i]= "Queen";
			}else if (deck[i]%13==12) {
				randCardVal[i] = "King";
			}
			System.out.println("Card " + i + ": " + randCardVal[i] + " of " + randCardSuit[i]);
		}
		System.out.println(Arrays.toString(deck));
	}
}//try Vernon's solution setting suit and card decks and using expressions as the address
