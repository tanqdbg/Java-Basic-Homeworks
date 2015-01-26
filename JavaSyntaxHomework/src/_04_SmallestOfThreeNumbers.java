import java.util.Scanner;

public class _04_SmallestOfThreeNumbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float smallest = Math.min(a, (Math.min(b,c)));
		
		System.out.println(smallest);
		
		

	}

}
