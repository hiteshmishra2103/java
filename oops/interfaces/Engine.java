package oops.interfaces;

public interface Engine {
    // all methods in interfaces are abstract
    // interfaces don't have constructors
    // all data members in interfaces are final and static

    static final int price = 78_000;

    void start();

    void stop();

    void acc();
}