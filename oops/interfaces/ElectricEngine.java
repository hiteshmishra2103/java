package oops.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine starts!");
    }

    public void stop() {
        System.out.println("Electric engine stops!");
    }

    public void acc() {
        System.out.println("Electric engine accelerate!");
    }
}
