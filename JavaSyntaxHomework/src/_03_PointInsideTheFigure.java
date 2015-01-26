import java.util.Scanner;

public class _03_PointInsideTheFigure {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		float x = input.nextFloat();
		float y = input.nextFloat();
		Boolean upperPart = ((12.5<=x)&&(x<=22.5)) && ((6<=y)&&(y<=8.5)); 
		Boolean leftPart = ((8.5<=y)&&(y<=13.5)) && ((12.5<=x)&&(x<=17.5)); 
		Boolean rightPart = ((8.5<=y)&&(y<=13.5)) && ((20<=x)&&(x<=22.5)); 
		
		if (upperPart||leftPart||rightPart) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}

	}

}
