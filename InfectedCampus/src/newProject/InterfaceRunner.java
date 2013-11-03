package newProject;
import javax.swing.JFrame;

public class InterfaceRunner {
	InterfaceRunner() {
		Interface view = new Interface();
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(1000, 1000);
		view.setVisible(true);
		
		
	}
}
