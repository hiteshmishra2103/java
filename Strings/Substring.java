package Strings;

public class Substring {

  public static String substring(String str, int si, int ei) {
    String substr = "";

    //time complexity of below code is O(n^2);
    //because the copy operation takes O(n) and the outer loop takes O(n) times
    //When you are adding n characters to the string, you are having complexity of n^2
    //To solve this performance issue of Strings we use StringBuilder in java
    for (int i = si; i < ei; i++) {
      substr += str.charAt(i);
    }
    return substr;
  }

  public static void main(String[] args) {
    String str = "HelloWorld";
    System.out.println(substring(str, 0, 4));
  }
}
