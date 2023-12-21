import java.util.Scanner;
import java.lang.Math;
public class SumProductMimMax3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is number do u want?:");
        System.out.print("Enter 1st integer: ");
        int a = in.nextInt();
        System.out.print("Enter 2st integer: ");
        int b = in.nextInt();
        System.out.print("Enter 3st integer: ");
        int c = in.nextInt();
        int sum = a+ b+ c;
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + a * b * c);
        int max = (Math.max(a,b)>c) ? Math.max(a,b):c;
        System.out.println("Max: " + max);
        int min = (Math.min(a,b)<c) ? Math.min(a, b):c;
        System.out.println("Min: " + min);
    }
}