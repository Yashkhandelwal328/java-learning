package lab;
import java.util.Scanner;
public class meow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your fav color? ");
        String color = scanner.nextLine();
        System.out.println("Wow! "+color+" is your fav color");
        scanner.close();
    }
}
