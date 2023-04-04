import java.util.Scanner;

public class Switch {
    public static void main(Stringj[] args) {
        sum();
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = input.nextInt();
        System.out.println("Enter the number: ");
        int b = input.nextInt();
        System.out.println("The sum is: " + (a + b));
    }
}
