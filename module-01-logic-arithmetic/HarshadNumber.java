import java.util.Scanner;
public class HarshadNumber {
    // Definition: A number n is a Harshad number if n(mod sum of digits) =0 .
    
    public static int SumOfDigit(int x){
        
        int sum =0;
        while(x>0){
            int remainder = x%10;
            sum = sum+ remainder;
            x=x/10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.err.println("Enter a number:");
        Scanner myobj = new Scanner(System.in);
        int number = myobj.nextInt();

        int sum = SumOfDigit(number);
        System.out.println("sum of digit of "+ number +"is "+ sum);

        if (number%sum ==0){
            System.out.println(number + "is a harshad number ");
        }
        else{
            System.out.println(number + " is not  a harshad number ");
        }

        
    }
}
