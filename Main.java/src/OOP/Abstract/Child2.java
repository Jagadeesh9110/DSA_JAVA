package OOP.Abstract;

public class Child2 extends Parent {
    public Child2() {
        super();
    }

    public Child2(int age) {
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
}
