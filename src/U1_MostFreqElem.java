import java.util.Scanner;
public class U1_MostFreqElem {
	

private static int nr_elem;

	
	public static int[] create_vector(Scanner in){		//funksion me tip vektor me vlera integer, merr nje parameter te tipit Scanner per te lexuar vlerat nga console	
		int i;									
		int vector[] = new int[nr_elem];
		System.out.println("Vendos elementet e vektorit: ");	//inicializimi i vektorit me vlera
		for(i=0; i<nr_elem; i++){
			System.out.printf("Elementi %d: ", i);
			vector[i]=in.nextInt();
		}
		return vector;							//funksioni kthen vektorin
	}
			
	public static int[] create_vector_count(){	// funksion me tip void, inicializon me 0 vlerat e vektorit count
		int i;
		int count[] = new int[nr_elem*2];
		for(i=0; i<count.length; i++){
			count[i]=0;
		}
		return count;
	}


	public static int[] count_elem(int[] vector){	//funksion me tip vektor me vlera integer, me nje parameter nje vektor me vlera int
		int i,j;
		int[] count = create_vector_count();
		for(i=0; i<nr_elem-1; i++){			//krahason vlerat e vektorit me njera-tjetren, kur ato jane te barabarta
			for(j=0; j<nr_elem; j++){		//ruan numrin e hereve qe perseritet ajo vlere ne vektorin count ne gjysmen e pare te tij
				if(vector[i]==vector[j]){	//dhe vleren perkatese ne gjysmen tjeter te vektorit count
						count[i]++;
						count[count.length/2 + i] = vector[j];
				}
			}
		}
		return count;						//funksioni kthen vektorin count
	}
	
	
	public static void nrMostFreq(int[] count){	//funksion me tip int, me nje parameter vektorin count me vlera int qe mban frekuencat e numrave dhe vlerat perkatese
		int i,j, max, nr=0;
		max = count[0];
		for(i=0; i<count.length/2 - 1; i++){ //krahasimi i vektorit realizohet vetem per gjysmen e pare ku ndodhen frekuencat
			for(j=i; j<count.length/2; j++){	//e numrave dhe gjendet frekuenca maksimale
				if(count[i]<count[j]){
					max = count[j];
					nr = count[count.length/2 + j]; //ruhet ne nje variabel vlera e numrit qe ka frekuencen maksimale
				}									//ndodhet ne gjysmen e dyte te vektorit
			}
		}
		System.out.printf("\n\nNumri %d perseritet %d here.", nr, max);
	}

	
	
	
	public static void main(String[] args) {
		
		int v[], c[];
		Scanner input = new Scanner(System.in);
		System.out.println("Vendos numrin e elementeve te vektorit: ");
		U1_MostFreqElem.nr_elem = input.nextInt();
		v = create_vector(input);
		create_vector_count();
		c = count_elem(v);
		nrMostFreq(c);

		
		// Zgjidhje e ushtrimit pa funksione
		
		
		/*int i, j, k, nr_elem, nr=0, max;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vendos numrin e elementeve te vektorit: ");
		nr_elem = input.nextInt();
		int array[] = new int[nr_elem];
		System.out.println("Vendos elementet e vektorit: ");
		for(i=0; i<nr_elem; i++){
			System.out.printf("Elementi %d: ", i);
			array[i]=input.nextInt();
		}
		
		input.close();
		
		int count[]= new int[2*nr_elem];	//krijimi i vektorit count dhe inicializimi i vlerave te tij me 0
		for(i=0; i<count.length; i++){		//me gjatesi sa dyfishi i vektorit array
			count[i]=0;						//ne gjysmen e pare te indekseve do te mbaje sa here perseritet cdo vlere e vektorit array
											//dhe ne pjesen e dyte te indekseve do mbaje vleren perkatese te numrit qe perseritet.
		}
		
		for(i=0; i<nr_elem-1; i++){
			for(j=0; j<nr_elem; j++){
				if(array[i]==array[j]){
						count[i]++;
						count[count.length/2 + i] = array[j];
				}
			}
		}
		
		max = count[0];
		for(i=0; i<count.length/2 - 1; i++){
			for(j=i; j<count.length/2; j++){
				if(count[i]<count[j]){
					max = count[j];
					nr = count[count.length/2 + j];
				}
			}
		}
		
		System.out.printf("Numri %d perseritet %d here", nr,max);
*/		
	}

}
