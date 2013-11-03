package newProject;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import apcslib.*;


public class Build extends JFrame {
	/*
	 * Things to know about drawing the environment!:D
	 * 		-The coordinate grid start with the center of the screen being (0,0)
	 * 		
	 * 	  Our Project:
	 * 		> Picture display screen is 800 by 800 with the boarder cutting of 5 pixels
	 * 		> The prompt window is 1000 by 200
	 * 		> The actions window is 200 by 800
	 * 
	 * 		-Center of the picture display screen is (-100,100)
	 * 		-Center of the prompt window is (0,-400)
	 * 		-Center of the actions window is (400,100)
	 */
	private DrawingTool god = new DrawingTool(new SketchPad(1000,1000));
	
	Build() {
		new InterfaceRunner();
		god.setColor(Color.BLACK);
		god.fillRect(500, 500);
		//	Builds campus map
	}
	
	Build(D3Grid d3grid) {
		god.setColor(Color.RED);
		god.fillOval(50, 100);
		System.out.println("This is the D3 Grid");
	}
	
	Build(E3Grid e3grid) {
		god.setColor(Color.RED);
		god.fillOval(50, 100);
	}
	
//----------------------------------------------------------------------------------------------------------------
//	Private Methods
//----------------------------------------------------------------------------------------------------------------
	//private void deviding  
}
