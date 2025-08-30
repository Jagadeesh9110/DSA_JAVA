package OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human A=new Human("Jagadeesh",19,false);
        Human B=new Human("Random name",25,true);

        // here we can use this class Human which is another file in the same packages so we need not to import again

        // there will be some properties like which are common to all humans that type of properties are not related to the objects
        // they are independent of objects
        // that type of variables are called as static variables means fixed for all there is no change for different object
        System.out.println(Human.population);
        System.out.println(Human.population);// it will print both same number 2 becuase there are two members
// you can write like also A.population this will also work  better to write like as is Human it is a convention to write like this

// meaning of the static is when a member is declared as static then it will accessible to everyone before any object is created without referencing to any object
    }
    // inside a static method you cannot use the non-static method
// a static data can access only static data not non-static data

  static void message(){
     //   greeting();// you can not use this it requires a object(or) instance
      // but this function in independent of instance it depends on classes

      // you can access the non-static stuff by referencing to the object
      Main obj=new Main();
      obj.greeting();// it will not give any error because we are referencing to a object

    }

    void greeting(){
        System.out.println(" Hello everyone ");
        message();// but we can hava a static member inside a non-static member
    }
}
// inside a static method you cannot use the non-static method
// a static data can access only static data not non-static data