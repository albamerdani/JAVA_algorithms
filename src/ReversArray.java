import java.util.Scanner;
public class ReversArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nr;
		int i;
		int temp;
		
		System.out.println("Put a pozitive number: ");
		nr = input.nextInt();
		
		int vector[] = new int[nr];
		
		System.out.println("Put as much number values as the number that you entered shows: ");
		for(i = 0; i<nr; i++){
			System.out.printf("Value %d: ", i);
			vector[i] = input.nextInt();
		}
		
		
		System.out.println("Values of the array are: ");
		for(i = 0; i<vector.length; i++){		//vector.length is equal with nr, is the same thing
			System.out.printf("%d ", vector[i]);
		}
		
		
		for(i = 0; i<nr/2; i++){	//loop start from beginning of the array to the half of it because for x elements we have
				temp = vector[i];	// x/2 changes it means 1 change for 2 elements
				vector[i] = vector[nr-i-1];		//nr - i - 1 is the index of the corresponding element with whom the element i
				vector[nr-i-1] = temp;			//is going to change the position
		}
		
		System.out.println("Values of the reversed array are: ");
		for(i = 0; i<vector.length; i++){
			System.out.printf("%d ", vector[i]);
		}
		
		input.close();
	}

}
