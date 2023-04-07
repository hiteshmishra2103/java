package oops.Access;

public class A {
    int num;
    private String name;
    int[] arr;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

}
