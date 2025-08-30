package OOP.Introduction;

import static OOP.packages.Greeting.greeting;

// here we are importing the packages folder in this introduction folder to use the methods which are in the packages folder
/// here it will create the class for every student of basic details
class student{
    int rollNo;
    String name;
    float marks;
    student(int roll,String s,int n) {
        this.rollNo = roll;
        this.name = s;
        this.marks = n;
    }
    student(){
        // herw we are calling the costructor from another constructor

        this(33,"M jagadeeswar Reddy",85);
    }
    void display(){
        System.out.println(" name of the student is : "+this.name);
        System.out.println("Roll no of the student : "+this.rollNo);
        System.out.println(" Marks of the student : "+this.marks);
    }

}

public class Main {
    public static void main(String[] args) {
        student jagadeesh1=new student(33,"M jagadeeswar Reddy",80);
        student jagadeesh2=new student();
        jagadeesh1.display();
        jagadeesh2.display();
        greeting();
    }
}
// In java primitive data types are not implemented like objects
// new keyword automatically in java it allocates memory for object run time
// it will create memory for reference variables at compile time


// Packages are like folders here in this OOP is main folder insides this OOP folder there is packages, introduction folders inside this there wil be classes
