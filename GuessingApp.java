/*

* Guessing App - UC4: Error handling & Validation
* Initializes Game
* Accepts user guesses
* Validate guesses using Validation service
* Handle game flow without crashing on invalid input
* Stop when game ends


* @author Developer
* @version 4.0

*/


import java.util.*;

public class GuessingApp{
	public static void main(String args[]) throws InvalidInputException{
		System.out.println("Welcome to the Guessing App");
		GameConfig config = new GameConfig();
		config.showRules();
		
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		
		int hintsUsed = 0;
		
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
			
			if(result.equals("CORRECT")) break;
		}
	}
}