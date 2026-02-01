public class PrimeRange {
    //Print primes between X and Y.

    public static int PrimeCheck(int x){
       
      int var2 = 0;
      for(int var3 = 1; var3 <= x/2; ++var3) {
         if (x % var3 == 0) {
            ++var2;
         }
      }
      if (var2 == 1) {
         return var2;
      }
      else{
        return 0;
      }

    }
    public static void main(String[] args) {
        int x= 0;
        int y = 30;

        for(int i=x; i<y; i++){
            int number = PrimeCheck(i);
            if (number!= 0){
                System.out.println(i+ "\t");

            }
            }
        


        
    }
}
