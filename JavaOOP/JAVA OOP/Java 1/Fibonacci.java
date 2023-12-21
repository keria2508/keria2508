public class Fibonacci {
    public static void main(String[] args){
        int maxNumber = 20;
        int previousNumber = 1;
        int nextNumber = 1;
        double average;
        System.out.println("The first"+" "+ maxNumber + " Fibonaci numbers are: ");
        for(int i = 1; i <= maxNumber; i++){
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
