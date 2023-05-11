public class TrappingRainwater {

  public static void main(String[] args) {}

  public int trap(int[] height) {
    int n = height.length;

    //left array
    int[] left = new int[n];
    //right array
    int[] right = new int[n];

    left[0] = height[0];
    for (int i = 1; i < n; i++) {
      left[i] = Math.max(left[i - 1], height[i]);
    }

    right[n - 1] = height[n - 1];

    for (int i = n - 2; i >= 0; i--) {
      right[i] = Math.max(right[i + 1], height[i]);
    }

    int ans = 0;

    for (int i = 0; i < n; i++) {
      ans[i] += Math.min(left[i], right[i]) - a[i];
    }

    return ans;
  }
}
