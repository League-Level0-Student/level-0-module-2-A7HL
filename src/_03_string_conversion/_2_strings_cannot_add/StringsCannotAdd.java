package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			String fourAsString = JOptionPane.showInputDialog("enter number 4");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			String sixAsString = JOptionPane.showInputDialog("enter number 6");
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			String number1 =
					String.format("%s",fourAsString)+
					String.format("%s",sixAsString);
			JOptionPane.showMessageDialog(null, number1);
			// Did you notice 46 instead of 4 + 6 = 10?
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String fiveAsString = JOptionPane.showInputDialog("enter number 5");
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			String number2 =
					String.format("%s",fourAsString)+
					String.format("%s",sixAsString)+
					String.format("%s",fiveAsString);
			JOptionPane.showMessageDialog(null, number2);
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			int four = Integer.parseInt(fourAsString);
			// 7) Do the same for sixAsString. 
			int six = Integer.parseInt(sixAsString);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			int pain = four + six;
			JOptionPane.showMessageDialog(null, pain);
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			int five = Integer.parseInt(fiveAsString);
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			int morePain = four + six + five;
			JOptionPane.showMessageDialog(null, morePain);
			// Is your value now 15 instead of 465?
	}
}
