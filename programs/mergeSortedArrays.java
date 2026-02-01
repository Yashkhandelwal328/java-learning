package programs;
import java.util.Arrays;
public class mergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10};
        int[] arr2 = {1,3,5,7,9};

        int mergedLength = arr1.length + arr2.length;
        int[] arr = new int[mergedLength];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

        // for(int i = 0 ; i < arr.length ; i ++){
        //     System.out.println(arr[i]);;
        // }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}
