public class SumAverageRunnungInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number <= upperbound; number++) {
            sum += number;
        }
        System.out.println("The sum of 1 to 100: " + sum);
        average = (double) sum / 100;
        System.out.println("The average is: " + average);
    }
        public class SumAverageRunningInt {
            public static void main(String[] args) {
                int sum = 0;
                double temp = 0;
                final int LowerBound = 1;
                final int UpperBound = 100;
                for(int i = LowerBound; i <= UpperBound; i++) {
                    sum += i;
                    count++;
                }
                System.out.println("The sum of 111 to 8899 is: " + sum);
                System.out.println("The average is: " + sum/count);
            }
         }
         
         public class SumAverageRunningInt {
            public static void main(String[] args) {
                int sum = 0;
                int count = 1;
                final int LowerBound = 1;
                final int UpperBound = 100;
                for(int i = LowerBound; i <= UpperBound; i++) {
                    sum += temp;
                    temp = i*i;
                }
                System.out.println("The sum of the squares from 1 to 100 is: " + sum);
            }
         }
        public class SumAverageRunningInt {
            public static void main(String[] args) {
                int sumOdd = 0;
                int sumEven = 0;
                final int LowerBound = 1;
                final int UpperBound = 100;
                for(int i = LowerBound; i <= UpperBound; i++){
                    if(i % 2 != 0)
                        sumOdd += i;
                    else
                        sumEven += i;
                int absDif = 0;
                adsDif = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
                System.out.println(adsDif);
            }
       }
}