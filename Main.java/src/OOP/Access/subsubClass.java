package OOP.Access;

public class subsubClass extends subClass{
    public subsubClass(int num, String name,int age) {
        super(num, name,age);
    }

    public static void main(String[] args) {
        subsubClass obj=new subsubClass(10,"sub sub class",20);

        System.out.println(obj.age);// here also you can access when it is protected in the same package, and it is different package also you can access it in a subclass only

        System.out.println(obj instanceof A);// true , base class is A
    }
}
