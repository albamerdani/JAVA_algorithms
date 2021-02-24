import java.util.InputMismatchException;
import java.util.Scanner;

public class MaxSumOfMatrice {
	private static int i,j,k,l,p,q, n, m;
	
	public static void largestSumMatrix(int b[][]){		//funksion me tip void qe merr si argument nje matrice te tipit int
		int maxSum=0;									//dhe gjen brenda saj matricen 3x3 me shumen maksimale
		
		for(i=0; i<n; i++){
			for(j=0; j<m; j++){
				for(k=i; k<n; k++){
					for(l=j; l<m; l++){
						int sum = 0;
						
						for(p=i; p<i+3 && p<n; p++){
							for(q=j; q<j+3 && q<m; q++){
								sum+=b[p][q];
								
								if(sum>maxSum)
									maxSum = sum;
							}
						}
					}
				}
			}
		}
		
		System.out.printf("Shuma maksimale eshte %d", maxSum);
	}

	
	
	public static void main(String[] args) throws InputMismatchException {
		Scanner input = new Scanner(System.in);
	
			System.out.println("Vendos permasat e matrices: ");
			n = input.nextInt();
			m = input.nextInt();
		
			int b [][] = new int[n][m];
			for(i=0; i<n; i++){
				for(j=0; j<m; j++){
					System.out.printf("Vendos elementin (%d,%d) te matrices", i, j);
					b[i][j]=input.nextInt();
				}
			}
			
			largestSumMatrix(b);
			
			input.close();
	}

}
