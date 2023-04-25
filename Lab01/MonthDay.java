import javax.swing.JOptionPane;

public class MonthDay {
	public static void main(String args[]) {
		String[][] months = {
				{"January", "Jan.", "Jan", "1"},
				{"February", "Feb.", "Feb", "2"},
				{"March", "Mar.", "Mar", "3"},
				{"April", "Apr.", "Apr", "4"},
				{"May", "May", "May", "5"},
				{"June", "June", "Jun", "6"},
				{"July", "July", "Jul", "7"},
				{"August", "Aug.", "Aug", "8"},
				{"September", "Sept.", "Sep", "9"},
				{"October", "Oct.", "Oct", "10"},
				{"November", "Nov.", "Nov", "11"},
				{"December", "Dec.", "Dec", "12"}
		};
		boolean retry = true;
		String month;
		int monthNo = 0;
		int year = 0;
		
		while (true) {
			month = JOptionPane.showInputDialog(null, "Enter month:");
			try {
				year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year:"));
			} catch (Exception e) {
				year = -1;
			}
			
			outerLoop:
			for (int i = 0; i < months.length; i++) {
				for (int j = 0; j < months[i].length; j++) {
					if (month.equals(months[i][j])) {
						monthNo = i+1;
						retry = false;
						break outerLoop;
					}
				}
			}
			
			if (year < 0) {
				retry = true;
			}
			
			if(retry) {
				JOptionPane.showMessageDialog(null, "You have enter invalid values. Please try again.");
			} else {
				break;
			}
		}
		
		if ((monthNo < 8 && monthNo%2 == 1) || (monthNo > 7 && monthNo%2 == 0)) {
			JOptionPane.showMessageDialog(null, "The month has 31 days.");
		} else {
			if(monthNo == 2) {
				if(((year%400 == 0) || (year%100 != 0)) && (year%4 == 0)) {
					JOptionPane.showMessageDialog(null, "The month has 29 days.");
				} else {
					JOptionPane.showMessageDialog(null, "The month has 28 days.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "The month has 30 days.");
			}
		}
	}
	
}
