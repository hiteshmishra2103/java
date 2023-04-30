package easy;

import java.util.*;

public class CheckPrime {

  static int isPrime(int n) {
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return 0;
      }
    }
    return 1;
  }

  static void primeBetween(int n, int m) {
    int flag;
    for (int i = n; i <= m; i++) {
      flag = isPrime(i);
      if (flag == 1) {
        System.out.println(i);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(
      "Enter the two numbers where you want to find the prime numbers in between: "
    );

    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int m = in.nextInt();

    primeBetween(n, m);
  }
}
