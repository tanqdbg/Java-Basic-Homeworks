
public class TestPositionPointLine {

	public static void main(String[] args) {
		float x = 15f;
		float y = 6f;
		
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
		System.out.println(leftArrow);
		System.out.println(rightArrow);
		System.out.println(bottomArrow);

	}

}
