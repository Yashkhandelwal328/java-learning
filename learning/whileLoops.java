package learning;
import java.util.Scanner;
public class whileLoops {
    public static void main(String[] args) {
        
        // while loops = repeat some code foreever 
                    //   while some conditions remains true
        
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.print("What is your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);
        scanner.close();
        
        
    }
}
