package Exception_Practice;

public class ExcepDemo extends Throwable {
    public static void main(String[] args) {


        int a = 7;
        int b = 0;
        int[] arr= new int[5];

        try {
            int k = a/b;// program will generate Arithmetic exception
            System.out.println(k);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching the arithmetic exception");

        }
        catch(IndexOutOfBoundsException ee){
            System.out.println("catching index out of bound exception");
        }

        catch(Exception ea){
            System.out.println("I catch all type of exception");
        }
        finally{
            System.out.println("delete cookies even script fails ");
        }


    }
}
