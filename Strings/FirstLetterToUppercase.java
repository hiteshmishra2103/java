package Strings;

import java.util.Scanner;

public class FirstLetterToUppercase {

  public static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();package Strings;

public class StringBuilderInJava {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");
    for (char ch = 'a'; ch <= 'z'; ch++) {
      sb.append(ch);
    }

    //abcdefhijklmnopqrstuvwxyz
    System.out.println(sb);
  }
}

  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in());
    String str = in.nextLine();
  }
}
