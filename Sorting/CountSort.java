import java.util.Arrays;
import java.util.Scanner;

public class CountSort {

  static int findMax(int[] arr) {
    int mx = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > mx) {
        mx = arr[i];
      }
    }
    return mx;
  }

  static void basicCountSort(int[] arr) {
    //to check if the array is null and if it is then return

    if (arr == null || arr.length == 0) return;

    //finding the maximum element from array
    int max = findMax(arr);

    //creating the count array with the size of max
    int[] count = new int[max + 1];

    //make frequency array
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    int k = 0;

    for (int i = 0; i < count.length; i++) {
      for (int j = 0; j < count[i]; j++) {
        arr[k++] = i;
      }
    }
  }

  static void countSort(int arr[]) {
    //to check if the array is null and if it is then return
    if (arr == null || arr.length == 0) return;
    int n = arr.length;
    int[] output = new int[n];
    int max = findMax(arr);

    int[] count = new int[max + 1];

    //make frequency array
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    //make prefix sum of count array
    for (int i = 1; i < count.length; i++) {
      count[i] += count[i - 1];
    }

    //Find the index of each element in the original array and put it in output array

    for (int i = n - 1; i >= 0; i--) {
      int idx = count[arr[i]] - 1;
      output[idx] = arr[i];
      count[arr[i]]--;
    }

    //copy all the elements of output array to arr
    for (int i = 0; i < n; i++) {
      arr[i] = output[i];
    }
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter the array size: ");
      int n = in.nextInt();

      int arr[] = new int[n];

      System.out.println("Enter the array: ");
      for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextInt();
      }

      countSort(arr);
      System.out.println("Sorted array: " + Arrays.toString(arr));
    }
  }
}
