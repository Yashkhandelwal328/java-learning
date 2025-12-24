
package programs;
import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        String item = scanner.nextLine();
        System.out.print("What is the price for each?: $");
        Double cost = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("How many would you like?: ");
        int many = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You have bought "+many+" "+item+"/s");
        System.out.println("Your total is $"+cost);
        scanner.close();
    }
}
