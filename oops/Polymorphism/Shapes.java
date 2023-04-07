package oops.Polymorphism;

public class Shapes {

    //static properties can be overridden but static methods can't be overridden
    static int a = 1;

    // late
    void area() {
        System.out.println("I am in shapes!");
    }

    // Early binding using final keyword
    // final void area(){
    // System.out.println("I am in shapes!");
    // }
}
