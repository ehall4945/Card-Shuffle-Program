public class Program09 {

	public static void main(String[] args) {
		int[] deck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35};
		System.out.println("-------------------------------------------------------------------");
		System.out.println("*****AFTER INNIT*****");
		//Call initDeck method with deck array as parameter
		initDeck(deck);
		//Print empty line and dashes to separate pre and post shuffle
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("*****AFTER SHUFFLE*****");
		//Call displayDeck method with deck array as parameter
		displayDeck(deck);
		System.out.println("-------------------------------------------------------------------");
	}
	
	public static int cardValue(int card) {
		//Return integer [1, 9] of card and assign its value
		//Declare cardVal variable as (card % 9) + 1
		//then return the new value associated with cardVal
		int cardVal = (card % 9) + 1;
		return cardVal;
		
	}
	
	public static String cardSuit(int card) {
		//Return the assigned suit of card value
		//Declare cardSuit int as card / 9
		int cardSuit = (int)(card / 9);
		
		//If statements to determine what suit card gets based off of *int* (card / 9)
		if (cardSuit == 0) {
			return("C");
		} else if (cardSuit == 1) {
			return("S");
		} else if (cardSuit == 2) {
			return("H");
		} else {
			return("D");
		}
	}
	
	public static void displayCard(int card) {
		//Prints card (Both value and suit)
		//Print the result of CardValue method with card as parameter
		System.out.print(cardValue(card));
		//Print the result of cardSuit method with card as parameter
		System.out.println(cardSuit(card));
	}
	
	public static void initDeck(int[] deck) {
		//Assign elements of deck, such that each element's value is equal to its index
		//Declare int card variable and set it to 0
		int card = 0;
		//Create for loop to iterate through each element in cards array
		//then assign the card suit with it as well and print it
		for(int i = 0; i < deck.length; i++) {
			//Card variable gets assigned the element of array deck at index i
			card = deck[i];
			//Use new value for deck at index i as a parameter of displayCard method
			displayCard(card);
		}
		
	}
	
	public static void shuffleDeck(int[] deck, int n) {
		//Generate two random numbers: j and k, each in range [0, 35]
		//Swap values of deck and indices j and k, do this n times		
		
		//For loop to iterate through each element of deck array "n" times (36 times)
		for (int i = 0; i < n; i++) {
			//Use math random method for integers j and k
			int j = (int)(Math.random() * 36);
			int k = (int)(Math.random() * 36);
			//Create temporary array for purpose of swapping
			//then swap array elements to give "shuffle" effect
			int temp = deck[j];
			deck[j] = deck[k];
			deck[k] = temp;
			//Then call displayCard method with temp as a parameter
			displayCard(temp);
		}
	}
	
	public static void displayDeck(int[] deck) {
		//Prints cards in deck in a reasonable format
		//Set int n to the length of elements in deck array
		int n = deck.length;
		//Then call shuffleDeck method with deck array and n as parameters
		shuffleDeck(deck, n);
	}
}

