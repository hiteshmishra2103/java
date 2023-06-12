import easy.CheckPrime;
import java.util.Scanner;

public class LowercaseVowels {

  public static int check(String sen) {
    int count = 0;
    for (int i = 0; i < sen.length(); i++) {
      if (
        sen.charAt(i) == 'a' ||
        sen.charAt(i) == 'e' ||
        sen.charAt(i) == 'i' ||
        sen.charAt(i) == 'i' ||
        sen.charAt(i) == 'o' ||
        sen.charAt(i) == 'u'
      ) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    System.out.println(check(str));
  }
}
