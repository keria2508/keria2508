import java.util.Scanner;
public class HillPatternA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= 2 * size; col++) {
				if(row + col >= size + 1 && row >= col - size + 1) 
					System.out.print("#" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
		
	}

}