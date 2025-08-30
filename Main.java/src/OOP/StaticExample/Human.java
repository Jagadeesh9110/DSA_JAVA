package OOP.StaticExample;

public class Human {
    String name;
    int age ;
    boolean job;
   static long population;
   static void message(){
       System.out.println("Hello everyone ");

//       System.out.println(this.age);// here it will give an error because this keyword represents the object , and static does not depend on the objects, so it will give you error
   }

    public Human(String name,int age,boolean job){
        this.name=name;
        this.age=age;
        this.job=job;
        Human.population+=1;// this population is same for all
    }


}
