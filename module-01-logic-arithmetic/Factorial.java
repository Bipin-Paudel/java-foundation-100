public class Factorial {
    
    public static void main(String[] args) {
        int number =5;
        int fact =1;
        while(number>0){
            fact = fact* number;
            number--;
        }
        System.err.println("factorial of number is "+ fact);
    }
}
