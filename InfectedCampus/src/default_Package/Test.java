package default_Package;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter first number");
		String sn = JOptionPane.showInputDialog("Enter first number");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"The answer is "+sum, "OSU", JOptionPane.PLAIN_MESSAGE);	}
}
