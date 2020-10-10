import acm.program.*;
import acm.util.*;
import java.util.Scanner;

/*This program takes an integer given by the user and inputs commas for the number!
 * Created by Robert Johns
 */
public class numericStrings extends ConsoleProgram {

	//Run was given to us in the program directions
	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}

	private String addCommasToNumericString(String d) {
		/*If the length of the number is greater than 999,
		 * starts from the last number in the string and works backwards Adds commas
		 * every 3 numbers.
		 * It also doesn't add a comma if x is 0.
		 * Returns string to be printed.
		 */
		int count = 1;
		if (d.length() > 2) {
			for (int x = d.length() - 1; x >= 0; x--) {
				if ((count % 3 == 0) && (x > 0)) {
					d = d.substring(0, x) + "," + d.substring(x);
				}
				count++;
			}
		}
		return d;
	}

}
