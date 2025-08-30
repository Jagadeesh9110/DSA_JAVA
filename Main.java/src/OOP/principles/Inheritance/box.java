package OOP.principles.Inheritance;

public class box {
    double h,l,w;

    //default constructor
     public box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    // parametrized constructor
   public  box(double h,double l,double w){
         //super();// here it will not give error because every class has as a superclass
       this.h=h;
       this.l=l;
       this.w=w;
   }

 box(box old){// copy constuctor
         this.h=old.h;
         this.w=old.w;
         this.l=old.l;
 }
  public  void message(){
      System.out.println("Creating the box");
  }
  private  void display(){
      System.out.println(this+" has sides "+this.h+" ,"+this.l+" and "+this.w);
  }
 public void display1(){
         this.display();
 }

}
