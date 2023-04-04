import java.util.Scanner;

public class CaseCheck {
    public static void main(Stringj[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 0 && ch >='a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if (ch >= 0 && ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case");
        } else {
            System.out.println("Not an alphabet");
        }

    }
}