// https://leetcode.com/problems/find-in-mountain-array/

import Searching.OrderAgnosticBinSearch;

public class FindInMountainArray {

  public static void main(String[] args) {}

  int search(int[] arr, int target) {
    //find the peak element
    int peak = peakIndexInMountainArray(arr);
    //check in first half for the element
    int fristTry = ogbs(arr, target, 0, peak);
    if (fristTry != -1) {
      return fristTry;
    }
    //try to search in second half and return the index if element is found
    return ogbs(arr, target, peak + 1, arr.length - 1);
  }

  static int ogbs(int arr[], int target, int start, int end) {
    int start = start;
    int end = end; 

    //checking if the array is ascending or descending
    //we are comparing first and last element for checking the order, we are not comparing the first
    //and second element because is ascending or descending array it may happen that first two elements
    //are equal so it is not the right way to do.

    boolean isAsc = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + end / 2;
      if (target == arr[mid]) {
        return mid;
      }

      //if array is ascending
      if (isAsc) {
        if (start < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      //if array is descending

      else {
        if (start < arr[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
