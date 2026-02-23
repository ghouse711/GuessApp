import java.util.*;
import java.io.*;

/*
* Exception used when user input fails validation
*/

public class InvalidInputException extends Exception{
	public InvalidInputException(String message){
		super(message);
	}
}