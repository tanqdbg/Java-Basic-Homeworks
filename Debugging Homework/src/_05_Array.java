//		You are given a number n representing the size of an array of integers and on the next line the elements of
//		the array separated by whitespace. Then, you are given an arbitrary number of commands in the format:
//		“[action] [i-th element] [value]”. The commands end when you receive the string “stop”.
//		The action can be “multiply”, “add”, “subtract”, “rshift” or “lshift”. The actions “multiply”, “add” and
//		“subtract” have parameters. The first parameter is the number of the element that needs to be changed.
//		The second parameter is the value with which we manipulate the element. The command “lshift” iterates
//		through the array changing each element's position with 1 to the left. The first element which should go
//		outside the array will eventually become last. E.g. {1, 2, 3} “lshift” will become {2, 3, 1}. The command
//		“rshift” does the same thing but changes the positions with 1 to the right.The last element which should
//		go outside the array, becomes first. E.g. {1, 2, 3} “rshift” will become {3, 1, 2}.
//example:
//5
//3 0 9 333 11
//add 2 2
//subtract 1 1
//multiply 3 3
//stop
//output:
//3 2 9 333 11
//2 2 9 333 11
//2 2 27 333 11

import java.util.Scanner;

public class _05_Array {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];

		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong();
		}

		String command = scn.next();
		while (!command.equals("stop")) {

			String line = scn.nextLine().trim();
			int[] params = new int[2];

			if (command.equals("add") || command.equals("subtract")
					|| command.equals("multiply") || command.equals("lshift")
					|| command.equals("rshift")) {

				String[] stringParams = line.split(" ");
				if (command.equals("lshift")|| command.equals("rshift")) {
					params[0] = 1;
					params[1] = 1;					
				}else {
					params[0] = Integer.parseInt(stringParams[0]);
					params[1] = Integer.parseInt(stringParams[1]);
				}
				
				int[] parameters = new int[] { params[0], params[1] };
				performAction(array, command, parameters);
				printArray(array);
				System.out.print('\n');
				command = scn.next();
			}
		}
	}

	static void performAction(long[] array, String action, int[] params) {
		int pos = params[0];
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos - 1] *= (long) value;
			break;
		case "add":
			array[pos - 1] += (long) value;
			break;
		case "subtract":
			array[pos - 1] -= (long) value;
			break;
		case "lshift":
			arrayShiftLeft(array);
			break;
		case "rshift":
			arrayShiftRight(array);
			break;
		default:
			break;
		}
	}

	private static void arrayShiftRight(long[] array) {
		long temp = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = temp;
	}

	private static void arrayShiftLeft(long[] array) {
		long temp = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		array[array.length - 1] = temp;
	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
