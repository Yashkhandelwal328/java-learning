package programs;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter a number to reverse => ");
        int number = scanner.nextInt();
        while (number > 0) {
            int digit = number % 10;      
            list.add(digit);
            number = number / 10;       
        }
        list.reversed();
        System.out.print("Reversed number --> ");
        for(int n : list){
            System.out.print(n);
        }
        System.out.println();
        // System.out.println(list);
        scanner.close();
    }
}
