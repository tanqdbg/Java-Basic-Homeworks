import java.util.Scanner;


public class _09_PointsInsidetheHouse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		float x = input.nextFloat();
		float y = input.nextFloat();

		float ax = 8.5f;
		float ay = 12.5f;
		float bx = 3.5f;
		float by = 17.5f;
		float cx = 22.5f;
		float cy = 8.5f;
		
		//roof
		boolean leftArrow = ((((bx-ax)*(y-ay))-(by-ay)*(x-ax)) <= 0);
		boolean rightArrow =  ((((bx-cx)*(y-cy))-(by-cy)*(x-cx)) >= 0);
		boolean bottomArrow =  ((((ax-cx)*(y-cy))-(ay-cy)*(x-cx)) >=0);
		boolean roof = (leftArrow && rightArrow && bottomArrow);
		//body
		boolean leftFoot = ((8.5<=y)&&(y<=13.5)&&(12.5<=x)&&(x<=17.5));
		boolean rightFoot = ((8.5<=y)&&(y<=13.5)&&(20<=x)&&(x<=22.5));	
		
		if (leftFoot||rightFoot||roof) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
