package OOP.Access;

public class main {
    public static void main(String[] args) {
   A obj=new A(10,"Object",20);
   // if there is any member variables have any access modifier private we can access that member variables and methods directly this is known as data hiding
        // to access that type of member variables and methods using the setters and getters method  this is encapsulation
       // int a= obj.num;
        System.out.println(obj.getNum());
        // if there is no access modifier in the members then it will be the default modifier you can access that members anywhere in the same package but not the outside the package
        String b=obj.name;
        System.out.println(b);

        System.out.println(obj.age);
    }

}
