import java.util.Scanner;
public class WriteTest {

	private static int n;
	
	private TestQuestion tq[];
	
	public static void main(String[] args) {
		
		WriteTest wt = new WriteTest();
		Essay essay = new Essay();
		MultChoice multch = new MultChoice();
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many questions do you want to enter?:");
		n = input.nextInt();
		
		wt.tq = new TestQuestion[n];
		
		for(int i = 0; i<n; i++){
			
			System.out.println("Choose type of the question? Press e = Essay or m = Multiple Choice:");
			String type = input.next();
			
			if(type.equalsIgnoreCase("e")){
				essay.readQuestion();
				wt.tq[i] = essay;
			}
			else if(type.equalsIgnoreCase("m")){
				multch.readQuestion();
				wt.tq[i] = multch;
			}
			else{
				System.out.println("You have not choosed correctly!");
			}
		}
		
		for(int i = 0; i<wt.tq.length; i++){
			System.out.println(wt.tq[i].toString());
		}

		input.close();
	}

}
