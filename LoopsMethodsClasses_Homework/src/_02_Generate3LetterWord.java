//Write a program to generate and print all 3-letter words consisting of given set of characters. 
//For example if we have the characters 'a' and 'b', all possible words will be
//"aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb". 
//The input characters are given as string at the first line of the input. Input characters are unique
//(there are no repeating characters). Examples:
//input x
//output = xxx	
//input ab
//output = aaa aab aba abb baa bab bba bbb	
//input: abx	
//output = aaa aab aax aba abb abx axa axb axx baa bab bax bba bbb bbx bxa bxb bxx xaa xab xax xba xbb xbx xxa xxb xxx
	
import java.util.Scanner;

public class _02_Generate3LetterWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < str.length(); j2++) {
					
					System.out.print("" +  str.charAt(i) + str.charAt(j) + str.charAt(j2) + " ");
				}
			}
		}
	}

}
