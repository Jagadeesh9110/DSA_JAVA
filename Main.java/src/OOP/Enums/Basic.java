package OOP.Enums;

public class Basic {
    enum Week implements A{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday // these are the enum constants
        ;
        // by default these are public and static and final
        // since final , you can not create child enums
        // type of these constants is week


        Week() {
            System.out.println("Constructor is created "+this); // this keyword prints the names of the constants
        }// this is not public (or protected) , only private or default

        @Override
        public void Hello() {
            System.out.println("Hello everyone");
        }
        // Why? because, we don't want to create new objects ,this is not the enum concept

        //internally: public static final Week Monday=new Week();
// enums can implement interfaces as many as they  want

    }

    public static void main(String[] args) {
        Week week;

        // when you load(or )  access the one constant in the enum ,it will automatically call the constructor for every enum constants
     week=Week.Monday;
     week.Hello();
        System.out.println(Week.valueOf("Monday"));

//        for(Week day:week.values()){
//            System.out.println(day);
//        }// it will print all the enum constants here


        System.out.println(week.ordinal());// here is ordinal is position of the enum of the declaration here 0


        // In the enums no abstract methods are not aviable every method should have the body
    }

}
