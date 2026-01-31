package programs;
// Count how many digits are in a number (no strings).
import java.util.Scanner;
public class countDigits2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter a int. => ");
        int number = scanner.nextInt();
        // int length = String.valueOf(n).length();
        // System.out.println("There are " + length + " digits.");
        while (number > 0) {
            number = number / 10; 
            n ++;
        }
        System.out.println(n);
        scanner.close();
    }
}
