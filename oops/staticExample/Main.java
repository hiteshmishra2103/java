package oops.staticExample;

import oops.staticExample.Human;

public class Main {
    public static void main(String[] args) {
        Human Kunal = new Human(23, "Kunal", 23, false);
        Human Rahul = new Human(32, "Rahul", 35, false);

        System.out.println(Human.population);
    }

    // this is not dependent on objects
    // static void fun() {
    //     greeting();
    // }

    // non-static methods and properties are dependent on objects
    void greeting() {
        System.out.println("Hey there!");
    }
}
