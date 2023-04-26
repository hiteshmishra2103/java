package QuickSort;

import java.util.*;

public class quickSort {

  // static void randon(int arr[], int low, int high){

  // }

  static int partition(int arr[], int low, int high) {
    int pivot = arr[high]; //last element as pivot
    int i = low - 1;
    for (int j = low; j <= high; j++) {
      //if no. less than pivot found then👇
      if (arr[j] < pivot) { //increment the i and then swap arr[i] and arr[j]
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    //increment i and swap arr[i] and pivot element and return the i
    i++;
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    return i;
  }

  static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pidx = partition(arr, low, high);
      quickSort(arr, low, pidx - 1);
      quickSort(arr, pidx + 1, high);
    }
  }

  static void printsorted(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    quickSort(arr, 0, n - 1);
    printsorted(arr);
  }
}
