import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public class Fjalor {

	public static void main(String[] args) throws FileNotFoundException{
		
		Hashtable<String, String> shpjegimi = new Hashtable<String, String>();
		Enumeration<String> key;	//enumeracion i tipit string, i cili ka celsat e hashtable
		
		try{
			
			Scanner file = new Scanner(new File("D:\\Praktika - Trajnime\\IkubINFO\\fjalor.txt"));	//hap file-in ku kam vendosur fjalet me shpjegimet
			String term;
			String kuptim;
			String rreshti;
			int index;
			
			while(file.hasNextLine()){		//kerkoj ne cdo rresht te file deri ne fund
				rreshti = file.nextLine();
				index = rreshti.indexOf('-'); // ruaj indeksin e ndaresit per cdo rresht dhe e perdor ate indeks per te ndare
				term = rreshti.substring(0,index-1);	//rreshtin ne termin dhe kuptimin e tij.
				kuptim = rreshti.substring(index+1);
				
				shpjegimi.put(term, kuptim);		//ruaj termin dhe kuptimin e vendosur ne cdo resht ne nje hashtable
			}
			
			key = shpjegimi.keys();
			
			Scanner input = new Scanner(System.in);
			 PrintStream output = new PrintStream(new File("D:/Praktika - Trajnime/IkubINFO/fjalorShqip.txt"));
			 

			 String fjala;
			String kerko="";
			 
			 System.out.println("Shkruani fjalen qe do kerkoni: ");
			 String fjala_kerkuar = input.next();
			 fjala_kerkuar = fjala_kerkuar.toUpperCase();

			 
			while(key.hasMoreElements()){
				 
				fjala = key.nextElement();			//variabel string qe ruan celesin e rradhes te Hashtable
					 
				if(fjala.startsWith(fjala_kerkuar)){	//kontrollojme nese fjala e futur nga perdoruesi eshte si celes ne tabelen hash
					
					 kerko = shpjegimi.get(fjala);	//nese celsi eshte ne tabele atehere ne e perdorim per te marre vleren
					
					 System.out.printf(fjala + " - " + kerko);	//printojme ne console dhe shkruajme ne file fjalen dhe shpjegimin
					 output.println(fjala + ": " + " \r ");
					 output.println(kerko);
					 
					 
				}
				
				else{
					System.out.println("Fjala nuk u gjet!");
				}
			}
			 
			 
			output.close();
			input.close();
			file.close();
		}catch(IOException ioe){
			System.out.println("File nuk gjendet.");
			ioe.getMessage();
			ioe.printStackTrace();
		}
		catch(StringIndexOutOfBoundsException sibe){
			sibe.printStackTrace();
		}
		
	}

}
