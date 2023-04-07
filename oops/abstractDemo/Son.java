package oops.abstractDemo;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    void partner(String name, int age) {
        System.out.println("I love " + name + "she is " + age);
    }
}
