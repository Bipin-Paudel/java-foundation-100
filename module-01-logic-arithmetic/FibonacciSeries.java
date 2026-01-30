public class  FibonacciSeries {
    public static void main(String[] args) {

        int n = 15;   // number of terms to print

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
        
    }
}
