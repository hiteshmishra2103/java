package easy.Arrays;

import java.util.Scanner;

public class SearchInStrings {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();

    System.out.println("Enter the character you want to search for: ");
    char target = in.nextLine().charAt(0);
    System.out.println(search(name, target, 2, 4));
  }

  static boolean search(String str, char target, int start, int end) {
    boolean flag = false;
    int count = 0;
    if (str.length() == 0) {
      System.out.println("String is empty!");
      return false;
    }
    for (int i = start; i < end; i++) {
      if (str.charAt(i) == target) {
        flag = true;
        count++;
      }
    }

    if (flag) {
      System.out.println("Occurence of" + target + " is: " + count);
      return true;
    }
    return false;
  }
  // for (char ch : str.toCharArray()) {
  //   if (ch == target) {
  //     count++;
  //     flag = true;
  //   }
  // }
}
