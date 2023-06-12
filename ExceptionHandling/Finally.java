package ExceptionHandling;

public class Finally {
    public static void main(String[] args) {
        int a=12, b=0;
        while(true){
            try{
                System.out.println(a/b);
            }catch(Exception e){
                System.out.println(e);
                break;
            }finally{
                System.out.println("I am finally for value of b: "+b);
            }
        }
        }
    }
}
