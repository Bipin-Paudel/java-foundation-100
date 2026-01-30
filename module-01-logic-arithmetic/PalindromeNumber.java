public class PalindromeNumber{
 
 public static void main(String[] args){
    int number =1221221;
    
    int originalNumber = number;
    int lastDigit, reverse =0;
    while (number >0){
      lastDigit = number%10;
      reverse = (reverse*10)+lastDigit;
      number = number/10;
    }
     if (originalNumber == reverse){
        System.out.println(" given number is palindrome");
     }
     else{
                System.out.println(" given number is not palindrome");

     }
 }

}