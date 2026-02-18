package learning.OOPS;
// This one is for array of objects
public class Car1 {
    String model;
    String color;

    Car1(String model, String color){
        this.model = model;
        this.color = color;
    }

    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }


}
