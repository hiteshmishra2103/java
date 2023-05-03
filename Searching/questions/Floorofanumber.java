package Searching.questions;

public class Floorofanumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }

    System.out.println("Enter the number you want to find floor for: ");
    int num = in.nextInt();

    System.out.println(arr[floor(arr, num)]);
  }

  static int floor(int arr[], int target) {
    int start = 0, end = arr.length - 1, mid;
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
    }

    return end;
  }
}
