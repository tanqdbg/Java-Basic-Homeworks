import java.util.Scanner;

public class _06_BitRotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		byte number = Byte.parseByte(input.nextLine());
		// System.out.println(Integer.toBinaryString(number));
		byte rotations = Byte.parseByte(input.nextLine());

		for (int i = 0; i < rotations; i++) {
			String direction = input.nextLine();

			if (direction.equals("right")) {
				int rightMostBit = number & 1;
				number >>>= 1;
				number |= rightMostBit << 5;

			} else if (direction.equals("left")) {
				int leftMostBit = (number >> 5) & 1;// take bit of position 1;
				number &= (~(1 << 5));// put 0 on position1;
				number <<= 1;
				number |= leftMostBit;
			}
		}
		System.out.println(number);
	}
}
