package oops.interfaces;

public class Car implements Engine, Brake, Media {
    public void brake() {
        System.out.println("I brake like a normal car.");
    }

    public void start() {
        System.out.println("I start like  normal car");
    }

    public void stop() {
        System.out.println("I stop like  normal car");
    }

    public void acc() {
        System.out.println("I accelerate like  normal car");

    }
}
