package OOP.StaticExample;

import java.util.Arrays;

public class Innerclasses {
   static  class test{
        String name;
          public test(String name) {
              this.name = name;
          }

       @Override
       public String toString() {
          return this.name;
       }
   }// by putting the static keyword it will independent of instances so you can use it


    public static void main(String[] args) {
        test A=new test("jagadeesh");
        test B=new test("random name");
        // here it will give  error because  the class which we are using is dependent on the other class ,
        // in same way if that class is separately is in the outside then it will not give error
        // to get rid of this error we can use static keyword in front of that class we are using
        System.out.println(Arrays.toString(new int[]{1,2,3}));;

        System.out.println(A.toString());// if there ios no in-built string method it will take the default toString print method
        // if there is method in the class then it will print the whatever present in the string method
        System.out.println(A.name);
        System.out.println(B.name);
        // in this we will have a doubt like static classes are not dependent on objects but here it print jagadeesh , random name
        // in which we need to consider where the static class is present , it means here static test class is independent of objects of its parent class
        //but we are using the static class of its name that's why it is running

        // class level static variables , methods and all stuff will be reolved at compile time
        // we all know that objects are created at run time
    }
}
