
// Reverse a number without using strings.
public class ReverseInteger {
    public static void main(String[] args){
    
    int number = 1234;
    int lastDigit = 0;
    int reverse =0;

    while (number>0){
        lastDigit = number%10;
        reverse = (reverse * 10) + lastDigit;
        number = number/10;

    }
     System.out.println("Reverse of the string is "+ reverse);
   

    }
 

}