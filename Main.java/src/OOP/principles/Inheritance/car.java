package OOP.principles.Inheritance;

class car{
    String name;
    protected int wheels;
    int steering;
    car(){        // default constructor
        this.name=null;
        this.wheels=-1;
        this.steering=-1;
    }
    car(String name ,int wheels,int steering){     // parameterized constructor
        this.name=name;
        this.wheels=wheels;
        this.steering=steering;
    }
    public void displayCar(){
        System.out.println(" name :"+this.name+" no of wheels : "+ this.wheels+" no.of steering : "+this.steering);
    }

}