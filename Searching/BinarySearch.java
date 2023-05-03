import java.util.*;

public class BinarySearch {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of array: ");
    int n = in.nextInt();

    System.out.println("Enter the array: ");

    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println("Enter the number to search: ");
    int target = in.nextInt();
    int start = 0;
    int end = n - 1;

    while (start < end) {
      //find the middle element
      int mid = start + (end - start) / 2;
      if (target == arr[mid]) {
        //element found
        System.out.println("Element found at index: " + mid);
        return;
      } else if (target < mid) {
        end = mid - 1;
      } else {
        end = mid + 1;
      }
    }

    //element not found
    System.out.println("Element not found!");
  }
}
