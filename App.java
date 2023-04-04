import java.util.Scanner;

public class App {
    public static void main(Stringj[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number upto you want to print: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

    }

}
