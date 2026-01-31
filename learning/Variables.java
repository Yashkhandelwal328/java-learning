package learning;
public class Variables {
    public static void main(String[] args) {
        // variable = a reuseable container for a value 
        //            a variable behaves as if it was the value it contains 
        
        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primative vs Reference
        // --------     ---------
        // int(1)       string
        // double(1.44) array
        // char         object
        // boolean

        // 2 steaps to create a variable
        // -----------------------------
        // 1. declaration
        // 2. assignment

        int age = 17;

        System.out.println(age); // output = 17

        double pie = 3.14;

        System.out.println(pie); // output = 3.14

        int year = 2026;

        System.out.println("the year is " + year); // output = the year is 2026

        char grade = 'A'; // chars are enclosed between single quotes and string is double quotes

        System.out.println("your grade is " + grade); // output = your grade is A
    
        // Camel case = if there are two words like "is cat" we will type like isCat first letter of first word is small and first letter of second word is big

        boolean isCat = true;

        System.out.println(isCat); // output = true

        // we can also use boolean for conditionals like : 

        // if(isCat == true) or type if(isCat) both means true

        if(isCat){
            System.out.println("yes he is a cat");
        }
        else{
            System.out.println("he is not a cat");
        }

        // Output = yes he is a cat

        String name = "Yash";

        System.out.println(name); // output = Yash
        System.out.println("Hello " + name); // output = Hello Yash

    }
}
