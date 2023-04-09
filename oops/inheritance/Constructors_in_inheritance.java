package oops.inheritance;

class Base1 {
    public int x;

    Base1() {
        System.out.println("I am base class constructor!");
    }

    Base1(int a) {
        System.out.println("I am base class overloaded constructor with value of a as: " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1 {
    public int y;

    Derived1() {
        super(12);
        System.out.println("I am derived constructor!");
    }

    Derived1(int x, int y) {
        super(12);
        System.out.println("I am overloaded derived constructor with value of a as: " + y);
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = y;
    }

}

class childOfDerived extends Derived1 {
    childOfDerived() {
        System.out.println("I am a child of derived constructor!");
    }

    childOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am overloaded constructor of child class of derived with value of z as: " + z);
    }
}

public class Constructors_in_inheritance {
    public static void main(String[] args) {
        // Derived1 d = new Derived1();
        childOfDerived cd = new childOfDerived(12, 2, 3);
    }
}