package easy;

import java.util.Scanner;
import javax.print.attribute.standard.NumberUpSupported;

public class PrefixSum {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    int sMax = Integer.MIN_VALUE;
    int sMin = Integer.MAX_VALUE;
    int currSum;
    int start, end;

    int prefix[] = new int[n];

    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr.length; j++) {
        currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

        if (currSum > sMax) {
          sMax = currSum;
        }
      }
    }

    System.out.println("Max sum: " + sMax);
  }
}
