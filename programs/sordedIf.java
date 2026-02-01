package programs;


public class sordedIf {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 20};
        
        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false; 
                break;            
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

