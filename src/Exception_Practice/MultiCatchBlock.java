package Exception_Practice;

public class MultiCatchBlock {
    /* if you have to perform different tasks at the occurrence of different exceptions,
 use java multi-catch block. */
    public static void main(String[] args) {
        try {
            methodMultiIssues();
        } catch (ArithmeticException ae) {
            System.out.println("print this when arithmetic exception occurs");

        }
        catch(IndexOutOfBoundsException ie){
            System.out.println("print this when index out of bound exception occurs");
        }
        catch(Exception e){
            System.out.println("print this in any other type of exception");
            e.getStackTrace();
        }
        System.out.println("end here");
    }

    public static void methodMultiIssues(){
        int [] a= new int[6];
        a[6]= 10/0;
        //ArrayIndexOutOfBounds Exception
        System.out.println(a[6]);
    }
}
    /*Try block contains two exceptions. But at a time only one exception occurs
            and its corresponding catch block is executed.
            */