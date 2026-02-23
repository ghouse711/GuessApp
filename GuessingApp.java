/*

* Guessing App - UC1: Game initialization
* Entry point and displays rules
* No user input or gamplay logic implemented yet

* @author Developer
* @version 1.0

*/


import java.util.*;

public class GuessingApp{
	public static void main(String args[]){
		System.out.println("Welcome to the Guessing App");
		GameConfig gameConfig = new GameConfig();
		gameConfig.showRules();
	}
}