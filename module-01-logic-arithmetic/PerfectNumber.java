public class PerfectNumber {
    // Sum of divisors equals the number.

    public static int SumOfDivisors(int x){

        int  sum = 0;
        
        for(int i=1; i<x; i++){
            if (x%i ==0){
                sum = sum +i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
 

        int number =28;
        int sum = SumOfDivisors(number);
        System.out.println("sum of divisors equal to" + sum);

        if (number == sum){
            
        }
       
        
    }
    
}
