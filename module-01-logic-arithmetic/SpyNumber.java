import java.util.Scanner;

public class SpyNumber {
     
    public static int SumOfDigit(int x){
        
        int sum =0;
        while(x>0){
            int remainder = x%10;
            sum = sum+ remainder;
            x=x/10;
        }
        return sum;
    }

    public static int ProductOfDigit(int x){
        int product =1;
        while(x>0){
            int remainder = x%10;
            product = product * remainder;
            x=x/10;
        }
        return product;
        
    }
 

    public static void main(String[] args) {

        System.err.println("Enter a number:");
        Scanner myobj = new Scanner(System.in);
        int number = myobj.nextInt();

        int sum = SumOfDigit(number);
        System.err.println("sum of digit of "+ number +" is "+ sum);

        int product = ProductOfDigit(number);
        System.err.println("product of digit of "+ number +" is "+ product);

        if (sum == product){
            System.err.println(number + "is a spy number");
        }
        else{
            System.err.println(number + " is not a spy number");
        }
        
    }
}
