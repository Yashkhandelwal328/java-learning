package learning.OOPS;

public class constructor {
    public static void main(String[] args) {
        
        // constructor = A special meathod to initialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values
        
        Student student1 = new Student("cato", 1,3, 9, true);
        Student student2 = new Student("yash", 2,18, 9.5, true);
        Student student3 = new Student("hottypotty", 3,39, 9, false);
        
        System.out.println(student1.name);
        System.out.println(student2.age);
        System.out.println(student3.gpa);
        student1.displayinfo();
        student2.displayinfo();
        student3.displayinfo();
        
        
    }
}
