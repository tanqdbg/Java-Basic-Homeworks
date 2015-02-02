//Write a method to convert from degrees to radians. Write a method to convert from radians to degrees.
//You are given a number n and n queries for conversion. Each conversion query will consist of
//a number + space + measure. Measures are "deg" and "rad". Convert all radians to degrees and all degrees to radians.
//Print the results as n lines, each holding a number + space + measure.
//Format all numbers with 6 digit after the decimal point. Examples:
//input
//3
//180 deg
//90 deg
//3 rad
//output
//3.141593 rad
//1.570796rad
//171.887339 deg

	
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < number; i++) {
					
		String[] str = input.nextLine().split(" ");
		Double degree = Double.parseDouble(str[0]);
		String measure = str[1];
		
		if (measure.equals("deg")) {
			DegreToRadConvertor(degree);
			continue;
		}
		else if(measure.equals("rad"));
			RadinToDegreeConvertor(degree);
        }
		}

	private static void RadinToDegreeConvertor(double degree) {
		// TODO Auto-generated method stub
		double newValueDegree = (double) ((degree * 180) / Math.PI);
		System.out.printf("%1$.6f deg\n", newValueDegree);
	}

	private static void DegreToRadConvertor(double degree) {
		// TODO Auto-generated method stub
		double newValueRadians = (double) ((degree * Math.PI) / 180);
		System.out.printf("%1$.6f rad\n", newValueRadians);
	}

}
