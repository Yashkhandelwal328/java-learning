package learning;
import java.util.Scanner;
import java.util.InputMismatchException;
public class exceptionHandling {
    public static void main(String[] args) {
        
        // Eception = An event tat interrupts the normal flow of a program
        //            (Dividing by zero,file not found,mismatch input type)
        //            Surround any dangerous code with a try{} block
        //            try{} catch{} finally{}

        // System.out.println(1/0); // ArithmeticException
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a number\n-->");
            int n = scanner.nextInt();
            float a = 1.0f/n;
            System.out.println(a);
        }
        //type-ArithmeticException name-e 
        catch(ArithmeticException e){
            System.out.println("You cant divide by 0 Idiot");
        }
        catch(InputMismatchException e){
            System.out.println("Write a number");
        }
        catch(Exception e){ // catches all exceptions
            System.out.println("Some went wrong");
        }
        finally{ // always execute wethere there is an exception or not
            scanner.close(); // use for cleanup like this  
            System.out.println("This always executes");
        }
        // try(Scanner scanner = new Scanner(System.in)){ // we can put scanner and other type shit in like this too and java will close it atomatically when try catch finally happnes 
        //     System.out.println("Enter a number\n-->");
        //     int n = scanner.nextInt();
        //     float a = 1.0f/n;
        //     System.out.println(a);
        // }
        // //type-ArithmeticException name-e 
        // catch(ArithmeticException e){
        //     System.out.println("You cant divide by 0 Idiot");
        // }
        // catch(InputMismatchException e){
        //     System.out.println("Write a number");
        // }
        // catch(Exception e){ // catches all exceptions
        //     System.out.println("Some went wrong");
        // }
        // finally{ // always execute wethere there is an exception or not 
        //     System.out.println("This always executes");
        // }
    }   
}
