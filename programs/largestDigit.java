package programs;
import java.util.Scanner;
// Find the largest digit in a number.
public class largestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 0;
        String s = String.valueOf(number);

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        System.out.println("Largest digit = " + maxDigit);
        scanner.close();
    }
}
