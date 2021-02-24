import java.util.Scanner;
import java.util.Date;
public class DayOfWeek {

	public static void dayOfWeek(int d){		//funksion me tip void qe merr si argument nje integer
		switch(d){								//kontrollon nese eshte nje nga ditet e javes dhe e afishon.
			case 0:
				System.out.println("Is day 0, is Sunday");
				break;
			case 1:
				System.out.println("Is day 1, is Monday");
				break;
			case 2:
				System.out.println("Is day 2, is Tuesday");
				break;
			case 3:
				System.out.println("Is day 3, is Wednesday");
				break;
			case 4:
				System.out.println("Is day 4, is Thursday");
				break;
			case 5:
				System.out.println("Is day 5, is Friday");
				break;
			case 6:
				System.out.println("Is day 6, is Saturday");
				break;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date d = new Date();
		int day = d.getDay();
		
		dayOfWeek(day);
		
		System.out.println("Put a number of days: ");
			int n = input.nextInt();
			day = (day + n)%7;		//llogarisim numrin e dites se javes pasi i shtojme n dite
			
			dayOfWeek(day);
			
			input.close();
	}

}