package easy.MaxSubarraySum.java;

import javax.security.auth.login.FailedLoginException;

public class KadaneAlgo {

  public static void main(String[] args) {
    int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

    kadane(numbers);
  }

  public static void kadane(int numbers[]) {
    int ms = Integer.MIN_VALUE;
    int cs = 0;

    //check if every element in the array is negative

    boolean flag = true;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > 0) {
        flag = false;
        break;
      }
    }

    if (flag) {
      int sMax = numbers[0];
      for (int i = 0; i < numbers.length; i++) {
        sMax = Math.max(sMax, numbers[i]);
      }
      System.out.println(sMax);
    } else {
      for (int i = 0; i < numbers.length; i++) {
        cs = cs + numbers[i];
        if (cs < 0) {
          cs = 0;
        }

        ms = Math.max(cs, ms);
      }
      System.out.println("Our max subarray sum is: " + ms);
    }
  }
}
