package programs;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {5,5,3,4,};
        int n1 = 0;
        int n2 = 0;
        for(int i = 0 ; i < arr.length ; i++){
           int n = arr[i];
           if(n>=n1){
                n2 = n1;
                n1 = n;
           }
           else if (n > n2 && n != n1) {
                // Update second largest if it's not a duplicate of largest
                n2 = n;
           }
           else{
               continue;
           }
        }
        System.out.println("the biggest number in the array is '" + n1 + "'.");
        System.out.println("the second biggest number in the array is '" + n2 + "'.");
    }
}
