package OOP.Abstract;

public abstract class Parent {
    int age;


    public Parent(){
        this.age=-1;
    }
    public Parent(int age) {
        this.age=age;

    }
// abstract parent();// here it will error
    // You cannot create the abstract constructors because constructors should have the body but abstract methods should not have the body

   // abstract static void greeting(); // it will give the error
    // and also abstract static methods cannot be created
    // because static methods are not override ,they are independent of object

    // but you can create the static methods inside the abstract classes
    static void greeting(){
        System.out.println("Hello Everyone");
    }// because there is no objects for abstract classes and static also independent of objects

    abstract void career(String Name);   // here we are using the abstract key-word then we should use this in the abstract class only
    // abstract class should have body here
    // you should override them in its child classes
    abstract void partner(String name, int age);
}
