package OOP.Interfaces;

public class Main {
    public static void main(String[] args) {

        // interfaces has the abstract methods

        // abstract class can provide the implementation of the interfaces but interfaces cannot provide the implementation of abstract class

        // interfaces are implemented using the implement keyword  , abstract classes implemented using the extends keyword
        // java interfaces are default by public and by default member variables are static final
        // In interfaces there is no instance variables there is only final variables

//        Car car=new Car();
        Engine car=new Car();// it will also work we already know about this
        car.acc();
        car.start();
        car.stop();
      //  car.brake();// here you cannot access the brake method because brake method is not accessible by the reference variable Engine
        // in these interfaces , there will be no connection between the classes, and we can implement through the one (or) more interfaces


       Media player=new Car();
       player.start();// it will not show the start method of Media it will give the start method which is in the car class which is overridden
        // if we want separate then we need to change the object we need to create the new object(new car )

        // so we need to write the different claas for different functionality to overcome the problem
        NiceCar newCar=new NiceCar();

        newCar.start();
        newCar.startMusic();
        newCar.acc();
        newCar.upgradeEngine();
        newCar.start();// after upgrading it will be electrical Engine


    }
}
