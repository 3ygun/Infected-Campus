package default_Package;
import java.util.ArrayList;

public interface Element {
	
	public void build (int x, int y);
		/*	Draws the picture	*/
	public ArrayList<String> subElement ();
		/*	Returns a list of the subElement is the Element	
		 * 		Ex. Element	=	Room
		 * 		Ex. Sub Element = Desk, File
		 */
	public String name ();
		/*	Returns the name of the element	*/
	
	
}
