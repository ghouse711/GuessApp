import java.util.*;

/*
* Compares user's guesses with target
*/


public class GuessValidator{
	public static String validateGuess(int guess, int target){
		if(guess == target) return "CORRECT";
		else if(guess < target) return "LOW";
		return "HIGH";
	}
}