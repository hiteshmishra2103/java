import java.util.Arrays;
import javax.swing.text.html.parser.Element;

public class RowColMatrix {

  public static void main(String[] args) {
    int[][] arr = {
      { 10, 20, 30, 40 },
      { 15, 25, 35, 45 },
      { 28, 29, 37, 49 },
      { 33, 34, 38, 50 },
    };

    System.out.println(Arrays.toString(search(arr, 37)));
  }

  static int[] search(int[][] matrix, int target) {
    int r = 0, c = matrix.length - 1;
    while (r < matrix.length && c >= 0) {
      if (matrix[r][c] == target) {
        return new int[] { r, c };
      }

      if (matrix[r][c] < target) {
        r++;
      } else if (matrix[r][c] > target) {
        c--;
      }
    }
  }
}
