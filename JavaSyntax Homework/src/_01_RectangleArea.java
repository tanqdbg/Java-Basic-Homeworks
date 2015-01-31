import java.util.Scanner;

public class _01_RectangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number a = ");
		int a = input.nextInt();
		System.out.print("Input number b = ");
		int b = input.nextInt();
		int area = a * b;
		System.out.printf("%d",area);

	}

}
