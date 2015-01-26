import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		float y = input.nextFloat();
		float z = input.nextFloat();
				
		//first - x to hexadecimal
		System.out.printf("|%-10X|", x);
		
		// second - x to binary
		int binaryNum = Integer.parseInt(Integer.toBinaryString(x));
		System.out.printf("%010d|", binaryNum);
		
		//third - y with 2 digits after the decimal point, right aligned;
		System.out.printf("%10.2f|",y);
		
		//last - z  with 3 digits after the decimal point, left aligned
		System.out.printf("%-10.3f|",z);
		}

}
