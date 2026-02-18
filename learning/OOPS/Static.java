package learning.OOPS;

public class Static {
    public static void main(String[] args) {
        
        // static = Makes a variable or meathod belong to the class
        //          rather than to any specific object.
        //          commonly used for utility meathod or shared resources.

        Friend friend1 = new Friend("meow");
        Friend friend2 = new Friend("yash");
        Friend friend3 = new Friend("meownan");

        System.out.println(friend1.name);
        // System.out.println(friend1.numOfFriends);
        // System.out.println(friend2.numOfFriends);
        // System.out.println(friend3.numOfFriends);
        System.out.println(Friend.numOfFriends); // better to do so from class itself as it belongs to class itself

        Friend.showNumberOfFriends();
        
    }
}
