package pattern.advanced;

import java.util.Scanner;

public class FloydTriangle {

  public static void main(String[] args) {
    int count = 0;
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        count++;
        System.out.print(count);
      }
      System.out.println();
    }
  }
}
