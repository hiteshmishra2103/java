import java.util.Scanner;

public class Butterfly {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i, j;

    //first half
    for (i = 0; i < n / 2; i++) {
      for (j = 0; j <= i; j++) {
        System.out.print("*");
      }
      for (int k = (n / 2 - i) * 2; k > 0; k--) {
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (; i <= n / 2 + 1; i++) {
      for (j = 0; j <= (n / 2) * 2; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //Second half

    for (int k = 1; k <= (n - (n / 2)) - 1; k++) {
      for (int k2 = 1; k2 <= (n - (n / 2)) - k; k2++) {
        System.out.print("*");
      }

      for (int k2 = 1; k2 <= k * 2; k2++) {
        System.out.print(" ");
      }

      for (int k2 = 1; k2 <= (n - (n / 2)) - k; k2++) {
        System.out.print("*");
      }
      System.out.println();
    }
    //Second Half

    // int l;
    // for (l = 0; l < n / 2; l++) {
    //   for (int k = (n / 2 - l) * 2; k > 0; k--) {
    //     System.out.print(" ");
    //   }
    //   for (int k = 0; k <= l; k++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    // for (; l <= n; l++) {
    //   for (int k = 0; k < n / 2; k++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // for (int k = n / 2; k > 0; k--) {
    //   for (int m = 0; m < (n - k) * 2; m++) {
    //     System.out.print(" ");
    //   }
    //   for (int m = 0; m < k; m++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // for (int k = 0; k < n / 2; k++) {
    //   System.out.print("*");
    // }
  }
}
