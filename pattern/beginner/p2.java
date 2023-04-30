package pattern.beginner;

import java.util.Scanner;

public class p2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    char ch = 'A';
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }
}
