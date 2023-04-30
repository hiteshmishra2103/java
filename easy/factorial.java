package easy;

import java.util.Scanner;

public class factorial {

  static int fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(fact(n));

    //binomial expression
    System.out.println("Enter the value of r: ");
    int r = in.nextInt();
    System.out.println(fact(n) / (fact(r) * fact(n - r)));
  }
}
