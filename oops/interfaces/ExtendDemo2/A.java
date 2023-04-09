package oops.interfaces.ExtendDemo2;

public interface A {
    // static method in interfaces should always have a body

    static void greeting() {
        System.out.println("This is static method of interface A");
    }

    default void fun() {
        System.out.println("I am in interface A");
    }
}
