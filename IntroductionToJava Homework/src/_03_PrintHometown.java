import java.util.Scanner;

public class _03_PrintHometown {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your hometown: ");
		String town = input.nextLine();
		System.out.printf("Your home town is: %s", town);
	
	}
}
