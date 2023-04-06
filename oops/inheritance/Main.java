package oops.inheritance;

import oops.inheritance.Box;

public class Main {
    public static void main() {
        // Box box = new Box(3, 4, 5);
        // Box box2 = new Box(box);
        // System.out.println(box.l + " " + box.h + " " + box.w);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2, 3, 4, 4);
        // System.out.println(box3.h + " " + box3.weight);

        // It is actually the type of reference variable not the type of the object that
        // determines what members can be accessed

        Box box5 = new BoxWeight(1, 3, 4, 5);
        System.out.println(box5.l);

        // there are many variables in both parent and child classes you are given
        // access to variables that are in the ref type i.e Boxweight hence, you should
        // have access to weight variable this also mean that the ones you are trying
        // to access should be initialised, but here, when the object itself is of type
        // parent class, how will you call the constructor of the child class
        // that is why this error👇

        // BoxWeight box6 = new Box(2, 3, 4);
        // System.out.println(box6.weight);
    }
}
