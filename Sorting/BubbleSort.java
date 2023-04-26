import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void sort(int arr[]) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
          swapped = true;
        }
      }
      if (!swapped) break;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    sort(arr);

    System.out.println(Arrays.toString(arr));
  }
}
