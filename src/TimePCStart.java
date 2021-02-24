import java.lang.management.ManagementFactory;
public class TimePCStart {

	private static double days, hours, minutes, seconds, milisec;
	
	public static void time(long time){	//funksion me tip void qe merr si argument nje variabel numerik te tipit long
	
		//milisekondat i kthejme ne dite duke i pjestuar me 1000 per te marre sec me 60 per te marre
		//minutat me 60 per te marre oret dhe me 24 per te marre numrin e diteve
		//mbetja jane milisekondat e mbetura pasi hiqen ditet, logjika vazhdon njesoj.
		
		milisec = (time%1000);
		
		seconds = ((time/1000))%60;
		
		minutes = ((time/1000)/60)%60;
		
		hours = (((time/1000)/60)/60)%24;
		
		days = (((time/1000)/60)/60)/24;
		
		//kthen numrin e milisekondave ne dite ore dhe minuta
		
		System.out.printf("It has passed %.2f days, %.2f hours and %.2f minutes, %.2f seconds, %.2f", days, hours, minutes, seconds, milisec);
	}
	
	public static void main(String[] args) {
		
		time(ManagementFactory.getRuntimeMXBean().getUptime());
		
	}

}
