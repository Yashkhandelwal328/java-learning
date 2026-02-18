package learning.OOPS;

public class Car {
    // Atributes :
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 987576;
    boolean isRunning = false;
    // meathods :
    void start(){
        System.out.println("You Start the engine");
        isRunning = true;
    }
    void stop(){
        System.out.println("You stoped the engine");
        isRunning = false;
    }
}
