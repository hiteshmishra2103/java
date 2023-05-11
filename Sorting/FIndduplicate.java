public class FIndduplicate {

  public int findDuplicate(int[] nums) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] != i + 1) {
        int correct = arr[i] - 1;
        if (arr[i] != arr[correct]) {
          swap(arr, i, correct);
        } else {
          return arr[i];
        }
      }
      //if element is at correct position, then increment the pointer
      else {
        i++;
      }
    }
    return -1;
  }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
