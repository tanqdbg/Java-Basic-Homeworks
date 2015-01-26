import java.util.Scanner;


public class _08_CountOfEqualBitPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		String binnaryString = Integer.toBinaryString(x);
		System.out.println(binnaryString);
		int counter = 0;
		
		for (int i = 0,j = 1; i < binnaryString.length()-1; i++,j++) {
			
			//System.out.printf("i-%1$d ==%3$s  j-%2$d ==%4$s \n",i,j,binnaryString.charAt(i),binnaryString.charAt(i));
			if (binnaryString.charAt(i)== binnaryString.charAt(j)) {
				counter++;
			}
			
		}
		System.out.println(counter);
	}
}
