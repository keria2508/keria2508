import java.util.Scanner;
import java.util.Arrays;
public class Matrix{
    private static Scanner sc = new Scanner(System.in);
    public static void print(int[][] matrix){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[m][n];
        for(int i = 0; i < m;i++){
            for(int j = 0; j < n; j++){
                System.out.println("a["+(i+1)+"]["+(j+1)+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void print(double[][] matrix){
        int n = sc.nextInt();
        int m = sc.nextInt();
        double a[][] = new double[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println("a["+(i+1)+"]"+(j+1)+"]:");
                a[i][j] = sc.nextDouble();
            }
        }
    }
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2){

        return false;
    }
    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2){
        return false;
    }
    public static int add (int[][] matrix1, int[][] matrix2, int m, int n){
        int[][] add = new int[m][n];
        for(int i = 0; i < matrix1.length;i++){
            for(int j = 1; j < matrix2.length;j++){
                add[m][n] = matrix1[m][n] + matrix2[m][n];
            }
        }
        return add[m][n];
    }
    public static double add(double[][] matrix1, double[][] matrix2, int m, int n){
        double[][] add = new double[m][n];
        for(int i = 0; i < matrix1.length;i++){
            for(int j = 1; j < matrix2.length; j++){
                add[m][n] = matrix1[m][n] + matrix2[m][n];
            }
        }
        return add[m][n];
    }
    public static int subtract (int[][] matrix1, int[][] matrix2, int m, int n){
        int[][] sub = new int[m][n];
        for(int i = 0; i < matrix1.length;i++){
            for(int j = 1; j < matrix2.length;j++){
                sub[m][n] = matrix1[m][n] - matrix2[m][n];
            }
        }
        return sub[m][n];
    }
    public static double subtract(double[][] matrix1, double[][] matrix2, int m, int n){
        double[][] sub = new double[m][n];
        for(int i = 0; i < matrix1.length;i++){
            for(int j = 1; j < matrix2.length; j++){
                sub[m][n] = matrix1[m][n] + matrix2[m][n];
            }
        }
        return sub[m][n];
    }
    public static int multiply(int[][] matrix1, int[][] matrix2, int m, int n){
        int[][] mul = new int[m][n];
        for(int i = 0; i < matrix1.length;i++){
            for(int j = 1; j < matrix2.length;j++){
                int[][] matrix3 = new int[m][n];
                mul[m][n] = matrix3[m][n] + matrix1[m][n] * matrix2[m][n];
            }
        }
        return mul[m][n];
    }
    public static void main(String[] args) {
       
    }
}