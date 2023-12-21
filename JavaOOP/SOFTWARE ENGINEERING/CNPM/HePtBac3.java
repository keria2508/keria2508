package CNPM;
import java.util.Scanner;

public class HePtBac3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        int d3 = sc.nextInt();
        int D = (a1*b2*c3) + (b1*c2*a3) + (c1*a2*b3)
                - (a3*b2*c1) - (b3*c2*a1) - (c3*a2*b1);
        int Dx = (d1*b2*c3) + (b1*c2*d3) + (c1*d2*b3) - 
                (d3*b2*c3) - (b3*c2*d1) - (c3*d2*b1);
        int Dy = (a1*d2*c3) + (d1*b3*c1) + (b1*d3*a3) - 
                    (a3*d2*c1) - (d1*b1*c3) - (b3*d3*a1);
        int Dz = (a1*c2*d3) + (a2*d2*c1) + (b1*c2*d1) - 
                    (d1*b2*c1) - (a2*b1*d3) - (d2*c2*a1);
        if(D == 0){
            if( Dx == 0 && Dy == 0 && Dz == 0){
                System.out.println("Hệ vô số nghiệm:");
            }else{
                System.out.println("Hệ vô nghiệm");
            }
        }else{
            System.out.println(Dx/D, Dy/D, Dz/D);
        }
    }
}
