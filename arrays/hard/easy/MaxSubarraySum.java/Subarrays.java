package easy;

import java.util.Scanner;

public class Subarrays {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    int ts = 0;
    int sMax = Integer.MIN_VALUE;
    int sMin = Integer.MAX_VALUE;
    int currSum;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        currSum = 0;
        for (int k = i; k <= j; k++) {
          System.out.print(arr[k] + " "); //subarray
          currSum += arr[k];
        }
        if (currSum > sMax) {
          sMax = currSum;
        }
        if (currSum < sMin) {
          sMin = currSum;
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("Total subarrays: " + ts);
    System.out.println("Maximum sum: " + sMax);
    System.out.println("Minimum sum: " + sMin);
  }
}
