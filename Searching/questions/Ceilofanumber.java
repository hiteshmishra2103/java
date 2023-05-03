package Searching.questions;

import java.util.Scanner;

//sorted array use binary search
public class Ceilofanumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println("Enter the number you want to find ceil for: ");
    int num = in.nextInt();

    System.out.println(arr[ceil(arr, num)]);
  }

  static int ceil(int arr[], int target) {
    int start = 0, end = arr.length - 1, mid;
    int c = -1;
    while (start <= end) {
      mid = (start + end) / 2;
      if (arr[mid] == target) {
        c = mid;
        break;
      }
      if (arr[mid] > target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      if (start == end) {
        c = start;
        break;
      }
    }

    return c;
  }
}
