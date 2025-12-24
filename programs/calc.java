package programs;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double no1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /,^): ");
        String operator = scanner.next();

        System.out.print("Enter the second number: ");
        double no2 = scanner.nextDouble();

        double result = 0;
        if (operator.equals("+")) {
            result = no1 + no2;
        } 
        else if (operator.equals("-")) {
            result = no1 - no2;
        } 
        else if (operator.equals("*")) {
            result = no1 * no2;
        } 
        else if (operator.equals("/")) {
            if (no2 != 0) {
                result = no1 / no2;
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        } 
        else if (operator.equals("^")){
            result = Math.pow(no1, no2);
        }
        else {
            System.out.println("Invalid operator!");
        }

        System.out.printf("The result is: %.2f\n",result);
        scanner.close();
    }
}