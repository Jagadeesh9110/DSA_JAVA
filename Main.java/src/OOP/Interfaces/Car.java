package OOP.Interfaces;

public class Car implements Brake,Engine,Media {
    @Override
    public void brake() {
        System.out.println(" I apply the brake of a engine for a normal car");
    }

    @Override
    public void start() {
        System.out.println(" I apply the start of a engine for a normal car");
    }

    @Override
    public void stop() {
        System.out.println(" I apply the stop of a engine for a normal car");
    }

    @Override
    public void acc() {
        System.out.println(" I apply the accelerator of a engine for a normal car");
    }
}
