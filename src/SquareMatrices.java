import java.util.Scanner;
public class SquareMatrices {
	
	private static int n;
	private static int a [][];
	private static int value;
	static int i,j,k;
	
	public static int[][] format_A(){
		a = new int[n][n];
		value=1;
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				a[j][i]=value;
				value++;
			}
		}
		return a;
	}
	
	
	public static int[][] format_B(){
		a = new int[n][n];
		value=1;
		for(j=0; j<n; j++){
			if(j%2!=0){
				for(i=n-1; i>=0; i--){
					a[i][j]=value;
					value++;
				}
			}
			
			else{
				for(i=0; i<n; i++){
					a[i][j]=value;
					value++;
				}
			}
		}
		return a;
	}
	
	
	public static int[][] format_C(){		//rendi diagonal
		a = new int[n][n];
		value=1;
		for(k=n-1; k>=0; k--){
			i=k;
			j=0;
			while(i<n){
				a[i][j]=value;
				i=i+1;
				j=j+1;
				value++;
			}
		}
		for(k=1; k<n; k++){
			i=0;
			j=k;
			while(j<n){
				a[i][j]=value;
				i=i+1;
				j=j+1;
				value++;
			}
		}
		return a;
	}
	
	
	public static int[][] format_D(){		//rendi spiral
		a = new int[n][n];
		value=1;
		int top=0, left=0, bottom=n-1, right=n-1, dir=0;
		while(top<=bottom && left<=right){
			if(dir==0){
				for(i=top; i<=bottom; i++){
					a[i][left]=value;
					value++;
				}
				left++;
			}
			else if(dir==1){
				for(i=left; i<=right; i++){
					a[bottom][i]=value;
					value++;
				}
				bottom--;
			}
			else if(dir==2){
				for(i=bottom; i>=top; i--){
					a[i][right]=value;
					value++;
				}
				right--;
			}
			else if(dir==3){
				for(i=right; i>=left; i--){
					a[top][i]=value;
					value++;
				}
				top++;
			}
			
			dir=(dir+1)%4;
		}
		
		return a;
	}
	
	
	
	public static void afishoMatrice(int a [][]){	//funksion me tip void, merr si argument nje matrice te tipit int dhe e afishon ne rreshta e shtylla
		System.out.println("\nAfishimi i matrices:");
		System.out.print("_________________\n");
			for(i=0; i<a.length; i++){
				for(j=0; j<a[i].length; j++){
					System.out.print("| " + a[i][j]);

				}
				System.out.print("|");
				System.out.print("\n");
				System.out.print("__________________");
				System.out.print("\n");
			}
	}
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Vendos permasen e matrices: ");
		n = input.nextInt();

		int l,r;
		int b [][];
		
		b = format_A();
		afishoMatrice(b);
		b = format_B();
		afishoMatrice(b);
		b = format_C();
		afishoMatrice(b);
		b = format_D();
		afishoMatrice(b);
		
		input.close();
	}

}
