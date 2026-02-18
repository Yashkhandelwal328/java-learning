package learning.OOPS;

public class overloadConstructor {
    public static void main(String[] args) {
        
        // overload constructor = Allow a class to have multiple constructors
        //                        with different parameter lists,
        //                        Enable objects to be initialized in various ways.

        User user1 = new User("Catowow");
        User user2 = new User("gangshit","gangshit@gmail.com");
        User user3 = new User("JetpackCat",16);
        User user4 = new User("Yash","yashkhandeelwa@gmail.com",18);
        User user5 = new User();
        
        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();
        user4.displayInfo();
        user5.displayInfo();

    }
}
