import java.util.Scanner;
public class GradeQuiz {
	
	public static void quiz(){
		Scanner input = new Scanner(System.in);
		int numOfQuestion;
		String key;
		String answer;
		int count=0;
		int correctAnswers=0;
		double point=0;
		double percentage=0;
		int earns = 1;
		double loses = 0.25;
		int i;
		
		System.out.println("How many questions are in the quiz? : ");
		numOfQuestion = input.nextInt();
				
		char keys[] = new char[numOfQuestion];
				
		System.out.println("Put the key answers for the questions : ");
		key = input.nextLine();
				
				
		for(i = 0; i<key.length(); i++){
			char c = key.charAt(i);
			if((Character.isLetter(c) || c == '?') && c != ' '){
				count++;
			}
		}
				
		if(count > numOfQuestion){
			System.out.println("You have typed more key answers than the number of question." +
				"Please put the correct key answers!");
		}
		else if(count < numOfQuestion){
			System.out.println("You have typed less key answers than the number of question." +
				"Please put the correct key answers!");	
		}
		else{
			for(i = 0; i<numOfQuestion; i++){
				char c = key.charAt(i);
				keys[i] = c;
			}
		}
				
		System.out.println("Put your answers for the questions : ");
		answer = input.nextLine();
		
		for(i = 0; i<answer.length(); i++){
			char c = answer.charAt(i);	//we store to the variable c of type character the value of the character with index i
			if((Character.isLetter(c) || c == '?') && c != ' '){	//in the key string using the function charAt()
				count++;
			}
		}
			
		if(count > numOfQuestion){
			System.out.println("You have typed more answers than the number of question." +
				"Please put the correct key answers! : ");
		}
		else if(count < numOfQuestion){
			System.out.println("You have typed less answers than the number of question." +
				"Please put the correct number of answers!");
		}
		else{
			for(i = 0; i<numOfQuestion; i++){
				char c = answer.charAt(i);
				if(keys[i] != '?' && (keys[i] == c)){
					correctAnswers++;
					point = point + earns;
				}
				else if(keys[i] == '?'){
					point = 0 + point;
				}
				else{
					point = point - loses;
				}
			}
			percentage = (correctAnswers/numOfQuestion)*100;
					
			System.out.printf("You have earned %f points. You have %d or %.2f percent correct answers", point, correctAnswers, percentage);
		}
		
		System.out.println("\nDo you want to grade another quiz? Choose y or n: ");
		String choose = input.next();
		switch(choose){
		case "y":
		case "Y":
				quiz();
				break;
				
		case "n":
		case "N":
				System.exit(0);
				break;
		default:
			System.out.println("Nuk keni zgjedhur sakte!");	
		}
		
		input.close();
	}
				
	public static void main(String[] args) {

		quiz();
		
	}

}
