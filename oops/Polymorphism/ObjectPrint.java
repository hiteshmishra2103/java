package oops.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(70);

        System.out.println(obj);
    }

}
