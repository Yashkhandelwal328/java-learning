package programs;
import java.util.Scanner;
public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the loop you want to continue to => ");
        int a = scanner.nextInt();
        for(int i = 110 ; i<a+1 ; i +=1){
            if(i%15 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
                continue;
            }
            else if(i%5 == 0){
                System.out.println("Buzz");
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
