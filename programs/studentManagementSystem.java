package programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class studentManagementSystem {
    public static void main(String[] args) {
        List<String> std = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean isLoop = true;
        while (isLoop) {
            
            System.out.println("Welcome to our Student Management System!");
            System.out.println("Press 1. to Add student");
            System.out.println("Press 2. to View student");
            System.out.println("press 0 to exit");
            System.out.print("=>");
            int addorview = scanner.nextInt();
            if(addorview == 1){
                System.out.print("How many Srudents you wana add? =>");
                int noStd = scanner.nextInt();
                scanner.nextLine();
                for(int i = 0; i < noStd ; i+=1){
                    System.out.print("Enter name of student \n=>");
                    String name = scanner.nextLine();
                    std.add(name);
                    
                }
            }
            else if(addorview == 2){
                for(String s : std){
                System.out.println(s);
            }
            }
            else if(addorview == 0){
                isLoop = false;
            }
        }
        } 
    }

