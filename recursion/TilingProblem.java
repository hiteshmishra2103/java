public class TilingProblem {

  int tiling(int n) {
    //base case
    if (n == 0 || n == 1) {
      return 1;
    }
    

    //we are taking the case of 2*1 tiles
    //kaam
    //vertical case
    int fnm1 = tiling(n - 1);

    //horizontal case
    int fnm2 = tiling(n - 2);
  }
}
