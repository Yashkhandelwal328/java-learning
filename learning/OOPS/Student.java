package learning.OOPS;

public class Student {
    // Attributes
    String name;
    int rollNo;
    int age;
    double gpa;
    boolean isEnrolled;
    

    // constructor
    Student(String name ,int rollNo, int age , double gpa , boolean isEnrolled){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
    // meathod
    void displayinfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + gpa);
        if(isEnrolled){
            System.out.println(name + " is Enrolled");
        }
        else{
            System.out.println(name + " is not Enrolled");
        }
    }
    
}
