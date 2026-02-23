import java.util.*;

/*
* Exception used when user input fails validation
*/

public class InvalidInputException extends Exception{
	public InvalidInputException(String message){
		super(message);
	}
}