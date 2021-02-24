import java.util.Scanner;


public class MultChoice extends TestQuestion{
	
	int num_choice;
	String answerChoices[];
	
	public void readQuestion(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type question:");
		this.testQuestion = input.next();
		
		System.out.println("How many answers choices has these question?:");
		this.num_choice = input.nextInt();
		
		answerChoices = new String[num_choice];
		
		System.out.println("Type answers choices:");
		
		for(int i = 0; i<this.answerChoices.length; i++){
			this.answerChoices[i] = input.next();
		}
		input.close();
	}
	
	public String toString(){
		String s = "";
		
		for(int i = 0; i<this.answerChoices.length; i++){
			s += "" + "\t" + this.answerChoices[i];
		}
		return s;
	}
}
