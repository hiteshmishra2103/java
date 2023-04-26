public class Stringj {
    public static void main(String[] args) {
        boolean a = armstrong(153);
        System.out.println(a);
    }

    public static boolean armstrong(int num) {
        int sum = 0;
        int n = num;

        String str="hello";
        String st="hello";
        if(str==st){
            System.out.println(true);
            System.out.println(str.equals(st));
        }else{
            System.out.println(false);
        }
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
