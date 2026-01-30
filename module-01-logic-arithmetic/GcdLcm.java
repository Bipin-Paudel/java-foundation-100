public class GcdLcm {

    static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    
    static int lcm(int a, int b) {
        return ((a * b)/ gcd(a, b)) ;   
    }

    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 36;

        System.out.println("GCD: " + gcd(num1, num2));
        System.out.println("LCM: " + lcm(num1, num2));
        
    }
    
}
