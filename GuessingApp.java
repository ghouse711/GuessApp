/*

* Guessing App - UC5: Game Result storage
* Initializes Game
* Accepts user guesses
* Validate guesses using Validation service
* Handle game flow without crashing on invalid input
* Stop when game ends
* Stores game result at the end


* @author Developer
* @version 5.0

*/


import java.util.*;
import java.io.*;

public class GuessingApp{
	public static void main(String args[]) throws InvalidInputException{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the Guessing App");
		System.out.print("Enter Player Name: ");
		String player = scanner.nextLine();
		GameConfig config = new GameConfig();
		config.showRules();
		
		int attempts = 0;
		int hintsUsed = 0;
		
		boolean win = false;
		
		while(attempts < config.getMaxAttempts()){
			System.out.print("Enter your guess: ");
			int guess = ValidationService.validateInput(scanner.nextLine());
			attempts++;
			String result = GuessValidator.validateGuess(guess, config.getTargetNumber());
			
			if(!result.equals("CORRECT") && hintsUsed < config.getMaxHints()){
				hintsUsed++;
				System.out.println(HintService.generateHint(config.getTargetNumber(), hintsUsed));
			}
			System.out.println(result);
			
			if(result.equals("CORRECT")){
				win = true;
				break;
			}
		}
		StorageService.saveResult(player, attempts, win);
	}
}