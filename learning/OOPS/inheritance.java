package learning.OOPS;

public class inheritance {
    
    public static void main(String[] args) {
            
    // Inheritance = One class inherits the attributes and meathods
    //               from another class.
    //               Child <- Parent
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        // Even tho the classes of dog and cats dont have anything in em they used Animal class as parnet and inherits its meathods and attributes.
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        dog.eat();
        cat.eat();
        dog.speak();
        cat.speak();
    }
}
