package learning.OOPS;

public class arrayOfObjects {
    public static void main(String[] args) {
        Car1 car1 = new Car1("Mustang", "Red");
        Car1 car2 = new Car1("Corvette", "Blue");
        Car1 car3 = new Car1("Charger", "Yellow");

        // Car[] cars = new Car[3];
        Car1[] cars = {car1,car2,car3};

        // for(int i = 0; i < cars.length; i++){
        //     cars[i].drive();
        // }

        for(Car1 car : cars){ // this is called enhanced for loop
            car.drive();
        }

        // we can als0 do it like :
        // Car1[] cars = {
        //     new Car("Mustang","Red");
        //     new Car("Corvette","Blue");
        //     new Car("Charger","Yellow");
        // }
    }
}
