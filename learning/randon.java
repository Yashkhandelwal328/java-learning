package learning;
import java.util.Random;
public class randon {
    public static void main(String[] args) {
        Random random = new Random();

        int number;

        number = random.nextInt(1, 6); // here 1 is inclusive 6 is exclusive gives random number bettween 1 to 5
        
        System.out.println(number);
    }
}
