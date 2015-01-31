import java.time.LocalDateTime;

public class _05_CurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		System.out.printf("%1$td.%1$tm.%1$tY  %1$tH:%1$tM:%1$tS",time);
		

	}

}
