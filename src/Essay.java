import java.util.Scanner;
public class Essay extends TestQuestion{

	int blankLines;
	
	public void readQuestion(){
		Scanner input = new Scanner(System.in);
		System.out.println("How many blank lines wolud you need?:");
		this.blankLines = input.nextInt();
		
		System.out.println("type question:");
		this.testQuestion = input.next();
		
		input.close();
	}
	
	public String toString(Essay essay){
		System.out.println("" + essay.blankLines);
		return essay.testQuestion;
	}
}