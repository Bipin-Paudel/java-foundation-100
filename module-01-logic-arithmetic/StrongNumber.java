public class StrongNumber {
    static int factorial(int x){
        
        if(x<=1){
         return 1;
        }
        return  x*factorial(x-1);
    }

    static int Strong(int x){
        int sum =0;
        int temp =x;

       while (temp>0) {
        int lastDigit = temp % 10;
        sum += factorial(lastDigit);
        temp = temp / 10;
       }
       return sum;
    }
    public static void main(String[] args) {
        int number = 145;

        int sum = Strong(number);
        if (sum == number){
            System.err.println("given number is strong number");
        }
        else{
            System.err.println("given number is not strong number");
        }
    }
}
