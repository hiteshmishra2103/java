import Searching.questions.Ceilofanumber;

public class SortedMatrix {

  public static void main(String[] args) {}

  static int[] binarySearch(
    int[] matrix,
    int row,
    int cStart,
    int cEnd,
    int target
  ) {
    while (cStart <= cEnd) {
      int mid = cStart + (cEnd - cStart) / 2;
      if (matrix[row][mid] == target) {
        return new int[] { row, mid };
      }

      if(matrix[low][mid])
    }
  }

  static int[] search(int[][] matrix, int target) {
    int rows = matrix.length;

    int cols = matrix[0].length; //be cautious if matrix is empty
    if (rows == 1) {}
  }
}
