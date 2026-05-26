package questions;
//Qs. Take an array as input from the user. Search for a given number x and print the index at which it occurs.
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array\n--> ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Enter which number to find\n--> ");
        int x = sc.nextInt();
        System.out.println("Enter numbers to be in the array");
        for(int i = 0 ; i <a;i++){
            System.out.print("at index " + i + " enter number\n-->");
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        for(int i = 0; i <a ; i++){
            if(arr[i] == x){
                ans = i;
            }
        }
        if(ans == -1){
            System.out.println("Number not found");
        } else {
            System.out.println("Found at index: " + ans);
        }
    }
}
