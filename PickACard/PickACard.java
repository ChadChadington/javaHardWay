class Card
{
	int value;
	String suit;
	String name;
	
	public String toString()  //this method toString ... is auto-magical --> prints out the return value instead of the memory address
	{
		return name + " of " + suit;
	}
}

public class PickACard {
	public static void main ( String[] args ) {
		Card[] deck = buildDeck();
		//displayDeck (deck);
	
		int chosen = (int)(Math.random()*deck.length);
		Card picked = deck[chosen];
	
		System.out.println("You picked a " + picked + " out of the deck. ");
		System.out.println("In Blackjack your card is worth " + picked.value + " points. ");
	}
	public static Card[] buildDeck() {
		String[] suits = { "clubs", "diamonds", "hearts", "spades" };
		String[] names = { "ZERO", "ONE", "two", "three", "four", "five", "six",
			"seven", "eight", "nine", "ten", "Jack", "Queen", "King", "Ace" }; // ZERO and ONE are garbage values for debugging purposes
		
			int i = 0;
			Card[] deck =  new Card[52];
	
			for (String s: suits ){
				for ( int v = 2; v <= 14; v++ ) {
					Card c = new Card();
					c.suit = s;
					c.name = names[v];
					if (v == 14 ) 
						c.value = 11;
					else if ( v > 10 )
						c.value = 10;
					else
						c.value = v;
			
					deck[i] = c;
					i++;
				}
			}
		return deck;
	}
	public static void displayDeck( Card[] deck ){
		for ( Card c : deck )
			System.out.println(c.value + "\t" + c);
	
	}
}



