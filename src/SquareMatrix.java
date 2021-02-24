import java.util.Scanner;


public class SquareMatrix {

	private double matrix[][];
	private int n;
	
	public SquareMatrix(int size){
		size = n;
		matrix = new double[size][size];
	}
	
	public void setCell(int row, int column, double value){
		this.matrix[row][column] = value;		//give value to the cell positioned in that row and column
	}
	
	public double getCell(int row, int column){
		
		return matrix[row][column];			//return the value of the cell in that row and column index
	}
	
	public void readMatrix(Scanner in, int i, int j){
			//index i is for rows, index j is for columns
		double val;
		System.out.println("Put a value for a matrix cell: ");
				val = in.nextDouble();
				this.setCell(i,j,val);		//for each cell it sets a double value using setCell function
	}
	
	public String toString(int i, int j){
		String s="";
		s += this.getCell(i,j) + "\t";
		System.out.printf(s);
		return s;
	}
	
	public String toString2(){
		int i, j;
		String s="";
		for(i=0; i < n; i++){
			for(j=0; j < n; j++){
				s += this.getCell(i,j) + "\t";
				System.out.printf(s);
			}
			s += "\n";
		}
		System.out.printf(s);
		return s;
	}
	
	public SquareMatrix plus(SquareMatrix a){
		SquareMatrix b = new SquareMatrix(n);
		int i, j;
		if(a.n == this.n){			//it compares the size of matrixes, they should be equal to add.
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					b.matrix[i][j] = matrix[i][j] + a.matrix[i][j];	//each cell add with the corresponding cell positioned in
				}													//the other matrix a that function takes as an argument
			}
		}
		return b;
	}
	
	public SquareMatrix minus(SquareMatrix a){		//is the same logic as function plus()
		SquareMatrix b = new SquareMatrix(n);
		int i, j;
		if(a.n == this.n){
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					b.matrix[i][j] = matrix[i][j] - a.matrix[i][j];
				}
			}
		}
		return b;
	}
	
	public void fillRandom(int a, int b){
		int i, j;
		double val;
		for(i=0; i < n; i++){
			for(j=0; j < n; j++){
				System.out.println("Put a value for a matrix cell: ");
				val = a + (Math.random()*b);	//variable val takes random double values in range from a to b
				setCell(i,j,val);		//we use function setCell to give value each cell of the matrix, value that is in
			}							//the variable val
		}
	}
	
	public double privateCalcCell(SquareMatrix m, int row, int col){
		int k;
		double cell = 0;
		for(k=0; k<n; k++){
			cell += this.matrix[row][k] * m.matrix[k][col];
		}
		return cell;
	}
	
	public SquareMatrix maltiply(SquareMatrix c){
		SquareMatrix d = new SquareMatrix(n);
		int i, j;
		if(c.n == this.n){
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					d.matrix[i][j] = privateCalcCell(c,i,j);
				}
			}
		}
		return d;
	}
	
	public SquareMatrix power(int pow){
		int i;
		SquareMatrix powerMatrix = this;
		if(pow == 1){
			return this;
		}
		else{
			for(i = 2; i<=pow; i++){
				powerMatrix = powerMatrix.maltiply(this);
			}
			
			return powerMatrix;
		}
		
	}
	
	
}
