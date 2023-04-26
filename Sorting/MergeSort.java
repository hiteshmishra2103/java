import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

  static void merge(int arr[], int low, int mid, int high) {
    int i = low, j = mid + 1, k = 0;
    int B[] = new int[high - low + 1];
    while (i <= mid && j <= high) {
      if (arr[i] <= arr[j]) { 
        B[k++] = arr[i++];
      } else {
        B[k++] = arr[j++];
      }
    }
    for (; i <= mid; i++) {
      B[k++] = arr[i];
    }

    for (; j <= high; j++) {
      B[k++] = arr[j];
    }

    for (int x = low, y = 0; x <= high; x++, y++) {
      arr[x] = B[y];
    }
  }

  static void MergeSort(int arr[], int low, int high) {
    if (low < high) {
      int mid = (low + high) / 2;
      MergeSort(arr, low, mid);
      MergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the no. of elements in array: ");
    int n = in.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    MergeSort(arr, 0, arr.length - 1);

    System.out.println(Arrays.toString(arr));
  }
}
