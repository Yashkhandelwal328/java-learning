package programs;
import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int min = 1;
        int max = 100;
        int num = 0;
        int randomNumber = random.nextInt(min,max + 1);
        while (num != randomNumber) {
            System.out.print("Enter a number to guess: (1-100) ");
            num = scanner.nextInt();
            if(num > randomNumber){
                System.out.println("Too High");
            }
            if(num< randomNumber){
                System.out.println("Too Low");
            }
            attempts += 1;
            }
        System.out.printf("Yes you guess %d right number in %d attempts\n",num,attempts);
        scanner.close();
        }
    }

