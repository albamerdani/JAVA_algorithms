import java.io.*;
import java.util.*;

public class FjalorShqip {

	public static void main(String[] args) throws FileNotFoundException{
		
		 Hashtable<String, String> shpjegimi = new Hashtable<String, String>();
		 Enumeration<String> key = shpjegimi.keys();	//enumeracion i tipit string, i cili ka celsat e hashtable
		 
		 
		 
		 Hashtable<Integer, String> fjalet = new Hashtable<Integer, String>();
		 Hashtable<Integer, String> shpjego = new Hashtable<Integer, String>();
		 Enumeration<Integer> key_fjalet = fjalet.keys();	//enumeracion i tipit string, i cili ka celsat e hashtable
		 Enumeration<Integer> key_shpjego = shpjego.keys();	//enumeracion i tipit string, i cili ka celsat e hashtable
			
		 fjalet.put(0, "PROGRAM");
		 fjalet.put(1, "PROGRAMATIK");
		 fjalet.put(2, "PROGRAMIM");
		 fjalet.put(3, "PROGRAMOHET");
		 fjalet.put(4, "PROGRAMOJ");
		 fjalet.put(5, "PROGRAMOR");
		 fjalet.put(6, "PROGRAMUAR");
		 fjalet.put(7, "LIBER");
		 fjalet.put(8, "LIBERAL");
		 fjalet.put(9, "LIBERAL");
		 
		 shpjego.put(0, " m. sh. \n" + 
		 "\n1. Tërësia e detyrave dhe e punëve të parashikuara për t'u plotësuar në të ardhmen; plan i gjerë që parashikon një punë a një veprimtari të ardhshme dhe ecurinë për plotësimin e saj. Program madhështor ndërtimi. Program pune." +
		 "\n2. Tërësia e parimeve, e tezave, e qëllimeve dhe e detyrave themelore që i ka caktuar vetes një parti politike, një qeveri ose një organizatë shoqërore. Program politik. Programi minimal (maksimal). Programi i qeverisë. Shpalli programin." + 
		 "\n3. Përmbledhje e shkurtër e përmbajtjes dhe e qëllimeve të një lënde mësimore në shkollë. Program mësimor. Programi i historisë (i gjuhës shqipe, i letërsisë shqiptare, i fizikës)." + 
		 "\n4. Tërësia e pjesëve që luhen në një koncert, në një estradë, në një shfaqje cirku etj.; tërësia e pikave që përmban një veprimtari kulturore e artistike; tërësia e emisioneve që jepen me radio ose me televizion gjatë një dite, një jave etj.; fleta ose libërthi ku janë shtypur sipas një rendi të caktuar këto pjesë, emisione etj. Program muzikor. Program artistik (kulturor). Program televiziv. Program i pasur (i bukur, i shkurtër). Programi i emisioneve të radios. Program me muzikë sipas kërkesave të dëgjuesve. Program me këngë (me recitime). Programi i shfaqjes. Programi i festivalit.");
		 	
		 shpjego.put(1, " mb. \n" + "\nQë parashtron parime, teza, qëllime e detyra themelore për të tashmen dhe për të ardhshmen, që është një program pune dhe lufte për të ardhshmen. Dokument programatik për lëvizjen komuniste në botë. Deklaratë programatike.");
		 shpjego.put(2, " m. sh. \n" + "\nVeprimi sipas kuptimeve të foljeve PROGRAMOJ, PROGRAMOHET. Programimi i punëve bujqësore (i prodhimit). Programimi i veprimtarisë artistike (kulturore).");
		 shpjego.put(3, "  Pës. \n" + "\ne PROGRAMOJ." );
		 shpjego.put(4, " kal. \n" + "\nCaktoj detyrat dhe punët që do të plotësohen në të ardhshmen sipas një rendi të përshtatshëm; bëj planin e një pune a të një veprimtarie, vë në program diçka; planifikoj. Programoi punën edukative me klasën." );
		 shpjego.put(5, " mb. \n" + "\nQë ka të bëjë me detyrat dhe me punët e parashikuara për t'u plotësuar në të ardhshmen sipas një rendi të caktuar, që lidhet me planin e një pune a të një veprimtarie, që i përket programit; programatik. Kërkesa (detyra) programore.");
		 shpjego.put(6, " mb \n" + "\nQë bëhet sipas një programi të caktuar, që është programuar; i planifikuar. Punë e programuar. Kokë e programuar. Në mënyrë të programuar.");
		 
		 shpjego.put(7, " m. \n" + "\n1. Vepër shkencore, mësimore, letrare etj. me fletë të shtypura e të lidhura së bashku në një vëllim. Libër i ri (i vjetër). Libër i trashë (i hollë). Libër i rrallë. Libra shkollorë. Libri i parë shqip. Libri i gjuhës (i historisë, i gjeografisë). Librat e bibliotekës. Raft librash. Lidhja e librave. Botoi një libër. Blej një libër. Ka lexuar shumë libra." + 
		 "\n2. Një nga pjesët kryesore të një vepre letrare ose shkencore, e cila është botuar në disa vëllime ose në disa pjesë; vëllim, ble. Libri i parë i vëllimit të parë të «Kapitalit» të Karl Marksit. Libri i parë (i dytë) i një romani. " +
		 "\n3. vet. nj. Tërësia e veprave të shkruara në një nga fushat e dijes e të artit; tërësia e veprave që trajtojnë një çështje a një problem të caktuar; tërësia e veprave që botohen në një vend a në një gjuhë të caktuar; letërsi. Libri politik. Libri letrar (artistik). Libri tekniko-shkencor. Libri shqip. Ekspozita e librit shqiptar. " + 
		 "\n4. Shumë fletë të pashkruara ose me vija, të lidhura së bashku si fletore e trashë e me kapakë të fortë, e cila përdoret për të mbajtur shënime të ndryshme; regjistër. Libri i amzës. Libri i nderit. Libri i përshtypjeve. Libri i të ardhurave. fin. Libri i ngjarjeve. Libri i këshillit pedagogjik. Libri i ditëve të punës. " +
		 "\n* Libër i artë shih tek ARTË (i, e). Libër i bardhë shih te BARDHË (i, e). " +
		 "\nLibër i verdhë shih te VERDHË (i, e) 6.");
		 		 
		 shpjego.put(8, " m. \n" + 
		 "\n1. Ithtar e përkrahës i liberalizmit në ideologji e në politikë. " + 
		 "\n2. Ai që bën lëshime ndaj të metave, gabimeve etj. dhe që nuk kërkon llogari deri në fund ose tregohet tepër dorëlëshuar në kërkesat ndaj të tjerëve. " +
		 "\n3. Anëtar i një partie borgjeze liberale. Liberalët dhe konservatorët.");
		 		 
		 shpjego.put(9, " mb. \n" +
		 "\n1. Që mendon e vepron në frymën e liberalizmit; që përkrah liberalizmin; që shpreh idetë e liberalizmit; që është karakteristik për liberalizmin a për liberalin; që përbëhet prej liberalësh. Borgjezia liberale. Parulla (frazeologji) liberale. Politikë (teori) liberale. Partia liberale. " +
		 "\n2. Që bën lëshime ndaj të metave, gabimeve etj., që nuk kërkon llogari deri në fund; që lejon shkelje e çrregullime të cilat dëmtojnë punën e shoqërinë; që është tepër dorëlëshuar në vlerësimin e dijeve e të punës së dikujt ose në kërkesat ndaj të tjerëve. Njeri liberal. Drejtor liberal. Mësues (pedagog) liberal. Qëndrim liberal. Prirje (veprime, shfaqje) liberale.");
		 
		 
		 
	
		 shpjegimi.put("PROGRAM", " m. sh. \n" + 
				 "\n1. Tërësia e detyrave dhe e punëve të parashikuara për t'u plotësuar në të ardhmen; plan i gjerë që parashikon një punë a një veprimtari të ardhshme dhe ecurinë për plotësimin e saj. Program madhështor ndërtimi. Program pune." +
				 "\n2. Tërësia e parimeve, e tezave, e qëllimeve dhe e detyrave themelore që i ka caktuar vetes një parti politike, një qeveri ose një organizatë shoqërore. Program politik. Programi minimal (maksimal). Programi i qeverisë. Shpalli programin." + 
				 "\n3. Përmbledhje e shkurtër e përmbajtjes dhe e qëllimeve të një lënde mësimore në shkollë. Program mësimor. Programi i historisë (i gjuhës shqipe, i letërsisë shqiptare, i fizikës)." + 
				 "\n4. Tërësia e pjesëve që luhen në një koncert, në një estradë, në një shfaqje cirku etj.; tërësia e pikave që përmban një veprimtari kulturore e artistike; tërësia e emisioneve që jepen me radio ose me televizion gjatë një dite, një jave etj.; fleta ose libërthi ku janë shtypur sipas një rendi të caktuar këto pjesë, emisione etj. Program muzikor. Program artistik (kulturor). Program televiziv. Program i pasur (i bukur, i shkurtër). Programi i emisioneve të radios. Program me muzikë sipas kërkesave të dëgjuesve. Program me këngë (me recitime). Programi i shfaqjes. Programi i festivalit.");

		 shpjegimi.put("PROGRAMATIK", " mb. \n" + "\nQë parashtron parime, teza, qëllime e detyra themelore për të tashmen dhe për të ardhshmen, që është një program pune dhe lufte për të ardhshmen. Dokument programatik për lëvizjen komuniste në botë. Deklaratë programatike.");
		 shpjegimi.put("PROGRAMIM", " m. sh. \n" + "\nVeprimi sipas kuptimeve të foljeve PROGRAMOJ, PROGRAMOHET. Programimi i punëve bujqësore (i prodhimit). Programimi i veprimtarisë artistike (kulturore).");
		 shpjegimi.put("PROGRAMOHET", "  Pës. \n" + "\ne PROGRAMOJ." );
		 shpjegimi.put("PROGRAMOJ", " kal. \n" + "\nCaktoj detyrat dhe punët që do të plotësohen në të ardhshmen sipas një rendi të përshtatshëm; bëj planin e një pune a të një veprimtarie, vë në program diçka; planifikoj. Programoi punën edukative me klasën." );
		 shpjegimi.put("PROGRAMOR", " mb. \n" + "\nQë ka të bëjë me detyrat dhe me punët e parashikuara për t'u plotësuar në të ardhshmen sipas një rendi të caktuar, që lidhet me planin e një pune a të një veprimtarie, që i përket programit; programatik. Kërkesa (detyra) programore.");
		 shpjegimi.put("PROGRAMUAR", " mb \n" + "\nQë bëhet sipas një programi të caktuar, që është programuar; i planifikuar. Punë e programuar. Kokë e programuar. Në mënyrë të programuar.");

		 shpjegimi.put("LIBER", " m. \n" + "\n1. Vepër shkencore, mësimore, letrare etj. me fletë të shtypura e të lidhura së bashku në një vëllim. Libër i ri (i vjetër). Libër i trashë (i hollë). Libër i rrallë. Libra shkollorë. Libri i parë shqip. Libri i gjuhës (i historisë, i gjeografisë). Librat e bibliotekës. Raft librash. Lidhja e librave. Botoi një libër. Blej një libër. Ka lexuar shumë libra." + 
				 "\n2. Një nga pjesët kryesore të një vepre letrare ose shkencore, e cila është botuar në disa vëllime ose në disa pjesë; vëllim, ble. Libri i parë i vëllimit të parë të «Kapitalit» të Karl Marksit. Libri i parë (i dytë) i një romani. " +
				 "\n3. vet. nj. Tërësia e veprave të shkruara në një nga fushat e dijes e të artit; tërësia e veprave që trajtojnë një çështje a një problem të caktuar; tërësia e veprave që botohen në një vend a në një gjuhë të caktuar; letërsi. Libri politik. Libri letrar (artistik). Libri tekniko-shkencor. Libri shqip. Ekspozita e librit shqiptar. " + 
				 "\n4. Shumë fletë të pashkruara ose me vija, të lidhura së bashku si fletore e trashë e me kapakë të fortë, e cila përdoret për të mbajtur shënime të ndryshme; regjistër. Libri i amzës. Libri i nderit. Libri i përshtypjeve. Libri i të ardhurave. fin. Libri i ngjarjeve. Libri i këshillit pedagogjik. Libri i ditëve të punës. " +
				 "\n* Libër i artë shih tek ARTË (i, e). Libër i bardhë shih te BARDHË (i, e). " +
				 "\nLibër i verdhë shih te VERDHË (i, e) 6.");
		 
		 shpjegimi.put("LIBERAL", " m. \n" + 
				 "\n1. Ithtar e përkrahës i liberalizmit në ideologji e në politikë. " + 
				 "\n2. Ai që bën lëshime ndaj të metave, gabimeve etj. dhe që nuk kërkon llogari deri në fund ose tregohet tepër dorëlëshuar në kërkesat ndaj të tjerëve. " +
				 "\n3. Anëtar i një partie borgjeze liberale. Liberalët dhe konservatorët.");
		 
		 shpjegimi.put("LIBERAL", " mb. \n" +
				 "\n1. Që mendon e vepron në frymën e liberalizmit; që përkrah liberalizmin; që shpreh idetë e liberalizmit; që është karakteristik për liberalizmin a për liberalin; që përbëhet prej liberalësh. Borgjezia liberale. Parulla (frazeologji) liberale. Politikë (teori) liberale. Partia liberale. " +
				 "\n2. Që bën lëshime ndaj të metave, gabimeve etj., që nuk kërkon llogari deri në fund; që lejon shkelje e çrregullime të cilat dëmtojnë punën e shoqërinë; që është tepër dorëlëshuar në vlerësimin e dijeve e të punës së dikujt ose në kërkesat ndaj të tjerëve. Njeri liberal. Drejtor liberal. Mësues (pedagog) liberal. Qëndrim liberal. Prirje (veprime, shfaqje) liberale.");
		 
		 
		 Scanner input = new Scanner(System.in);
		 PrintStream output = new PrintStream(new File("D:/fjalorShqip.txt"));
		 
		 String celes;
		 String fjala;
		 String word;
		 String kerko;
		 
		 System.out.println("Shkruani fjalen qe do kerkoni: ");
		 String fjala_kerkuar = input.next();
		 fjala_kerkuar = fjala_kerkuar.toUpperCase();
		 //word = fjala_kerkuar.substring(0, 3);
		 
		 
		 try{
			 int key1;
			 int key2;
			 kerko="";
			 
			 while(key_fjalet.hasMoreElements()){
				 
				 key1 = key_fjalet.nextElement();
				
				 if(fjalet.containsValue(fjala_kerkuar)){
					 
					 while(key_shpjego.hasMoreElements()){
						 
						 key2 = key_shpjego.nextElement();
						 
						 if(key1 == key2 && fjalet.get(key1) == fjala_kerkuar){
							 
							kerko = shpjego.get(key2);
						 }
					 }
					 
				 }
				 System.out.printf(fjala_kerkuar + kerko);	//printojme ne console dhe shkruajme ne file fjalen dhe shpjegimin
				 output.append(fjala_kerkuar);
				 output.print(" \r ");
				 output.append(kerko);
				 
			 }
		 }
		 catch(IndexOutOfBoundsException iobe){
				System.out.println("Gabim ne fjalen qe kerkoni, vendosni me shume se 3 shkronja!");
				iobe.printStackTrace();
			}
		
		 
		 
		 
		 /* 
			 * while(key.hasMoreElements()){
				 
				 //fjala = key.nextElement();			//variabel string qe ruan celesin e rradhes te Hashtable
				// celes = fjala.substring(0);			//variabel qe ruan nenstringe te stringes celes te Hashtable
				 
				//kontrollojme nese fjala e futur nga perdoruesi eshte si celes ne tabelen hash
				if(shpjegimi.containsKey(fjala_kerkuar) && celes.compareTo(word) == 0){
					
					//nese celsi eshte ne tabele atehere ne e perdorim per te marre vleren
					 kerko = shpjegimi.get(fjala_kerkuar);
					 
					//printojme ne console dhe shkruajme ne file fjalen dhe shpjegimin
					 System.out.printf(fjala_kerkuar + kerko);
					 output.append(fjala_kerkuar + " \r " + kerko);
				}
				else{
					 System.out.println("Fjala e kerkuar nuk gjendet!");
				}
			 }
			 */
			 
		 
		 output.close();
		 input.close();
	}
}
