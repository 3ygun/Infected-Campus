package newProject;
import java.awt.FlowLayout;	//make it flow nice
import javax.swing.JFrame;	//windows features
import javax.swing.JLabel;	//text output
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;		//enter into a text box
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Interface extends JFrame {
	private JTextField inField;
	private JTextField disField;
	private JTextField mainField;
	private JButton startButton;
	private String myUserIn;
	
	Interface() {
		super("InfectedCampus");
		setLayout(new FlowLayout());
		
		mainField = new JTextField("picture",100);
		 mainField.setEditable(false);
		 add(mainField);
		disField = new JTextField("uneditable",100);
		 disField.setEditable(false);
		 add(disField);
		inField = new JTextField(100);
		 add(inField);
		startButton = new JButton();
		 
		 
		CheckInput cIn = new CheckInput();
		 inField.addActionListener(cIn);
		 startButton.addActionListener(cIn);
		 
	}
	
	
	public String getUserIn() {
		return myUserIn;
	}
	
	
	
	private class CheckInput implements ActionListener {
		public void actionPreformed(ActionEvent event) {
			if(event.getSource() == inField)
				myUserIn = String.format("%s", event.getActionCommand());
			else if(event.getSource() == startButton)
				new Runner();
			else
				{}
			JOptionPane.showMessageDialog(null,getUserIn());
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
