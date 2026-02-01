



public class MenuCalculator {
 

    public static void calculator(int a, int b, char operator){
        
        switch (operator) {
            case '+':
                System.out.println("sum is "+ (a+b));
                break;
            case '-':
                System.out.println("subtraction is "+ (a - b));
                break;
            case '*':
                System.out.println("multiplication is "+ (a*b));
                break;

            case '/':
                System.out.println("sum is "+ (float)(a/b));
                break;    
            default:
                break;
        }

    }

    public static void main(String[] args) {

        int a =25, b=20 ;
       
        calculator(12, 13,'*' );

    }
}
