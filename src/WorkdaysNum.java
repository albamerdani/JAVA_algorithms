import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.text.Format;

public class WorkdaysNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int year;
		int month;
		int date;
		int workdays=0;
		int ditetembetura=0;
		int ditetekaluara=0;
		int count=0;
		int i;
		
		int holidays[] = {1, 2, 73, 80, 121, 292, 332, 333, 342, 359, 365}; //ruaj ne vektor numrin e dites se vitit per datat qe jane pushime zyrtare
		int holidaysLeap[] = {1,2, 74, 81, 122, 293, 333, 334, 343, 360, 366};	//vektori i krijuar per vitet e brishte
		Calendar today = Calendar.getInstance();	//variabel qe mban daten aktuale
		
		System.out.println("Put a number for the year: ");
		year = input.nextInt();
		System.out.println("Put a number from 0 to 11 for month from January to December: ");
		month = input.nextInt();
		System.out.println("Put a number from 1 to 31 for the date: ");
		date = input.nextInt();
		
		Calendar nextday = Calendar.getInstance();	//variabel qe mban nje date te percaktuar nga ne
		nextday.set(year, month, date);

		input.close();
		
		if(nextday.compareTo(today) < 0){			//krahasimi i dates aktuale me ate qe kemi dhene
			System.out.println("Ju keni vendosur nje date te kaluar.");
		}
		
		else if(nextday.compareTo(today) == 0){
			System.out.println("Ju keni vendosur te njejten date me diten e sotme.");
		}
		
		else if(nextday.compareTo(today) > 0){	
			count = (52 - today.get(Calendar.WEEK_OF_YEAR))*2;	//llogarisim ditet e pushimit (e shtune, e diele) te mbetura	
			
			if((today.get(Calendar.YEAR) % 4) == 0 || (today.get(Calendar.YEAR) % 400) == 0 && (today.get(Calendar.YEAR) % 100) != 0){	//kushtet per te qene viti i brishte
				for(i=0; i<holidaysLeap.length; i++){		//llogarisim sa dite te pushimeve zyrtare kane mbetur per vitin e brishte
					if(today.get(Calendar.DAY_OF_YEAR) < holidaysLeap[i]){
						count += holidaysLeap.length - i;
						break;
					}
				}				
				ditetembetura += 366 - today.get(Calendar.DAY_OF_YEAR) - count;		//llogarisim ditet e mbetura nga viti aktual per vitin e brishte
			}	
			else{
				for(i=0; i<holidays.length; i++){		//llogarisim sa dite te pushimeve zyrtare kane mbetur
					if(today.get(Calendar.DAY_OF_YEAR) < holidays[i]){
						count += holidays.length - i;
						break;
					}
				}
				ditetembetura += 365 - today.get(Calendar.DAY_OF_YEAR) - count;	//llogarisim ditet e mbetura nga viti aktual
			}
			
			ditetekaluara = nextday.get(Calendar.DAY_OF_YEAR) - (nextday.get(Calendar.WEEK_OF_YEAR)*2);		//llogarisim ditet e kaluara ne vitin e dates tjeter
			
			int dite_te_brishta = 0;
			for(i=today.get(Calendar.YEAR); i<nextday.get(Calendar.YEAR); i++){
				if((i % 4) == 0 || (i % 400) == 0 && (i % 100) != 0){
					dite_te_brishta++;
				}
			}
			
			int vite = nextday.get(Calendar.YEAR) - today.get(Calendar.YEAR) - 1;
			int dite = (vite*(365 - (52*2) - 11)) + dite_te_brishta; //nga 365 dite qe ka viti heqim numrin e diteve te fundjavave (te shtuna, te diela) dhe numrin e diteve te pushimeve zyrtare
			workdays = dite + ditetembetura + ditetekaluara - 1;
			
			System.out.printf(" %d workdays are from %d/%d/%d to %d/%d/%d ", workdays, today.get(Calendar.DATE), today.get(Calendar.MONTH), today.get(Calendar.YEAR), nextday.get(Calendar.DATE), nextday.get(Calendar.MONTH), nextday.get(Calendar.YEAR));
		}

	}
}
