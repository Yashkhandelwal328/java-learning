package programs;
import java.util.Scanner;
public class countOcourrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to scan from list => ");
        int a = scanner.nextInt();

        int[] arr = {1,2,2,3,4};
        int n = 0;

        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] == a){
                n+=1;
            }
        }

        System.out.println(a + " appeared " + n + " times.");

        scanner.close();
        
    }
}
