public class DecimaltoBinary {
    public static void main(String[] args) {
        int decimal = 13;

        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;  // prepend remainder
            decimal = decimal / 2;
        }

        System.out.println("Binary value: " + binary);
    }
}
