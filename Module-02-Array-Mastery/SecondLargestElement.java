public class SecondLargestElement {

    public static void main(String[] args) {

        int[] arr = {12, 35, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } 
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
