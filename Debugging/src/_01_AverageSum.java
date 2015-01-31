import java.util.Scanner;

public class _01_AverageSum {

	public static void main(String[] args) {
		byte number = 59;

		System.out.println(Integer.toBinaryString(number));

		int leftMostBit = (number >> 5) & 1;//take bit of position 1;
		System.out.println(Integer.toBinaryString(leftMostBit));
		
		number &= (~(1 << 5));//put 0 on position1;
		System.out.println(Integer.toBinaryString(number));
		number <<= 1;
		System.out.println(Integer.toBinaryString(number));
		
		number |= leftMostBit;
		System.out.println(Integer.toBinaryString(number));

	}
}
