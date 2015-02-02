//Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999).
//A number is symmetric if its digits are symmetric toward its middle. 
//For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int a = input.nextInt();
		int b = input.nextInt();
		if (b < a) {
			System.out.println("numbers are not in corect range");
		} else {

			for (int i = a; i <= b; i++) {
				int num = a;
				if (num <= 9) {
					System.out.print(num + " ");
				}
				if (10 <= num && num <= 99) {
					int firstDigit = num / 10;
					int secondDigit = num % 10;
					if (firstDigit == secondDigit) {
						System.out.print(num + " ");
					}
				}
				if (100 <= num && num <= 999) {
					int firstDigit = num / 100;
					int lastDigit = num % 10;
					if (firstDigit == lastDigit) {
						System.out.print(num + " ");
					}
				}
				a++;

			}
		}

	}

}
