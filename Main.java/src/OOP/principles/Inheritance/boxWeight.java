package OOP.principles.Inheritance;

public class boxWeight extends box {
   double weight;
   public boxWeight(){
       this.weight=-1;
   }

   // parameterized constructor
   boxWeight(double weight,double h,double l,double w ){
      super(h,l,w);// here it will call the base class constructor of containing the three variables
       // used to initialize the variables present in the parent class
       this.weight=weight;// we are accessing the variables of its base class

      // super(l,h,w);// we cannot like this because,
       // child class cares about  what it's parent class contains
       // but parent class cannot care about what it's child class contains first it will initialize to it's variables
   }
  boxWeight(boxWeight other){
       super(other);// it will point to  parent class copy constructor
       this.weight=other.weight;
  }
   void display(){
       System.out.println(this+" has sides "+this.h+" ,"+this.l+" and "+this.w + " and weight is "+ this.weight);
   }


}
