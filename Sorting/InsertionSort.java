import java.util.Arrays;

public class InsertionSort {

  static void swap(int arr[], int f, int s) {
    int temp = arr[f];
    arr[f] = arr[s];
    arr[s] = temp;
  }

  static void insertion(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 12121, 32, -1, 3, 4, 5 };
    insertion(arr);
    //print
    System.out.println(Arrays.toString(arr));
  }
}
