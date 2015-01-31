import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		//verry short way
//		int bitsCounter = Integer.bitCount(x);
//		System.out.println(bitsCounter);
		
		String binnaryString = Integer.toBinaryString(x);
		//System.out.println(binnaryString);
		int counter = 0;
		
		for (int i = 0; i < binnaryString.length(); i++) {
			char one = '1';
			if (binnaryString.charAt(i) == one){
				counter++;
			}
		}
		System.out.println(counter);
		}
		
	}



