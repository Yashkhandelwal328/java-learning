package programs;
import java.util.Scanner;



public class area_clac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what you want to calculate:");
        System.out.println("1.Circle Area");
        System.out.println("2.Circle Parameter");
        System.out.println("3.Rectangle Area");
        System.out.println("4.Rectangle Parameter");
        System.out.println("5.Triangle Area");
        System.out.println("6.Triangle Parameter");

        System.out.print("Enter 1/2/3/4/5/6: ");
        int input = scanner.nextInt();
        scanner.nextLine();
        if(input == 1){
            System.out.print("Enter radius: ");
            int radius = scanner.nextInt();
            System.out.println("Area = "+3.14 * (radius*radius));
        }
        else if(input == 2){
            System.out.print("Enter radius: ");
            int radius = scanner.nextInt();
            System.out.println("Parameter = "+2 * 3.14 * radius);
        }
        else if(input == 3){
            System.out.print("Enter length: ");
            int l = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter bredth: ");
            int b = scanner.nextInt();
            System.out.println("Area = "+l*b);
        }
        else if(input == 4){
            System.out.print("Enter length: ");
            int l = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter bredth: ");
            int b = scanner.nextInt();
            System.out.println("Parameter = "+4*(l+b));
        }
        else if(input == 5){
            System.out.print("Enter length: ");
            int l = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter bredth: ");
            int b = scanner.nextInt();
            System.out.println("Area = "+0.5*l*b);
        }
        else if(input == 6){
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter b: ");
            int c = scanner.nextInt();
            System.out.println("Parameter = "+(a+b+c));
        }
        


        scanner.close();
    }
}
