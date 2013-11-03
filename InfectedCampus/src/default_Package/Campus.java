package default_Package;
import java.util.ArrayList;

public class Campus implements Element {
	private ArrayList<String> mySubElements;
	private String myName;
	
 /*	Constructor	*/
	Campus() {
		myName = "campus";
		mySubElements.add("E6");
	}
	
 /*	Methods	*/	
	@Override
	public void build(int x, int y) {
		// Unused unless map function
	}

	@Override
	public ArrayList<String> subElement() {
		// Returns all the grids on campus
		return mySubElements;
		
	}

	@Override
	public String name() {
		// Returns the name
		return myName;
	}
	 
}
