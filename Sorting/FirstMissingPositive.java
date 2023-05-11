//https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {

  class Solution {

    public int firstMissingPositive(int[] arr) {
      int i = 0;
      while (i < arr.length) {
        int correct = arr[i] - 1;
        if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
          swap(arr, i, correct);
        } else {
          i++;
        }
      }

      // Search for the first missing number
      for (int index = 0; index < arr.length; index++) {
        if (arr[index] != index + 1) {
          return index + 1;
        }
      }

      // If no missing number found, return the next number in sequence
      return arr.length + 1;
    }

    public void swap(int[] arr, int first, int second) {
      int temp = arr[first];
      arr[first] = arr[second];
      arr[second] = temp;
    }
  }
}
