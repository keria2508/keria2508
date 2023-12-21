import java.util.Scanner;

public class HillPatternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= 2 * size; col++) {
				if(row + col >= 2 * size && row + col >= 2 * size) 
					System.out.print("#" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
