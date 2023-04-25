import javax.swing.JOptionPane;

public class calculate {
	public static void main(String args[]) {
		double num1;
		double num2;
		double sum;
		double diff;
		double prod;
		double quot;
		String message = "";
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter first number.", "Calculator", JOptionPane.QUESTION_MESSAGE));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter second number.", "Calculator", JOptionPane.QUESTION_MESSAGE));
		
		sum = num1 + num2;
		diff = num1 - num2;
		prod = num1 * num2;
		quot = num1 / num2;
		
		message += num1 + " + " + num2 + " = " + sum + "\n";
		message += num1 + " - " + num2 + " = " + diff + "\n";
		message += num1 + " * " + num2 + " = " + prod + "\n";
		message += num1 + " \\ " + num2 + " = " + quot;
		
		JOptionPane.showMessageDialog(null, message, "Calculator", JOptionPane.INFORMATION_MESSAGE);
	}
}
