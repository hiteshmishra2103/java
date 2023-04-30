package pattern.advanced;

import java.util.*;

public class Triangle_01 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        // if(j%2==0){
        //     System.out.print(1);
        // }
        // else{
        //     System.out.print(0);
        // }

        if ((i + j) % 2 == 0) {
          System.out.print(1);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
