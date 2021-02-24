import java.util.Scanner;
public class SumOfNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vendos madhesine e vektorit:");
		int size = input.nextInt();
		
		int vector[] = new int[size];
		
		System.out.println("Vendos vlerat e vektorit");
		int i=0,j=0;
		
		for(i=0; i<vector.length; i++){
			System.out.printf("Elementi %d:", i);
			vector[i]=input.nextInt();
		}
		
		System.out.println("Vendos nje vlere per shumen:");
		int n = input.nextInt();
		
		input.close();
		int sum;
		
		for(i=0; i<vector.length; i++)
		{
			sum=0;
			sum = sum + vector[i];
			
			for(j=i+1; j<vector.length; j++)
			{
				if(sum < n){
					sum = sum + vector[j];
				}
			}
			
			if(sum == n){
				System.out.printf("\nNumrat me shumen %d jane: {%d, %d, %d}",n,vector[i],vector[i+1],(sum - vector[i] - vector[i+1]));
				break;
			}
			else
				sum = sum-vector[i];
		}

	}

}
