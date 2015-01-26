import java.util.Scanner;

public class _05_DecimalToHexadecimal {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		System.out.println(String.format("%X", num));
	}

}
