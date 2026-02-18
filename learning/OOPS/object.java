package learning.OOPS;

public class object {
    
    // Class = works as a blueprint to create objects.
    // Object = An entity that holds data (attributes) some like Sting name , int age , double height etc
    //          and can perform actions (meathods) some like eat() sleep() etc
    //          It is a reference data type
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.make); // Ford
        // car.isRunning = true;
        car.start(); // You Start the engine
        System.out.println(car.isRunning); // true
        car.stop(); // You stoped the engine
        System.out.println(car.isRunning); // false
    }
}

