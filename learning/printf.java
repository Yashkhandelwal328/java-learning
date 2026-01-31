package learning;
public class printf {
    public static void main(String[] args) {
        
        // printf() = is a meanthod used to format output 

        // %[flags][width][.precision][specifier-charecter]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n",name); // printf by default doesnt create new line
        System.out.printf("Your name starts with a %c\n",firstLetter);
        System.out.printf("Your age is %d years old\n",age); // d for integer
        System.out.printf("Your height is %f cms tall\n",height); // double is f
        System.out.printf("is he employed %b\n",isEmployed);
        
        System.out.printf("%s is %d years old and %f cms tall\n",name,age,height);
        
        
        // Using .Presions is like .1f to display 1 floating point value
        System.out.printf("Your height is %.1f cms tall\n",height); // double is f

        // Now using Charecter specifiers
        double price1 = 3657445747.8787;
        double price2 = 7843687999.6723;
        double price3 = -9549587589.7459;


        // + = output a plus for +ve numbers
        // , = comma grouping separator
        // ( = -ve numbers are enclosed in ()
        // space = display a minus if negetice,space if positive

        System.out.printf("%+f\n", price1);
        System.out.printf("%+f\n", price2);
        System.out.printf("%+f\n", price3);
        
        System.out.printf("%,f\n", price1);
        System.out.printf("%,f\n", price2);
        System.out.printf("%,f\n", price3); // after every 3 numbers comma like thousands hundread thousand million ...
        
        System.out.printf("%(f\n", price1);
        System.out.printf("%(f\n", price2);
        System.out.printf("%(f\n", price3); // (9549587589.745900) 
        
        System.out.printf("% f\n", price1);
        System.out.printf("% f\n", price2);
        System.out.printf("% f\n", price3);
    
        // 0 = zero padding
        // number = right justified padding 
        // negetive number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        
        System.out.printf("%04d\n", id1); // 0001
        System.out.printf("%04d\n", id2); // 0023
        System.out.printf("%04d\n", id3); // 0456
        System.out.printf("%04d\n", id4); // 7890
        
        System.out.printf("%4d\n", id1); //    1
        System.out.printf("%4d\n", id2); //   23
        System.out.printf("%4d\n", id3); //  456
        System.out.printf("%4d\n", id4); // 7890
        
        System.out.printf("%-4d", id1); 
        System.out.printf("%-4d", id2); 
        System.out.printf("%-4d", id3); 
        System.out.printf("%-4d", id4); 
        // Output = 1   23  456 7890
    }
}
