package newProject;
import components.simplereader.*;
import components.simplewriter.*;

public class UserInput {
	private static SimpleReader in = new SimpleReader1L();
	
	UserInput() {}
	
	public static String assignName() {
		return in.nextLine();
	}
	
	public static int nextMove(int max) {
		int move = in.nextInteger();
		while(move > 0 && move <= max)
		{
			System.out.print("You have entered an invalid command, please enter a valid command: ");
			move = in.nextInteger();
		}
		
		return move;
	}
}
