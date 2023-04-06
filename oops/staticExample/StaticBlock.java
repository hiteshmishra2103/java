package oops.staticExample;

//This is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 5;
    static int b;
    static {
        System.out.println("I am in static block!");
        b = a * 5;
    }

    public static void main() {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + "" + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + "" + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + "" + StaticBlock.b);

    }
}
