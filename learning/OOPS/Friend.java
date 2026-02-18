package learning.OOPS;

public class Friend {
    String name; // per object
    static int numOfFriends; // shared


    Friend(String name){
        this.name = name;
        numOfFriends ++;
    }
    static void showNumberOfFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
