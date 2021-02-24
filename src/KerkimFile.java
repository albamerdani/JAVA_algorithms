import java.util.Scanner;
import java.io.*;

public class KerkimFile {

			public static void main(String[] args) throws FileNotFoundException{
				Scanner input = new Scanner(System.in);
				
				
				try{
					
					Scanner file = new Scanner(new File("D:\\fjalor.txt"));
					String word, kerko;
					int count=0;
					int line=0;
					int i=0, j, k;
					
					System.out.println("Shkruani fjalen qe do kerkoni: ");
					String fjala = input.next();
					String fjala_kerkuar = fjala.toUpperCase();
					
					while(file.hasNextLine()){
						
						count++;			//numeroj rreshtat ne file
						kerko = file.nextLine();		//ruaj rreshtin e lexuar
						Scanner in = new Scanner (kerko);		//marr si input ne scaner rreshtin e lexuar

						k = kerko.indexOf("-");
						
						if(fjala_kerkuar.substring(0,3).compareTo(kerko.substring(0)) == 0){
							line = count;		//ruaj ne line nr e rreshtit ku eshte fjala e kerkuar
						
							System.out.printf(kerko + "\n");
						}
						
						//else 
						//	i = count;			//ruaj ne i nr e rreshtit kur nuk gjendet fjala e kerkuar
						
							//for(j = 0; j < k; j++){
								
								while(in.hasNext()){	//kontrolloj nese ka me fjale ne stringen ne rreshtin input ne scanner
									word = in.next();
									System.out.printf(word + " ");
								}
								
								//System.out.printf("\n");
							//}
							
						System.out.printf("\n");
						in.close();
					}
					
					file.close();
					input.close();
		
				}
				catch(IndexOutOfBoundsException iobe){
					System.out.println("Gabim ne fjalen qe kerkoni, vendosni me shume se 3 shkronja!");
					iobe.printStackTrace();
				}
				catch(IOException ioe){
					System.out.println("Gabim ne file-in input:" + ioe.getMessage());
					ioe.printStackTrace();
				}
				
				
				
				/*//nxjerr gabim ne indekset e stringes, dalim jashte saj.
				 
				     int i;
				        boolean flag = false;
				        String sub = new String();
				        String line = new String();

				        try
				        {
				            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				            System.out.println("Kerko nje fjale: ");
				            String fjala = br.readLine();
				            fjala = fjala.toUpperCase();
				            FileReader fr = new FileReader("D:\\fjalor.txt");
				            BufferedReader bb = new BufferedReader(fr);
				            
				            while((line = bb.readLine()) != null)
				            {
				            	line = bb.readLine();
				                i = line.indexOf("-");
				                sub = line.substring(0);
				                if(fjala.substring(0, 3).compareTo(sub) == 0)
				                {
				                    System.out.println(line);
				                    flag=true;
				                }
				        
				            }
				            bb.close();

				            if(!flag)
				                System.out.println("Word not found");

				        }catch(StringIndexOutOfBoundsException se)
				        {
				            System.out.println(se);
				            se.printStackTrace();
				        }
				        catch(IOException ioe){
							System.out.println("Gabim ne file-in input:" + ioe.getMessage());
							ioe.printStackTrace();
						}
				  
				  */
	}

}
