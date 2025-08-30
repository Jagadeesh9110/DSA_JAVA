package OOP.principles.Inheritance;


class mahendhra extends car {
    String brand;
    boolean electrical;

    mahendhra() {
        super();
    }

    mahendhra(String name, int wheels, int steering, String brand, boolean electrical) {
        super(name, wheels, steering);
        this.brand = brand;
        this.electrical = electrical;
    }

    void display2() {
        System.out.println("we have a car of company " + this.brand + "  of have " + this.wheels + " wheels ," + this.steering + " steering are present");
        if (this.electrical == true) {
            System.out.println(" the given " + this.brand + " car is Electrical");
        } else {
            System.out.println(" the given " + this.brand + " car is Not electrical");

        }
    }
}// this is hierarchical inheritance we are deriving two classes from a one base class
public class HierarchicalInheritance {
    public static void main(String[] args) {
      tata car1=new tata("car",4,1,"tata",true);

      mahendhra car2=new mahendhra("car",4,1," mahendhra ",true);
      car2.display2();

      // here we are inheriting the properties and methods from the base class car to its derived classes ( tata,mahendhra)
        // which is heirarchical Inheritance(two calsses are derived from the same base class)

        // similarly to the single inheritance all the rules are apply to the hierarchical Inheritance

    }
}

// In java there is not multiple inheritance which will a derived class from the two base classes if there are similar properties
// in the base classes then derived classes will confuse which property need to select
// we will have a doubt there might be a possibility that no properties matches , yes that will true we will Come to know this topic by using the interfaces in the abstract classes

// Hybrid inheritance(Combination of single and multiple inheritance) since, there is no hybrid inheritance in java
// which we will do it in the abstract classes(interfaces concept)