package easy;

import java.util.Scanner;

public class Binarytodec {

  static int bintodec(int n) {
    int rem;
    int count = 0;
    int dec = 0;
    while (n > 0) {
      rem = n % 10;
      dec += rem * Math.pow(2, count);
      count++;
      n = n / 10;
    }
    return dec;
  }

  static int dectobin(int n) {
    int rem;
    int bin = 0;
    int i = 1;
    while (n > 0) {
      rem = n % 2;
      bin += rem * i;
      i *= 10;
      n /= 2;
    }
    return bin;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to convert to dec: ");
    int n = in.nextInt();

    System.out.println(bintodec(n));

    System.out.println("Enter the number to convert to bin: ");
    int m = in.nextInt();
    System.out.println(dectobin(m));
  }
}
