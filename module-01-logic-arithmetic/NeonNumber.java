public class NeonNumber {
    //  Digit sum of square equals the number.

    public static int DigitSumOfSquare(int x){
        
        int sum =0;
        while (x>0) {
            int remainder = x % 10;
            sum = sum + remainder;
            x = x/10;

        }
        return sum;

    }

    public static void main(String[] args) {

        int number = 9
        ;
        int square = number * number;
        int sum = DigitSumOfSquare(square);

        if (number == sum){
           System.out.println("given number is a Neon number ");
        }
        else{
            System.out.println("given number is not a Neon number ");
        }
        
    }


    
}
