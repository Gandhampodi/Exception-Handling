package ExceptionHandling;

public class Program3 {
    public static void main(String[] args) {
        System.out.println("Exception start");
        int a=12;
        int b=0;
        int c=0;
        c=a/b;
        try{

            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            throw e;
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("output is"+c);
        System.out.println("Exception end");
    }
}
