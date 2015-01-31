//Write an instruction compiler that receives an arbitrary number of instructions. 
//The program should parse the instructions, execute them and print the result. 
//The following instruction set should be supported:
//•	INC <operand1> - increments the operand by 1
//•	DEC <operand1> - decrements the operand by 1
//•	ADD <operand1> <operand2> - performs addition on the two operands
//•	MLA <operand1> <operand2> - performs multiplication on the two operands
//•	END – end of input
//The result of each instruction should be printed on a separate line on the console.
//example:MLA 252621 324532
//END	
//81983598372

import java.util.Scanner;

public class _02_InstructionSet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String opCode = input.nextLine();

		while (!opCode.equals("END")) {
			String[] codeArgs = opCode.split("\\s"); // −2147483648 ...
														// 2147483647
			long result = 0;
			switch (codeArgs[0]) {
			case "INC": {
				int operandOne = Integer.parseInt(codeArgs[1]);
				result = (long) operandOne + 1;
				break;
			}
			case "DEC": {
				int operandOne = Integer.parseInt(codeArgs[1]);
				result = (long) operandOne - 1;
				break;
			}
			case "ADD": {
				int operandOne = Integer.parseInt(codeArgs[1]);
				int operandTwo = Integer.parseInt(codeArgs[2]);
				result = (long) operandOne + (long) operandTwo;
				break;
			}
			case "MLA": {
				int operandOne = Integer.parseInt(codeArgs[1]);
				int operandTwo = Integer.parseInt(codeArgs[2]);
				result = (long) operandOne * (long) operandTwo;
				break;
			}
			default:
				break;
			}

			System.out.println(result);
			opCode = input.nextLine();
		}
	}
}
