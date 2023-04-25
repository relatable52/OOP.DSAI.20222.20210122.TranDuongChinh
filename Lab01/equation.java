import javax.swing.JOptionPane;

public class equation {
	public static void main(String args[]) {
		int mode = 0;
		
		mode = chooseMode();
		
		switch(mode) {
			case 0:
				linearOne();
				break;
			case 1:
				linearTwo();
				break;
			case 2:
				secondOrder();
				break;
		}
	}
	
	private static int chooseMode() {
		String sel;
		String options[] = {
				"Linear one variable",
				"Linear system two variable",
				"Second order one variable"
		};
		int res = 0;
		
	    sel = JOptionPane.showInputDialog(
	    		null,
	    		"Choose the type of equation",
	    		"Calculator",
	    		JOptionPane.QUESTION_MESSAGE,
	    		null,
	    		options,
	    		options[0]
	    ).toString();
	    
	    for (int i = 0; i < options.length; i++) {
	    	if (sel.equals(options[i])) {
	    		res = i;
	    	}
	    }
	    
	    return res;
	}
	
	private static void linearOne() {
		double a = Double.parseDouble(showInput("a ="));
		double b = Double.parseDouble(showInput("b ="));
		
		if (a == 0) {
			showMessage("Parameter a can not be 0.");
		} else {
			double res = -b/a;
			showMessage("x = " + res);
		}
	}
	
	private static void linearTwo() {
		double a11 = Double.parseDouble(showInput("a11 ="));
		double a12 = Double.parseDouble(showInput("a12 ="));
		double b1 = Double.parseDouble(showInput("b1 ="));
		double a21 = Double.parseDouble(showInput("a21 ="));
		double a22 = Double.parseDouble(showInput("a22 ="));
		double b2 = Double.parseDouble(showInput("b2 ="));
		double d = a11*a22 - a12*a21;
		double d1 = b1*a22 - b2*a12;
		double d2 = b2*a11 - b1*a21;
		
		if (d == 0) {
			if (b2/a21 == b1/a11) {
				showMessage("System has infinitely many solutions.");
			}else {
				showMessage("System has no solutions.");
			}
		}else {
			double x1 = d1/d;
			double x2 = d2/d;
			
			showMessage("x1 = " + x1 + "\n" + "x2 = " + x2);
		}
	}
	
	private static void secondOrder() {
		double a = Double.parseDouble(showInput("a ="));
		double b = Double.parseDouble(showInput("b ="));
		double c = Double.parseDouble(showInput("c ="));
		double dis = b*b - 4*a*c;
		
		if(dis == 0) {
			showMessage("x =" + (-b/(2*a)));
		}
		if(dis > 0) {
			showMessage("x1 = " + ((-b + Math.sqrt(dis)) / (2*a)) + "\n" + "x2 = " + ((-b - Math.sqrt(dis)) / (2*a)));
		}
		if(dis < 0) {
			showMessage("Equation has no roots.");
		}
				
	}
	
	private static void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Calculator", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static String showInput(String message) {
		return JOptionPane.showInputDialog(null, message, "Calculator", JOptionPane.QUESTION_MESSAGE);
	}
}


