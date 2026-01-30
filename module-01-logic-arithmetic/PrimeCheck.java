public class PrimeCheck {
    // Determine whether a number is prime.
    public static void main(String[] args) {
        int number = 163;

        int divisors = 0;
        

        for (int num=1; num<number; num++){
            if (number % num == 0) {
                divisors +=1;
            }
        }

        if (divisors ==1){
            System.err.println(" prime number");
        }
        else{
            System.err.println("not a prime number");
        }

        
    }
}
