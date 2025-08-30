package OOP.Interfaces;

public class ElectricalEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electrical Engine start ");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine stop");

    }

    @Override
    public void acc() {
        System.out.println("Electrical Engine accelerate");
    }
}
