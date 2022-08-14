import java.util.Scanner;
import java.util.Random;
public class guessgame {

	// Global Variables
	static Scanner n = new Scanner(System.in);
	static int guess = 0, counter = 0;
	static int number = guessNumber();
	
	// numberGenerator
	public static int guessNumber() {
		Random gen = new Random();
		int number = gen.nextInt(100)+1;
		return number;
	}
	
	// displayTitle
	public static void displayTitle() {
		System.out.println(" Guess My Number");
		System.out.println("=====================================");
		System.out.println("");
	}
	
	
	
	
	public static void singlePlayer() {  
	    System.out.println("Single Player mode Selected."); 
	    System.out.println("");
	    displayTitle();
	    	    while (guess!=number) {
	    	System.out.println("===========================");
	    	System.out.print("Please guess a Number: ");
	    	guess = n.nextInt();
	    	System.out.println("===========================");
	    	
	    	counter++;
	    	if (number < guess)
	    		System.out.println("Your guess is Too High!");
	    	else if (number > guess)
	    		System.out.println("Your guess is Too Low!");
	    	System.out.println("");
	    }
	    System.out.println("========================================");
	    System.out.println("| Congrats! You've guessed the Number! |");
	    System.out.println("========================================");
	    System.out.println("The Number was: "+ guess);
	    System.out.println("It took you "+counter+ " tries!");
	    
	}
	
	// multiPlayer
	public static void multiPlayer() {
		System.out.println("Multiplayer mode Selected."); 
		System.out.println("");
		displayTitle();
		System.out.println("DEBUG: Number is "+ number); 
		int numFromPlayer1 = 0, numFromPlayer2 = 0;
		String winner = null;
		while (numFromPlayer1!=number && numFromPlayer2!=number) {
			System.out.println("================================");
			System.out.println("Player 1: Guess a Number: ");
			numFromPlayer1 = n.nextInt();
			System.out.println("================================");
			System.out.println("Player 2: Guess a Number: ");
			numFromPlayer2 = n.nextInt();
			System.out.println("================================");
			System.out.println("Player 1 Guessed "+ numFromPlayer1); 
			System.out.println("Player 2 Guessed "+ numFromPlayer2); 
			counter++;
			if (number < numFromPlayer1)
				System.out.println("Player 1: Your guess is Too High!");
			else if (number > numFromPlayer1)
				System.out.println("Player 1: Your guess is Too Low!");
			if (number <numFromPlayer2 )
				System.out.println("Player 2: Your guess is Too High!");
			else if (number > numFromPlayer2)
				System.out.println("Player 2: Your guess is Too Low!");
			System.out.println("");
		}
		if (numFromPlayer1==number) {
			System.out.println("============================");
			System.out.println("| Congrats! Player 1 Wins! |");
			System.out.println("============================");
			winner = "Player 1";
		}
		else if (numFromPlayer2==number) {
			System.out.println("============================");
			System.out.println("| Congrats! Player 2 Wins! |");
			System.out.println("============================");
			winner = "Player 2";
		}
		else if (numFromPlayer1==number && numFromPlayer2==number) {
			System.out.println("=========================");
			System.out.println("| Congrats? It's a TIE! |");
			System.out.println("=========================");
			winner = "Both Players";
		}
		System.out.println("The Number was: "+ number);
		System.out.println("It took "+ winner+ ": "+ counter+ " tries!");
		System.out.println("");
		if (numFromPlayer1!=numFromPlayer2) {
		System.out.println("A rating for the loser:");
		System.out.println("Guess Harder!");
		}
	}
	
	// main
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		displayTitle();
		System.out.println(" Singleplayer or Multiplayer?");
		System.out.print("Type 'S' for Singleplayer or 'M' for Multiplayer: ");
		char option = s.next().charAt(0);
		if (option == 'S')
			singlePlayer();
		else if (option == 'M')
			multiPlayer();
		else
			System.out.println("ERROR: Invalid Option!");
	}

}