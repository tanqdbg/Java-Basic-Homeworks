//
//Write a program to read a text file "Input.txt" holding a sequence of integer numbers, each at a separate line.
//Print the sum of the numbers at the console. Ensure you close correctly the file in case of exception or 
//in case of normal execution. In case of exception (e.g. the file is missing), print "Error" as a result.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		File inputFile = new File("src/_08_Input.txt");
		
		try (Scanner input = new Scanner(inputFile);) {
			int result = 0;
			while (input.hasNextLine()) {
				int n = Integer.parseInt(input.nextLine());
				result += n;
			}
			System.out.println(result);

		} catch (FileNotFoundException fnfex) {
			System.err.println("Error");
		}
	}
}