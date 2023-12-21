public class HarmonicSum {
        public static void main(String[] args){
            double sumL = 0;
            double sumR = 0;
            final int MAX_DENOMINATOR = 500000;
            for(int i=1; i<=MAX_DENOMINATOR; i++){
                sumL += 1/i;
            }
            for(int j=MAX_DENOMINATOR; j>=1; j--){
                sumR += 1/j;
            }
            System.out.println("The sum from left to right: " + sumL);
            System.out.println("The sum from right to left: " + sumR);
    
            double absDiff = (sumR > sumL) ? sumR-sumL : sumL-sumR;
            if(absDiff == 0){
                System.out.println("Hai Tong bang nhau");
            }else if(sumL < sumR){
                System.out.println("SumL is correct");
            }else{
                System.out.println("SumR is correct");
            }
        }
}
