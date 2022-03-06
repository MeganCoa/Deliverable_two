import java.util.Scanner;

public class CountHeadsOrTails {
	

	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);//Create a Scanner Object to take user imput
		
		System.out.println("Heads or Tails?");
		String headsOrTailsGuess = scrn.nextLine().toLowerCase();
		
		System.out.println("How many times would you like to flip the coin?");
		int numberOfFlips = scrn.nextInt();
		int correctCount;
		
		if (headsOrTailsGuess.equals("heads")){
			System.out.println("Guesses of Heads:");
		}
		else if (headsOrTailsGuess.equals("tails")) {
			
		}
		else {
			System.out.println("Incorrect input");
		}
		
	}

}
