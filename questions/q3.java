package questions;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int rows = sc.nextInt();

        System.out.println("Enter no of columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number to find\n-->");
        // output (separate loop)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
