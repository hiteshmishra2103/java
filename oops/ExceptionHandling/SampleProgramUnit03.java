class UserManualException extends Exception {

  public String getMessage() {
    string detailMessage = "This is User defined manual exception!";
    return detailMessage;
  }
}

// public class SampleProgramUnit03 {

//   public static void main(String[] args) throws UserManualException {
//     int a = 100;
//     int b = 0;

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the value of b: ");
//     int b = sc.nextInt();

//     if (b == 5) {
//       throw new UserManualException();
//     }

//     c = a / b; //Don't run when b is 5
//     System.out.println("c: " + c);
//   }
// }
//--------------------------------------When to use throw and when to use try catch---------------
//ANSWER👇

//THROW:TO THROW EXCEPTION
//THROWS: USED TO HANDLE CHECKED EXCEPTION, WHEN WE ARE TESTING CODE AND TELLING COMPILER TO ATLEAST RUN THE
//CODE FOR TESTING IN RUNTIME

public class SampleProgramUnit03 {

  public static void main(String[] args) {
    int a = 100;
    int b = 0;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of b: ");
    int b = sc.nextInt();

    try {
      if (b == 5) {
        throw new UserManualException();
      }
    } catch (UserManualException e) {
      System.out.println(e.getMessage());
    }

    c = a / b; //Don't run when b is 5
    System.out.println("c: " + c);
  }
}
