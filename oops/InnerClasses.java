package oops;

import java.nio.channels.Pipe.SourceChannel;

public class InnerClasses {
    static class Test {
        static String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main() {
        Test a = new Test("kunal");
        Test b = new Test("Hitesh");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
