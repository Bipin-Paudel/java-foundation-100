public class AutomorphicNumber {
    //a natural number whose square ends in the same digits as the original number itself

    public static void main(String[] args) {
        int number =76;
  
        int square = number * number; 
        String squareStr = String.valueOf(square);

        String numberStr = String.valueOf(number);

        if ( squareStr.contains(numberStr) ){
            System.err.println(number + " is a automorphic number");
        }
        else{
            System.err.println(number + " is not a automorphic number");
        }


        
        

    }
}
