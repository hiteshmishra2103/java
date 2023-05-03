package easy.Arrays;

public class Evendigit {

  public static void main(String[] args) {
    int arr[] = { 1, 3, 23234, 12, 211, 12 };

    System.out.println(findNumbers(arr));
  }

  static int findNumbers(int[] nums) {
    int count;
    int digits = 0;

    for (int i = 0; i < nums.length; i++) {
      count = 0;

      if (nums[i] < 0) {
        nums[i] = nums[i] * -1;
      }
      while (nums[i] > 0) {
        count++;
        nums[i] = nums[i] / 10;
      }
      if (count % 2 == 0) {
        digits++;
      }
    }

    return digits;
  }
}
