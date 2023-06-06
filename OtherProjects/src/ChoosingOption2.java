import javax.swing.JOptionPane;

public class ChoosingOption2 {
	public static void main(String args[]) {
		String[] options = {"I do", "I don't"};
		int choose = JOptionPane.showOptionDialog(null, "Do you want to change to first class ticket?", "Message", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
		JOptionPane.showMessageDialog(null, "You've chosen: " + (choose == JOptionPane.YES_OPTION?options[0]:options[1]));
	}
}
