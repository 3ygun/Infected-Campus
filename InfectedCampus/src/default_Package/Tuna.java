package default_Package;
import java.awt.FlowLayout;	//make it flow nice
import javax.swing.JFrame;	//windows features
import javax.swing.JLabel;	//text output
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;		//enter into a text box
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class Tuna extends JFrame {
	/*//private JLabel item1;
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;
	
	public Tuna() {
		super("The title");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here");
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("Mypass");
		add(passwordField);
		
		thehandler hangler = new thehandler();
		item1.addActionListener(hangler);
		item2.addActionListener(hangler);
		item3.addActionListener(hangler);
		passwordField.addActionListener(hangler);
		
	}
	
	private class thehandler implements ActionListener {
		public void actionPreformed(ActionEvent event) {
			String string = "";
			
			if(event.getSource() == item1)
				string=String.format("Field 1: %s", event.getActionCommand());
			else if(event.getSource() == item2)
				string=String.format("Field 1: %s", event.getActionCommand());
			else if(event.getSource() == item3)
				string=String.format("Field 3: %s", event.getActionCommand());
			else if(event.getSource()==passwordField)
				System.out.print("");
				
		}
	}*/
	
	/*
	public Tuna() {
		super("the Title bar");
		setLayout(new FlowLayout())
		
		item1 = new JLabel("jkhkhkjhkjhkhkjhjhkj");
		item1.setToolTipText("jhjhgjgjgjgjhgjhgjhghjgjhghfdtsesaweas");
		add(item1);
		
	}*/
}
