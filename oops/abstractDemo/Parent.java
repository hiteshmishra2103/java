package oops.abstractDemo;

public abstract class Parent {

    int age = 12;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career(String name);

    abstract void partner(String name, int age);
}
