public class Stringj {
    public static void main(String[] args) {
        boolean a = armstrong(153);
        System.out.println(a);
    }

    public static boolean armstrong(int num) {
        int sum = 0;
        int n = num;
        while (n > 0) {
            int rem=n%10;
            sum = sum+(rem*rem*rem);
            n = n / 10;
        }
        if (sum == num) {
            return true;
        }
        else{
            return false;
        }
    }
}
