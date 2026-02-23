import java.util.*;
import java.io.*;

/*
* Handles game lifecycle decisions
* Decides whether the game should restart or exit based on user choice
*/

public class GameController{
	
	public static boolean restartGame(Scanner scanner){
		System.out.print("Do you want to play again? (yes/no)");
		return scanner.nextLine().equalsIgnoreCase("yes");
	}
	
}