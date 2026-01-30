

public class DigitSum {
    public static void main(String[] args){

        int num = 1239;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println(sum);

    }
 
 
}