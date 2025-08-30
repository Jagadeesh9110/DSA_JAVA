package OOP.principles.Inheritance;

public class main {
    public static void main(String[] args) {
        box obj1=new box();// default constructor
        box obj2=new box(2,4,5);// parameterized constructor
        box obj3=obj1;// here it is copy constructor

        obj1.display1();

        obj2.display1();

        obj3.display1();

        // let's see th inheritance properties and methods

        boxWeight obj4=new boxWeight();
        obj4.display();// it will print all the sides and weight by inheritance property
        boxWeight obj5=new boxWeight(8,2,4,6);// same as here
        obj5.display();

        box obj6=new boxWeight(8,2,3,6);
        System.out.println(obj6.w);// it will work
      //  System.out.println(obj6.weight);// it will give error because the reference variable is pointing to the object created using the boxweight
        // this means referencing variable you are pointing to the object created by its child class you can access the members only of referencing class variables not all the child class members.

        //there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. boxWeight
        // hence you should have access to weight variable
        // this also means, that the ones you are trying to access that should be intialized
        // but here , When the obj itself is of type parent class, you cannot call th constructor of child class
        // hence you can not  initialize the variables that you are accessing that's here it is giving the error
       // boxWeight obj7 =new box(2,3,4);


        boxWeight obj8=obj5;
        obj8.display();

    }
}
