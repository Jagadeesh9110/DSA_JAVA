package OOP.Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new MePlayer();

    public NiceCar() {
        engine = new PowerEngine();// by default, it will assign the power Engine
    }
    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acc(){
        engine.acc();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic() {
        player.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricalEngine();
    }
}
