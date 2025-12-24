package programs;
import java.util.Scanner;
public class temperatureConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temerpature: ");
        double temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Convert to Celcius or Fahrenhiet? (C or F):");
        String unit = scanner.nextLine();
        unit = unit.toLowerCase();
        double newTemp;
        newTemp = (unit.equals("c")) ? (temp - 32) * 5/9 : (temp * 5.0/9.0) + 32;
        System.out.printf("%.1f%s\n", newTemp , unit);

        scanner.close();
    }
}
