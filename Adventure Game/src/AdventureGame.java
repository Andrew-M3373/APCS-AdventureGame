import java.util.Scanner;
public class AdventureGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to your adventure game!");
		System.out.println("When faced with two paths, which path do you take?\n"
				+ "1:\tLeft\n2:\tRight");
		Scanner userIntInput = new Scanner(System.in);
		int value = userIntInput.nextInt();
		if (value == 1) {
			System.out.println("Too bad, the monster in the cave ate you alive.");
			gameOver(); 
		}
		else if (value == 2) {
			System.out.println("You live to see another day!\nThere is a "
					+ "cave and a cliff, which do you walk towards?\n1:\tCave\n2:\tCliff");
		}
		
		
		
		
		value = userIntInput.nextInt();
		if (value == 1) {
			System.out.println("Welcome to the dark cave.\nThe underground river is flowing very fast. "
					+ "Do you try to swim across the river or \nclimb around the edge?"
					+ "\n1:\tSwim across\n2:\tClimb around");
		}
		else if (value == 2) {
			System.out.println("The cliff was unstable, and the loose rock caused you"
					+ " to fall off the cliff.");
			gameOver(); 
		}
		
		
		
		
		value = userIntInput.nextInt();
		if (value == 1) {
			System.out.println("The river was flowing too fast which caused you to fall"
					+ " and hit your head on a rock.");
			gameOver();
		}
		else if (value == 2) {
			System.out.println("After climbing around the river, you find a shallow spot and"
					+ "walk to the other side. \nYou spot an opening in the rock and exit the cave.\n"
					+ "\nCongrats! You have won the game!!"); 
			System.exit(0);
		}
		
	}
	
	
	public static void gameOver() {
		System.out.println("Game over, you lost. Play again soon!");
		System.exit(0);
	}

}
