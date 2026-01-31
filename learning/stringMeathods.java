package learning;
public class stringMeathods {
    public static void main(String[] args) {
        String name = "Meow Cato";

        int length = name.length(); // gives length 9 here
        System.out.println(length);
        char letter = name.charAt(0); // gives charecter at index 0 M here
        System.out.println(letter);
        int index = name.indexOf("w"); // gives first index of specified char 3 here
        System.out.println(index);
        int lastIndex = name.lastIndexOf("o"); // gives last index of specified char 8 here
        System.out.println(lastIndex);
        String upperName = name.toUpperCase();  // MEOW CATO
        System.out.println(upperName);
        String lowerName = name.toLowerCase();  // meow cato
        System.out.println(lowerName);

        name = "           Meow Cato             ";

        name = name.trim(); // trims any white space b4 and after the words here is it Meow Cato
        System.out.println(name);
        String ewName = name.replace("o", "ew"); // Meeww Catew
        System.out.println(ewName);

        System.out.println(name.isEmpty()); // false
        System.out.println(name.contains(" ")); // true
        System.out.println(name.equals(ewName)); // false
    
        // .substring() = A meathod used to extract a portion of a string
        //                .substring(start, end) start is inclusive end is exclusive

        String Gmail = "meow12367@gmail.com";
        // String username = Gmail.substring(0, 7);
        // System.out.println(username); // meow123
        
        // but what if some one had and gmail like meow1234@gmail.com the nour program will faill 
        // so we can use the .indexOf("@") to get index of @ ez
        
        String username = Gmail.substring(0, Gmail.indexOf("@"));
        System.out.println(username); // meow12367

    
    
    }
}
