package easy.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraylist {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    for (int i = 0; i < n / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[n - i - 1];
      arr[n - i - 1] = temp;
    }

    System.out.println(Arrays.toString(arr));
  }
}
