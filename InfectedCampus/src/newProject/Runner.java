package newProject;
import components.simplewriter.*;

public class Runner {
	
	Runner () {
		// Yes the Runner!!!!
	}
	
	
	public static void main (String[] args) {
		SimpleWriter out = new SimpleWriter1L();
		
		User survivor = new User();
		CampusGrid OSU = new CampusGrid();
		
		out.print(OSU.getCord());
		//out.print(survivor.getName());
		
		
		
		
	}
}
