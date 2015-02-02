//Write a program to calculate the difference between two dates in number of days. 
//The dates are entered at two consecutive lines in format day-month-year. Days are in range [1…31].
//Months are in range [1…12]. Years are in range [1900…2100]. 
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] firstDateStr = input.nextLine().split("[\\D]+");
		int firstDateDay = Integer.parseInt(firstDateStr[0]);
		int firstDateMonth = Integer.parseInt(firstDateStr[1]);
		int firstDateYear = Integer.parseInt(firstDateStr[2]);
		
		String[] secondDateStr = input.nextLine().split("[\\D]+");
		int secondDateDay = Integer.parseInt(secondDateStr[0]);
		int secondDateMonth = Integer.parseInt(secondDateStr[1]);
		int secondDateYear = Integer.parseInt(secondDateStr[2]);
		
		LocalDate firstDate = LocalDate.of(firstDateYear, firstDateMonth, firstDateDay);
		LocalDate secondDate = LocalDate.of(secondDateYear, secondDateMonth, secondDateDay);
	
		long days = ChronoUnit.DAYS.between(firstDate, secondDate);

		System.out.println(days); 
	}

}
