
import java.util.Arrays;
import java.util.Scanner;


public class _08_SortArayOfStrings {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input n = ");
		int n = input.nextInt();
		input.nextLine();
		String[] words = new String[n]; 
		for (int i = 0; i < words.length; i++) {
			words[i] = input.nextLine();
		}
		Arrays.sort(words);
		for (String word : words) {
			System.out.println(word);
		}
	}
}
