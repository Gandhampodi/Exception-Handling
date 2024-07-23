package ExceptionHandling;

public class Program6 {
    public static void main(String[] args) {
        System.out.println("Exception start");
        int a=5;
        int b=0;
        int c=0;
        try{

            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            e.printStackTrace();
        }
        finally{
            System.out.println("Finally");
        }
        System.out.println("output "+c);
        System.out.println("Exception end");
    }

}
