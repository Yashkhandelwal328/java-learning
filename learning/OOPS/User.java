package learning.OOPS;

public class User {
    String username;
    String email;
    int age;
    
    User(){
        this.username = "Anon"; // Default
        this.email = "Not provided"; // Default
        this.age = 0; // Default
    }
    User(String username){
        this.username = username;
        this.email = "Not provided"; // Default
        this.age = 0; // Default
    }
    User(String username,int age){
        this.username = username;
        this.email = "Not Provided"; // Default
        this.age = age; 
    }
    User(String username,String email){
        this.username = username;
        this.email = email; 
        this.age = 0; // Default
    }
    User(String username,String email ,int age){
        this.username = username;
        this.email = email; 
        this.age = age; 
    }
    void displayInfo(){
        System.out.println(username);
        System.out.println(email);
        System.out.println(age);
    }
}
