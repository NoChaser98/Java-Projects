import java.util.Scanner;
import java.util.Random;

public class DiceGameClass {

static Random rand = new Random();
	//Static Variables

	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	//Print welcome message
	System.out.println("Welcome to the Red Blue Dice Game!");
	System.out.println("The first player to get five correct wins.");
	//Prompt for number of players
	System.out.print("How many players? ");
	int numberOfPlayers = scan.nextInt();

	String[] playersEntered = new String[numberOfPlayers];
	int[] playersScores = new int[numberOfPlayers];


	for(int i = 0; i < playersEntered.length; i++){
	System.out.print("Enter name for player # " + (i + 1) + ": ");
	String player = scan.next();
	playersEntered[i] = player;
	}

	int blueDiceTotal = rollDice("blue");
	
	boolean continueGame = true;
	while(continueGame) {
		for(int i = 0; i < playersEntered.length; i++){
			System.out.print(playersEntered[i]+ "'s turn. Will your roll be Higher or Lower? ");
			String higherOrLower = scan.next();
			int redDiceTotal = rollDice("red");
		if((higherOrLower.equals('H') && redDiceTotal < blueDiceTotal) || (higherOrLower.equals('L') && redDiceTotal > blueDiceTotal)){
			System.out.println("no point...next player's turn");
		}
		else{
			playersScores[i]++;
			System.out.println(playersEntered[i] + " earned a point!");
			showScores(playersEntered, playersScores);
			rollDice("blue");
			if(playersScores[i] == 5){
				System.out.println(playersEntered[i] + " won with 5 points!");
				continueGame = false;
				break;
			}
		}
		}
	}
	//Declare and create String array to contain player names
	//Declare and create int array to contain player scores
	//Use a loop to prompt for each player's name and put in the names array
	//Call rollDicemethod passing the literal String "blue" to start the game. 
	//-It will return the blue dice totalDeclare and initialize a booleanvariable to "true" to remain in the game loop


	}
	
	public static int rollDice(String dieColor){
			int sumOfDice = 0;
			System.out.print("Rolling the " + dieColor + " dice...rolled ");
			for(int i = 0; i < 3; i++) {
			int dieNumber = rand.nextInt(6) + 1;
			System.out.print(dieNumber + " ");
			sumOfDice = sumOfDice + dieNumber;
		}
		System.out.println("");
		return sumOfDice;
	}

	public static void showScores(String []playersEntered, int[] playersScores){
		System.out.println("********************");
		System.out.println("*  SCOREBOARD      *");
		System.out.println("********************");
		for(int i = 0; i < playersEntered.length; i++){
		System.out.printf("*%7s%3d        *\n", playersEntered[i], playersScores[i]);
	}
		System.out.println("********************");

		}

}