import java.util.Scanner;
public class ExtractDigis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap day so: ");
        int n = sc.nextInt();
        while(n>0){
            int digit = n%10;
            System.out.print(digit + " ");
            n = n/10;
        }
    }
}

