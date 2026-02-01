public class PowerLogic {
    public static void main(String[] args) {
        int number1 =6;
        int power = 3;

        int answer = 1;
        for (int i=0; i<power; i++){
          answer = answer* number1;
        }
        System.out.println(answer);
    }
}
