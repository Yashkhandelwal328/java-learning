package programs;
// Count how many digits are in a number (no strings).
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter a word. => ");
        String word = scanner.nextLine();
        for(int i = 0 ; i < word.length() ; i+=1){
            char c = word.charAt(i);
            if(Character.isDigit(c)){
                n ++;
            }
            else{
                continue;
            }
        }
        System.out.println("There are total of " + n + " digits.");
        
        scanner.close();
    }
}
