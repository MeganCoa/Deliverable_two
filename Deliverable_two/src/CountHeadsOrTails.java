import java.util.Scanner;
import java.lang.Math;

public class CountHeadsOrTails {
	public static void coinflip(String headsOrTailsGuess, int numberOfFlips) {
		float correctCount = 0;
		float percentageCorrect = 1;
	
		
		for (int i = 0; i < numberOfFlips; i++) {
			int rand = (int)(Math.random() * ((100 - 1) + 1)) + 1 ;//random number from 0 to 100
			
			if (rand%2 == 1) {
				System.out.println("heads");
				if(headsOrTailsGuess.equals("heads"))
				{
					correctCount++;
				}
			}
				else {
					System.out.println("tails" );
					if(headsOrTailsGuess.equals("tails"))
					{
						correctCount++;
					}
				}
		}
		percentageCorrect = (correctCount/numberOfFlips) * 100;
		
		System.out.println("Your guess " + headsOrTailsGuess + ", came up " + correctCount + " time(s)."
					+ "\n" + "That's " + percentageCorrect + "%");
	}
	

	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);//Create a Scanner Object to take user imput
		
		System.out.println("Guess which will have more: heads or tails?");
		String headsOrTailsGuess = scrn.nextLine().toLowerCase();
		
		System.out.println("How many times shall we flip a coin?");
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
		
		coinflip(headsOrTailsGuess, numberOfFlips);
		
	}

}
