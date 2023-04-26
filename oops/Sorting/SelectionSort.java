import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  static void sort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min_idx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min_idx]) {
          min_idx = j;
        }
      }
      if (min_idx != i) {
        swap(arr, i, min_idx);
      }
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the array size: ");

    int n = in.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter the array: ");

    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
