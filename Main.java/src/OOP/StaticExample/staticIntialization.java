package OOP.StaticExample;

public class staticIntialization {
    static int a=5;
    static int b;

    // it will run only once ,when the first object is created i.e When the class is loaded for the first time
    static {// this is static block
        System.out.println(" iam in the static block ");
        b=a*5;// here we are using the static block to initialize the static variables;
    }

    public static void main(String[] args) {
        staticIntialization obj1=new staticIntialization();
        System.out.println(staticIntialization.a+" "+staticIntialization.b);// here it will print the a and b values

        staticIntialization.b+=5;
        System.out.println(staticIntialization.a+" "+staticIntialization.b);

        staticIntialization obj2 =new staticIntialization();// here by creating the object again it will not again call the static block which will be run only one time at first time object has been created
        System.out.println(staticIntialization.a+" "+staticIntialization.b);

    }
}
