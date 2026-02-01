package programs;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];

            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } 
            else if (n < largest && n > secondLargest) {
                secondLargest = n;
            }
        }

        System.out.println("Largest = " + largest);
        System.out.println("Second largest = " + secondLargest);
    }
}
