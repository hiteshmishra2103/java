import java.util.Scanner;

public class Fibonacci {
    public static void main(Stringj[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n = input.nextInt();
        int first = 0, second = 1, third;

        for (int i = 1; i <= n; i++) {
            System.out.println(first);
            third = first + second;
            first = second; 
            second = third;
        }

    }
}
