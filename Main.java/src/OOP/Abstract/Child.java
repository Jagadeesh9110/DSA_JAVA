package OOP.Abstract;

public class Child extends Parent{
   Child(){
       super();
   }
    public Child(int age) {
        super(age);
    }

    @Override
    void career(String Name) {
        System.out.println("My career is "+Name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(" I love "+name+ " and him/her age is "+age);
    }
}// all the child classes has to be overridden the all the abstract methods from its parent class
