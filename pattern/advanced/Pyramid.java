import java.util.*;

public class Pyramid {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the height of pyramid: ");
    int n = in.nextInt();
    for (int i = 1; i <= n; i++) {
      //spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }

      //stars
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      //next row
      System.out.println();
    }
  }
}
