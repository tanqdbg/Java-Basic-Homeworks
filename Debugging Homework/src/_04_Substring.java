//You are given a text and number j. Your task is to search through the text for the letter 'p' (ASCII code 112)
//and print 'p' and j letters to its right.
//For example, we are given the text "phahah put" and the number 3. We find a match of 'p' in the first letter 
//so we print it and the 3 letters to its right. The result is "phah". We continue and find another match of 'p',
//but there aren't 3 letters to its right, so we only print "put". 
//Each match should be printed on a separate line. If there are no matches of 'p' in the text, we print "no".
//example:
//phahah put
//3
//output:
//phah
//put
//
//example2:
//preposition
//0
//output:
//p
//p
import java.util.Scanner;

public class _04_Substring {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		int jump = Integer.parseInt(input.nextLine());

		char search = 'p';
		boolean hasMatch = false;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == search) {
				hasMatch = true;

				int endIndex = i + jump + 1;

				if (endIndex > text.length()) {
					endIndex = text.length();
				}

				String matchedString = text.substring(i, endIndex);
				System.out.println(matchedString);
				i += jump;
			}
		}

		if (!hasMatch) {
			System.out.println("no");
		}
	}
}
