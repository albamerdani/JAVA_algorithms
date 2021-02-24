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
		 "\n1. T�r�sia e detyrave dhe e pun�ve t� parashikuara p�r t'u plot�suar n� t� ardhmen; plan i gjer� q� parashikon nj� pun� a nj� veprimtari t� ardhshme dhe ecurin� p�r plot�simin e saj. Program madh�shtor nd�rtimi. Program pune." +
		 "\n2. T�r�sia e parimeve, e tezave, e q�llimeve dhe e detyrave themelore q� i ka caktuar vetes nj� parti politike, nj� qeveri ose nj� organizat� shoq�rore. Program politik. Programi minimal (maksimal). Programi i qeveris�. Shpalli programin." + 
		 "\n3. P�rmbledhje e shkurt�r e p�rmbajtjes dhe e q�llimeve t� nj� l�nde m�simore n� shkoll�. Program m�simor. Programi i historis� (i gjuh�s shqipe, i let�rsis� shqiptare, i fizik�s)." + 
		 "\n4. T�r�sia e pjes�ve q� luhen n� nj� koncert, n� nj� estrad�, n� nj� shfaqje cirku etj.; t�r�sia e pikave q� p�rmban nj� veprimtari kulturore e artistike; t�r�sia e emisioneve q� jepen me radio ose me televizion gjat� nj� dite, nj� jave etj.; fleta ose lib�rthi ku jan� shtypur sipas nj� rendi t� caktuar k�to pjes�, emisione etj. Program muzikor. Program artistik (kulturor). Program televiziv. Program i pasur (i bukur, i shkurt�r). Programi i emisioneve t� radios. Program me muzik� sipas k�rkesave t� d�gjuesve. Program me k�ng� (me recitime). Programi i shfaqjes. Programi i festivalit.");
		 	
		 shpjego.put(1, " mb. \n" + "\nQ� parashtron parime, teza, q�llime e detyra themelore p�r t� tashmen dhe p�r t� ardhshmen, q� �sht� nj� program pune dhe lufte p�r t� ardhshmen. Dokument programatik p�r l�vizjen komuniste n� bot�. Deklarat� programatike.");
		 shpjego.put(2, " m. sh. \n" + "\nVeprimi sipas kuptimeve t� foljeve PROGRAMOJ, PROGRAMOHET. Programimi i pun�ve bujq�sore (i prodhimit). Programimi i veprimtaris� artistike (kulturore).");
		 shpjego.put(3, "  P�s. \n" + "\ne PROGRAMOJ." );
		 shpjego.put(4, " kal. \n" + "\nCaktoj detyrat dhe pun�t q� do t� plot�sohen n� t� ardhshmen sipas nj� rendi t� p�rshtatsh�m; b�j planin e nj� pune a t� nj� veprimtarie, v� n� program di�ka; planifikoj. Programoi pun�n edukative me klas�n." );
		 shpjego.put(5, " mb. \n" + "\nQ� ka t� b�j� me detyrat dhe me pun�t e parashikuara p�r t'u plot�suar n� t� ardhshmen sipas nj� rendi t� caktuar, q� lidhet me planin e nj� pune a t� nj� veprimtarie, q� i p�rket programit; programatik. K�rkesa (detyra) programore.");
		 shpjego.put(6, " mb \n" + "\nQ� b�het sipas nj� programi t� caktuar, q� �sht� programuar; i planifikuar. Pun� e programuar. Kok� e programuar. N� m�nyr� t� programuar.");
		 
		 shpjego.put(7, " m. \n" + "\n1. Vep�r shkencore, m�simore, letrare etj. me flet� t� shtypura e t� lidhura s� bashku n� nj� v�llim. Lib�r i ri (i vjet�r). Lib�r i trash� (i holl�). Lib�r i rrall�. Libra shkollor�. Libri i par� shqip. Libri i gjuh�s (i historis�, i gjeografis�). Librat e bibliotek�s. Raft librash. Lidhja e librave. Botoi nj� lib�r. Blej nj� lib�r. Ka lexuar shum� libra." + 
		 "\n2. Nj� nga pjes�t kryesore t� nj� vepre letrare ose shkencore, e cila �sht� botuar n� disa v�llime ose n� disa pjes�; v�llim, ble. Libri i par� i v�llimit t� par� t� �Kapitalit� t� Karl Marksit. Libri i par� (i dyt�) i nj� romani. " +
		 "\n3. vet. nj. T�r�sia e veprave t� shkruara n� nj� nga fushat e dijes e t� artit; t�r�sia e veprave q� trajtojn� nj� ��shtje a nj� problem t� caktuar; t�r�sia e veprave q� botohen n� nj� vend a n� nj� gjuh� t� caktuar; let�rsi. Libri politik. Libri letrar (artistik). Libri tekniko-shkencor. Libri shqip. Ekspozita e librit shqiptar. " + 
		 "\n4. Shum� flet� t� pashkruara ose me vija, t� lidhura s� bashku si fletore e trash� e me kapak� t� fort�, e cila p�rdoret p�r t� mbajtur sh�nime t� ndryshme; regjist�r. Libri i amz�s. Libri i nderit. Libri i p�rshtypjeve. Libri i t� ardhurave. fin. Libri i ngjarjeve. Libri i k�shillit pedagogjik. Libri i dit�ve t� pun�s. " +
		 "\n* Lib�r i art� shih tek ART� (i, e). Lib�r i bardh� shih te BARDH� (i, e). " +
		 "\nLib�r i verdh� shih te VERDH� (i, e) 6.");
		 		 
		 shpjego.put(8, " m. \n" + 
		 "\n1. Ithtar e p�rkrah�s i liberalizmit n� ideologji e n� politik�. " + 
		 "\n2. Ai q� b�n l�shime ndaj t� metave, gabimeve etj. dhe q� nuk k�rkon llogari deri n� fund ose tregohet tep�r dor�l�shuar n� k�rkesat ndaj t� tjer�ve. " +
		 "\n3. An�tar i nj� partie borgjeze liberale. Liberal�t dhe konservator�t.");
		 		 
		 shpjego.put(9, " mb. \n" +
		 "\n1. Q� mendon e vepron n� frym�n e liberalizmit; q� p�rkrah liberalizmin; q� shpreh idet� e liberalizmit; q� �sht� karakteristik p�r liberalizmin a p�r liberalin; q� p�rb�het prej liberal�sh. Borgjezia liberale. Parulla (frazeologji) liberale. Politik� (teori) liberale. Partia liberale. " +
		 "\n2. Q� b�n l�shime ndaj t� metave, gabimeve etj., q� nuk k�rkon llogari deri n� fund; q� lejon shkelje e �rregullime t� cilat d�mtojn� pun�n e shoq�rin�; q� �sht� tep�r dor�l�shuar n� vler�simin e dijeve e t� pun�s s� dikujt ose n� k�rkesat ndaj t� tjer�ve. Njeri liberal. Drejtor liberal. M�sues (pedagog) liberal. Q�ndrim liberal. Prirje (veprime, shfaqje) liberale.");
		 
		 
		 
	
		 shpjegimi.put("PROGRAM", " m. sh. \n" + 
				 "\n1. T�r�sia e detyrave dhe e pun�ve t� parashikuara p�r t'u plot�suar n� t� ardhmen; plan i gjer� q� parashikon nj� pun� a nj� veprimtari t� ardhshme dhe ecurin� p�r plot�simin e saj. Program madh�shtor nd�rtimi. Program pune." +
				 "\n2. T�r�sia e parimeve, e tezave, e q�llimeve dhe e detyrave themelore q� i ka caktuar vetes nj� parti politike, nj� qeveri ose nj� organizat� shoq�rore. Program politik. Programi minimal (maksimal). Programi i qeveris�. Shpalli programin." + 
				 "\n3. P�rmbledhje e shkurt�r e p�rmbajtjes dhe e q�llimeve t� nj� l�nde m�simore n� shkoll�. Program m�simor. Programi i historis� (i gjuh�s shqipe, i let�rsis� shqiptare, i fizik�s)." + 
				 "\n4. T�r�sia e pjes�ve q� luhen n� nj� koncert, n� nj� estrad�, n� nj� shfaqje cirku etj.; t�r�sia e pikave q� p�rmban nj� veprimtari kulturore e artistike; t�r�sia e emisioneve q� jepen me radio ose me televizion gjat� nj� dite, nj� jave etj.; fleta ose lib�rthi ku jan� shtypur sipas nj� rendi t� caktuar k�to pjes�, emisione etj. Program muzikor. Program artistik (kulturor). Program televiziv. Program i pasur (i bukur, i shkurt�r). Programi i emisioneve t� radios. Program me muzik� sipas k�rkesave t� d�gjuesve. Program me k�ng� (me recitime). Programi i shfaqjes. Programi i festivalit.");

		 shpjegimi.put("PROGRAMATIK", " mb. \n" + "\nQ� parashtron parime, teza, q�llime e detyra themelore p�r t� tashmen dhe p�r t� ardhshmen, q� �sht� nj� program pune dhe lufte p�r t� ardhshmen. Dokument programatik p�r l�vizjen komuniste n� bot�. Deklarat� programatike.");
		 shpjegimi.put("PROGRAMIM", " m. sh. \n" + "\nVeprimi sipas kuptimeve t� foljeve PROGRAMOJ, PROGRAMOHET. Programimi i pun�ve bujq�sore (i prodhimit). Programimi i veprimtaris� artistike (kulturore).");
		 shpjegimi.put("PROGRAMOHET", "  P�s. \n" + "\ne PROGRAMOJ." );
		 shpjegimi.put("PROGRAMOJ", " kal. \n" + "\nCaktoj detyrat dhe pun�t q� do t� plot�sohen n� t� ardhshmen sipas nj� rendi t� p�rshtatsh�m; b�j planin e nj� pune a t� nj� veprimtarie, v� n� program di�ka; planifikoj. Programoi pun�n edukative me klas�n." );
		 shpjegimi.put("PROGRAMOR", " mb. \n" + "\nQ� ka t� b�j� me detyrat dhe me pun�t e parashikuara p�r t'u plot�suar n� t� ardhshmen sipas nj� rendi t� caktuar, q� lidhet me planin e nj� pune a t� nj� veprimtarie, q� i p�rket programit; programatik. K�rkesa (detyra) programore.");
		 shpjegimi.put("PROGRAMUAR", " mb \n" + "\nQ� b�het sipas nj� programi t� caktuar, q� �sht� programuar; i planifikuar. Pun� e programuar. Kok� e programuar. N� m�nyr� t� programuar.");

		 shpjegimi.put("LIBER", " m. \n" + "\n1. Vep�r shkencore, m�simore, letrare etj. me flet� t� shtypura e t� lidhura s� bashku n� nj� v�llim. Lib�r i ri (i vjet�r). Lib�r i trash� (i holl�). Lib�r i rrall�. Libra shkollor�. Libri i par� shqip. Libri i gjuh�s (i historis�, i gjeografis�). Librat e bibliotek�s. Raft librash. Lidhja e librave. Botoi nj� lib�r. Blej nj� lib�r. Ka lexuar shum� libra." + 
				 "\n2. Nj� nga pjes�t kryesore t� nj� vepre letrare ose shkencore, e cila �sht� botuar n� disa v�llime ose n� disa pjes�; v�llim, ble. Libri i par� i v�llimit t� par� t� �Kapitalit� t� Karl Marksit. Libri i par� (i dyt�) i nj� romani. " +
				 "\n3. vet. nj. T�r�sia e veprave t� shkruara n� nj� nga fushat e dijes e t� artit; t�r�sia e veprave q� trajtojn� nj� ��shtje a nj� problem t� caktuar; t�r�sia e veprave q� botohen n� nj� vend a n� nj� gjuh� t� caktuar; let�rsi. Libri politik. Libri letrar (artistik). Libri tekniko-shkencor. Libri shqip. Ekspozita e librit shqiptar. " + 
				 "\n4. Shum� flet� t� pashkruara ose me vija, t� lidhura s� bashku si fletore e trash� e me kapak� t� fort�, e cila p�rdoret p�r t� mbajtur sh�nime t� ndryshme; regjist�r. Libri i amz�s. Libri i nderit. Libri i p�rshtypjeve. Libri i t� ardhurave. fin. Libri i ngjarjeve. Libri i k�shillit pedagogjik. Libri i dit�ve t� pun�s. " +
				 "\n* Lib�r i art� shih tek ART� (i, e). Lib�r i bardh� shih te BARDH� (i, e). " +
				 "\nLib�r i verdh� shih te VERDH� (i, e) 6.");
		 
		 shpjegimi.put("LIBERAL", " m. \n" + 
				 "\n1. Ithtar e p�rkrah�s i liberalizmit n� ideologji e n� politik�. " + 
				 "\n2. Ai q� b�n l�shime ndaj t� metave, gabimeve etj. dhe q� nuk k�rkon llogari deri n� fund ose tregohet tep�r dor�l�shuar n� k�rkesat ndaj t� tjer�ve. " +
				 "\n3. An�tar i nj� partie borgjeze liberale. Liberal�t dhe konservator�t.");
		 
		 shpjegimi.put("LIBERAL", " mb. \n" +
				 "\n1. Q� mendon e vepron n� frym�n e liberalizmit; q� p�rkrah liberalizmin; q� shpreh idet� e liberalizmit; q� �sht� karakteristik p�r liberalizmin a p�r liberalin; q� p�rb�het prej liberal�sh. Borgjezia liberale. Parulla (frazeologji) liberale. Politik� (teori) liberale. Partia liberale. " +
				 "\n2. Q� b�n l�shime ndaj t� metave, gabimeve etj., q� nuk k�rkon llogari deri n� fund; q� lejon shkelje e �rregullime t� cilat d�mtojn� pun�n e shoq�rin�; q� �sht� tep�r dor�l�shuar n� vler�simin e dijeve e t� pun�s s� dikujt ose n� k�rkesat ndaj t� tjer�ve. Njeri liberal. Drejtor liberal. M�sues (pedagog) liberal. Q�ndrim liberal. Prirje (veprime, shfaqje) liberale.");
		 
		 
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
