public class arithmetic {
    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        int z;


        // Arithmetic Operators

        z = x + y; // add

        System.out.println(z);

        z = x - y; // subtraction

        System.out.println(z);

        z = x*y;
        
        System.out.println(z);

        z = x / y; // division

        System.out.println(z);

        z = x % y; // remainder

        System.out.println(z);

        // Augmented Assigment Operators

        x +=y; // x = x+y
        System.out.println(x);

        // Increment and Decrement Operators

        x = 1;

        x++; // increment x by 1

        System.out.println(x);

        x--; // decrement by 1 

        System.out.println(x);

        // Order of Operations [P-E-M-D-A-S]

        double result = 3 + 4 *(7-5) / 2.0;

        System.out.println(result);



    }
}
