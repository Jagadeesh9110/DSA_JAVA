package OOP.principles.Inheritance;

class boxPrice extends boxWeight{
    double price;

    boxPrice(){
        super();
        this.price=-1;
    }
    boxPrice(double price,double weight,double h,double l,double w ){
        super(weight,l,h,w);
        this.price=price;
    }

    boxPrice(boxPrice other){
        super(other);
        this.price=other.price;
    }


    void display(){
        System.out.println(this+" has sides "+this.l+" ,"+this.h+" and "+this.w + " and weight is "+ this.weight+" and price of : "+ this.price);
    }
}
public class mutilevelinheritance {
    public static void main(String[] args) {
        boxPrice obj1=new boxPrice();// default constructor
          obj1.display();

        boxPrice obj2=obj1;// copy constructor
         obj2.display();

        boxPrice obj3=new boxPrice(20,8,2,4,6);// parametrized constructor
        obj3.display();

        // we inherit the properties to child class and to sub-child class


    }
}
