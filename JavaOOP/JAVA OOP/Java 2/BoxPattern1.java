import java.util.Scanner;
public class BoxPattern1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		do {
			System.out.println("Nhap size: ");
			size = sc.nextInt();
		} while(size <= 0);
		for(int row = 1; row <= size; row++) {
			for(int col = 1; col <= size; col++) {
				if(row == 1 || row == size || col == 1 || col == size) 
					System.out.print("#" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}

}
