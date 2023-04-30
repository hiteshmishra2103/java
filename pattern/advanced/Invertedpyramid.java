package pattern.advanced;

import java.util.Scanner;
import javax.swing.text.StyledEditorKit;

public class Invertedpyramid {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
