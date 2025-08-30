package OOP.Introduction;


public class WrapperClasses {
    public static void main(String[] args) {
        Integer num=45;
        // here it is like object new Integer(45)
        // there will be methods in this wrapper classes becuase in any classes there will be properties and methods
        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println(a+" "+b);// it will print same as 10,20 and no swaping done by final keyword
        // final keyword will prevent the content modified
        // example is
        final int bonus=2;
        // bonus=3;// it will give error
        // and also one important point is if we declare final variable it should be intialized

        // but final student jagadeesh=new student();
        // jagadeesh.name="Manyam Jagadeeswar Reddy";
        // here we change the value of the name of jagadeesh object although you are using the final keyword
        // because final keyword cannot the value for primitive data types not for the objects
        // for the objects you cannot write like jagadeesh=other object when you use final keyword

        // example
        final A Jagadeesh=new A("Jagadeeswar");
        Jagadeesh.name="Other name ";// this is correct

        // when non primitive is final you cannot re-assign it
        // Jagadeesh=new A("New Object");// this not correct when we use final keyword

        A obj;
        for(int i=0;i<1000000000;i++){//  for more not of objects ,it will call the garbage collector which automatically destroyes the object
            obj= new A("Random name ");
        }// we all know that for one reference variable there is one object pointing
        // here we are using the same reference variable
    }
    public static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=a;
    }// although we are passing the objects which is pass by reference by value not the pass by reference it will not reflect in the main function fue to final keyword in the inbuilt wrapper class


}
class A{
    String name;
    A(String n){
        System.out.println("Object is created");
        this.name=n;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has been destroyed ");
    }// it will print when object has been destroyed automatically
}// in c++ there is destructors to destroy the object manually but in java there is not like that it will automatically destroyed the object when it's scope is out of it
// but in java we can perform any actions like above when object is destroyed


// in java there is no pass by reference by concept there is only pass by value
// we can pass the reference by value like objects
// is pass the objects into another function from one function then changes made will be reflect to original function
// but there is exception if we pass the wrapper classes which are objects like it will not reflect to original function
// because in the Wrapper classes Like Integer.Double,character there is one keyword final due to this keyword it will not reflect
