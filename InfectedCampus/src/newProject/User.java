package newProject;


public class User {
	private static String myName;
	private static boolean alive;
	
	
	User() {
		System.out.println("Made it to User!");
		//	Output on other screen
		myName = UserInput.assignName();
		alive = true;
	}
	
	public int getNextMove() {
		/*
		 * Get the list value, from the user, of the users next move
		 */
		int max=2; //# of elements displayed on the screen
		
		return UserInput.nextMove(max);
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public String getName() {
		return myName;
	}
	
}
