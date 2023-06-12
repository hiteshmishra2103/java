import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//throws is used to suppress the exception
//such that below i have suppressed the ArithmeticException

public class Main {

  public static void main(String[] args) throws ArithmeticException {
    int i, j = 1, k = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    i = 8;

    int a[] = new int[i];
    try {
      System.out.println("Enter a number: ");
      // Simulating an error by closing System.in
      System.in.close();
      String input = br.readLine();
      j = Integer.parseInt(input);
      k = i / j;
    } catch (IOException e) {
      System.out.println("Some input output error occurred: " + e.getMessage());
    } catch (ArithmeticException e) {
      System.out.println("Cannot divide by zero!");
    } catch (Exception e) {
      System.out.println("An error occurred: " + e.getMessage());
    } finally {
      System.out.println("Finally Bye!");
    }
  }
}
