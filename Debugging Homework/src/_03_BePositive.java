//You will receive some sequences of numbers on the console; your task is to remove all negative numbers and print back each sequence. 
//On the first line of input you are given a count N – the number of sequences. 
//On each of the next N lines you will receive some numbers surrounded by whitespaces. 
//You need to check each number, if it’s positive – print it on the console; if it’s negative, 
//add to its value the value of the next number and only print the result if it’s not negative.
//example: 
//	3
//3 -4    5 2  123 
//-1 -1 3 4
//-2       1
//output : 
//3 1 2 123
//3 4
//(empty)
import java.util.ArrayList;
import java.util.Scanner;

public class _03_BePositive {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		int countSequences = scn.nextInt();
		scn.nextLine();

		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split(" ");
			ArrayList<Integer> numbers = new ArrayList<>();

			for (int j = 0; j < input.length; j++) {

				if (!input[j].equals("")) {
					int num = Integer.parseInt(input[j]);
					numbers.add(num);
				}
			}
			boolean found = false;
			for (int j = 0; j < numbers.size(); j++) {				
				int currentNum = numbers.get(j);
			if (currentNum >= 0) { 
				System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
				found = true;
			} 
			
			else if(j+1 < numbers.size()){ 
				if (j == (numbers.size() - 1)) break;
				currentNum += numbers.get(j + 1);		
				
				if (currentNum >= 0) {
					System.out.printf("%d%s", currentNum, j+1 == numbers.size() - 1 ? "\n" : " ");
					found = true;
				}		
				j++;
			}
		}
			
			if (!found) {
				System.out.println("(empty)");
			}

		}
	}
}//40 points  :(
