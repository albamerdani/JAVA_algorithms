import java.util.Scanner;
public class MatrixTester {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i;
		int j;
		int nr;
		String str="";
		
		System.out.println("How large do you want to be your matrix? Put a number for the size: ");

		nr = input.nextInt();
		
		SquareMatrix m = new SquareMatrix(nr);
		
		for(i = 0; i < nr; i++){
			for(j = 0; j < nr; j++){
				m.readMatrix(input, i, j);
			}
		}
		
		for(i = 0; i < nr; i++){
			for(j = 0; j < nr; j++){
				str += m.toString(i, j);
			}
			str += "\n";
		}

		System.out.printf("%s", str);
		
		System.out.println("Put two values to choose the range of another matrix's values: ");
		System.out.println("Minimal value: ");
		int min = input.nextInt();
		System.out.println("Maximal value: ");
		int max = input.nextInt();
		
		SquareMatrix sm = new SquareMatrix(nr);
		sm.fillRandom(min, max);
		System.out.printf("%s", sm.toString());
		
		m.maltiply(sm);
		System.out.printf("%s", m.maltiply(sm).toString());
		
		System.out.println("Put a number for the power of your matrix: ");
		int p = input.nextInt();
		
		m.power(p);
		System.out.printf("%s", m.power(p).toString());
		input.close();
	}

}
