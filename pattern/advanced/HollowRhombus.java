package pattern.advanced;

import java.util.Scanner;
import javax.swing.text.html.FormView;

public class HollowRhombus {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < n; j++) {
        if (j != 0 && j != n - 1 && i != n - 1 && i != 0) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
