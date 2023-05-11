public class BuyAndSellStocks {

  //   public static int buyAndSellStocks(int[] arr) {
  //     int buyPrice;
  //     int maxProfit = 0;
  //     int profit = 0;

  //     for (int i = 0; i < arr.length - 1; i++) {
  //       buyPrice = arr[i];
  //       for (int j = 1; j < arr.length; j++) {
  //         if (arr[i] < arr[j]) {
  //           profit = arr[j] - buyPrice;
  //         }
  //         if (profit > maxProfit) {
  //           maxProfit = profit;
  //         }
  //       }
  //     }
  //     if (maxProfit <= 0) {
  //       return -1;
  //     }
  //     return maxProfit;
  //   }

  //best approach

  public static int maxProfit(int[] arr) {
    int maxProfit = 0;
    int minSoFar = arr[0];
    for (int i = 0; i < arr.length; i++) {
      minSoFar = Math.min(minSoFar, arr[i]);
      int profit = arr[i] - minSoFar;
      maxProfit = Math.max(maxProfit, profit);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int arr[] = { 7, 1, 5, 3, 6, 4 };
    System.out.println(buyAndSellStocks(arr));
  }
}
