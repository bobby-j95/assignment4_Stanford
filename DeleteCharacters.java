import acm.program.*;
import acm.util.*;
import java.util.Scanner;

/*This program takes a character given by the user,
 * finds the string also given by the user and deletes that character.
 * Created by Robert Johns
 */

public class DeleteCharacters extends ConsoleProgram {

	public void run() {
		String line = "This is a test";
		char character = 'i';
		println(removeAllOccurrences(line, character));
	}

	/*This checks the whole string for the character that is similar to
	 * the character given. If it is the same, delete the character out
	 * of the string. Print the new string.
	 */
	public String removeAllOccurrences(String str, char ch) {
		String newLine = null;
		for (int x = 0; x < str.length(); x++) {
			if (ch != str.charAt(x)) {
				if (newLine == null) {
					newLine = str.substring(x,x+1);
				}else {
					newLine += str.charAt(x);
				}
			}
		}
		return newLine;
	}

}
