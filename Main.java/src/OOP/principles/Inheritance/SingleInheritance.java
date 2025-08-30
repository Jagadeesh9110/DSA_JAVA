package OOP.principles.Inheritance;


class tata extends car{

 String Brand;
 boolean electrical;
 tata(){           // default constructor
     super();
     this.Brand=null;
     this.electrical=false;
 }
 tata(String name,int wheels,int steering,String Brand,boolean electrical){  // parameterized constructor
     super(name,wheels,steering);// here we inherit the properties and methods of its base class
     this.Brand=Brand;
     this.electrical=electrical;
 }

 void display1(){
     System.out.println("we have a car of company "+this.Brand+ " have "+ this.wheels+ " wheels ,"+ this.steering+" steering are present " );
     if (this.electrical == true) {
         System.out.println(" the given " + this.Brand + " car is Electrical");
     } else {
         System.out.println(" the given " + this.Brand + " car is Not electrical");

     }
 }

}


public class SingleInheritance {
    public static void main(String[] args) {
        tata car1=new tata();
        car1.display1();

        tata car2=new tata("car",4,1,"tata",true);
        car2.display1();
// here it is an example of the single inheritance

    }
}
// we have discussed the box and boxWeight which is also an example for single inheritance