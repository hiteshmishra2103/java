              package recursion;

              public class p1 {

                public static void main(String[] args) {
                  int arr[] = { 1, 2, 3, 4, 5, 6 };
                  System.out.println(BinarySearch(arr, 0, 5, 4));
                }

                static int BinarySearch(int arr[], int s, int e, int target) {
                  int m = s + (e - s) / 2;
                  if (target == arr[m]) {
                    return m;
                  } else if (target < arr[m]) {
                    return BinarySearch(arr, s, m - 1, target);
                  }
                  else if (target > arr[m]) {
                    return BinarySearch(arr, m + 1, e, target);
                  }
                  return -1;
                }
              }
