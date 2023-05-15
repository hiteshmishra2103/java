package Strings;

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
