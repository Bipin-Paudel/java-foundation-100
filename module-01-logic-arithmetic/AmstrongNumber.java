import java.lang.Math; 
//Validate if sum of digit powers equals the number.
public class AmstrongNumber{
  
  public static void main(String[] args){
    int x = 153;
    int digit = String.valueOf(x).length();
    int original = x;
 
    int lastDigit, sum =0;
    while(x>0){
      lastDigit = x%10;
      sum += (int) Math.pow(lastDigit, digit);
      x = x/10;

    }
    boolean isArmstrong = (sum == original);

    if (isArmstrong){
      System.out.println("Amstrong number");
    }
    else{
      System.out.println(" not a Amstrong number");
    }
    


  }

}