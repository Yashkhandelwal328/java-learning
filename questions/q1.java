package questions;
// Q. WAP to find the peak element in an unsorted array which is not smaller than its neighbors. Array has to be taken as input.
public class q1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int n = 1;
        int[] ans = new int[n];
        int length = arr.length;
        int now = length/2;
        for(int i = 0 ; i < length ; i+=1){
            if(arr[now]<arr[now-1]){
                now -= 1;
            }
            else if(arr[now]<arr[now+1]){
                now -= 1;
            }
            else{
                n+=1;
                ans[n-1] = arr[now];    
                arr[now] = 0;
            }
        }
    }

}
