import java.util.InputMismatchException;
import java.util.Scanner;
public class ConvertNumToWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String num_Words[] = {"zero", "nje", "dy", "tre", "kater", "pese", "gjashte", "shtate", "tete", "nente", "dhjete", 
				"mbedhjete", "njezet", "tridhjete", "dyzet", "qind"};
		
		String temp="";
		String word="";
		String word_num = "";
		
		int num; 
		
		System.out.println("Vendos nje numer nga 0 ne 999: ");
		num = input.nextInt();

		
		try{
			
			int nr = num;
			int shifra=0;
			int i;
			int j;
			int k;
			
			while(nr > 0){
				nr = (int)(num/10);
				shifra++;
			}
			
			//switch(shifra){
			if(shifra == 1){
				for(i=0; i<10; i++){
						if(i == (num%10)){
							word_num = num_Words[i];
							System.out.printf("\nNumri juaj eshte %s.", word_num);
							break;
						}
					}
			}
			else if(shifra == 2){
				nr = num;
					if(((nr/10)%10) == 1){
						word_num = num_Words[10];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word_num = num_Words[i] + num_Words[11];
								System.out.printf("\nNumri juaj eshte %s.", word_num);
								break;
							}
						}
						
					}
					else if(((nr/10)%10) == 2){
						word_num = num_Words[12];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word_num += " e " + num_Words[i];
								break;
							}
						}
						System.out.printf("\nNumri juaj eshte %s.", word_num);
					}
					else if(((nr/10)%10) == 3){
						word_num = num_Words[13];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word_num += " e " + num_Words[i];
								break;
							}
						}
						System.out.printf("\nNumri juaj eshte %s.", word_num);
					}
					else if(((nr/10)%10) == 4){
						word_num = num_Words[14];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word_num += " e " + num_Words[i];
								break;
							}
						}
						System.out.printf("\nNumri juaj eshte %s.", word_num);
					}
					else{
						for(i=5; i<10; i++){
							for(j=0; j<10; j++){
								if(j == (nr%10)){
									temp = num_Words[j];
									nr = num/10;
									break;
								}
							}
							if(i == (num%10)){
								word_num = num_Words[i] + num_Words[10] + " e " + temp;
								break;
							}
							break;
						}
						System.out.printf("\nNumri juaj eshte %s.", word_num);
					}
			}
			else if(shifra == 3){
				nr = num;
				for(k=1; k<10; k++){
					if((nr/10)%10 == 0){
						for(i=0; i<10; i++){
							if(i == (num%10)){
								word = num_Words[i];
								break;
							}
						}
					}
					
					else if((nr/10)%10 == 1){
						word = num_Words[10];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word = num_Words[i] + num_Words[11];
								break;
							}
						}
					}			
				
					else if((nr/10)%10 == 2){
						word = num_Words[12];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word += " e " + num_Words[i];
								break;
							}
						}
					}
			
					else if((nr/10)%10 == 3){
						word = num_Words[13];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word += " e " + num_Words[i];
								break;
							}
						}
					}
			
					else if((nr/10)%10 == 4){
						word = num_Words[14];
						for(i=1; i<10; i++){
							if(i == (num%10)){
								word += " e " + num_Words[i];
								break;
							}
						}
					}
			
					else{
						for(i=5; i<10; i++){
							for(j=0; j<10; j++){
								if(j == (nr%10)){
									temp = num_Words[j];
									nr = num/10;
									break;
								}
							}
							if(i == (num%10)){
								word = num_Words[i] + num_Words[10] + " e " + temp;
								break;
							}
							break;
						}
					}
					if(k == ((num/100)%10)){
						word_num = num_Words[k] + num_Words[num_Words.length - 1] + " e " + word;
						break;
					}
					break;
				}
			System.out.printf("\nNumri juaj eshte %s.", word_num);
			}
			else{
				System.out.println("\nGabim!!!Duhet te vendosni nje numer te plote pozitiv deri ne tre shifra");
			}
			
		}catch(InputMismatchException e){
			e.printStackTrace(System.out.printf("Ju nuk keni vendosur nje numer."));
		}
		
		input.close();
	}
}
