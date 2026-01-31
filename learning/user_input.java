package learning;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in); // You open a direct hotline to the keyboard. Java is now capable of listening. Before this, it’s deaf.


        // // Input
        // System.out.print("Enter your name: "); // You yell instructions at the human. That’s all this line does. No listening. Just vibes.
        // String name = scanner.nextLine(); 
        // // nextLine() means:
        // // “Wait. Stop everything. Let the user type an entire line.
        // // When they press Enter, give me ALL of it as a String.”
        // // if we use next instead of next line it will only take first word
        // // for example if we input "meow gang gang". name = "meow"
        // System.out.print("Enter your age ");
        // int age = scanner.nextInt(); // nextInt is used for intergers.
        // System.out.print("whats your gpa ");
        // Double gpa = scanner.nextDouble();
        // System.out.print("Are you a cool person (true/false) ");
        // Boolean isCool = scanner.nextBoolean();
        // // Output  
        // System.out.println("Hello "+ name);
        // System.out.println("You are " + age + " years old"); 
        // System.out.println("Your gpa is "+gpa);   
        // // System.out.println("is "+name+" cool? -->" + cool);
        // if(isCool){
        //     System.out.println(name+" is cool");
        // }
        // else{
        //     System.out.println(name+" is not cool");
        // }
        
        // scanner.close();

        // Common Error

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // System.out.print("Enter your name nigga: ");
        // String name = scanner.nextLine();
        // System.out.println("your age is " + age);
        // System.out.println("your name is " + name);
        // scanner.close();

        // Output = Enter your age: 17
        // Enter your name nigga: your age is 17
        // your name is 
        // after we enter age as 17 and press enter that enter is taken as the name here which is blank and causes nothing to print we can fix this by adding a scanner.nextLine(); after the age one 
    
        // Fixed one 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // <-- Fix
        System.out.print("Enter your name nigga: ");
        String name = scanner.nextLine();
        System.out.println("your age is " + age);
        System.out.println("your name is " + name);
        scanner.close();
    
    
    
    
    
    
    }
}
