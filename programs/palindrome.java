package programs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> list = new ArrayList<>();
        System.out.print("Enter a word to check for palindrome => ");
        String word = scanner.nextLine();
        // System.out.println(word);
        for(int i = word.length()- 1; i >= 0 ; i --){
            list.add(word.charAt(i));
        }
        String meow = "";
        for(Character c : list){
            meow += c;
        }
        if(meow.equals(word)){
            System.out.println("yes " + word + " is a palindrome.");
        }
        else{
            System.out.println("no " + word + " is not a palindrome.");
        }
        // System.out.println(meow);
        scanner.close();
    }
}
