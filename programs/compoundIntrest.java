package programs;
import java.util.Scanner;
public class compoundIntrest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: $");
        int P = scanner.nextInt();
        System.out.print("Enter the rate of intrest: %");
        double r = scanner.nextDouble();
        System.out.print("Enter the # times coumpounded per year: ");
        double n = scanner.nextDouble();
        System.out.print("Enter the # of the year/s");
        double t = scanner.nextDouble();
        r = r/100;
        double A = P*Math.pow(1+r/n,n*t);
        System.out.printf("Your Amount will be $%.2f",A);
        scanner.close();
    }
}
