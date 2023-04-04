package oops;

public class wrapperExample {
    public static void main(String[] args) {
        // int a = 10;

        // Integer num = 34;

        // final int ab = 2323;

        // when a non-primitive is final you can't reassign it
        Student hitesh = new Student();
        System.out.println(hitesh);
    }
}

class Student {
    int roll = 232;
    String Name = "Hitesh";
    int cl = 23;

    // Whenever any object of class Student is freed from the memory then this
    // finalize method will
    // be called

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Object is destroyed!");
    }
}
