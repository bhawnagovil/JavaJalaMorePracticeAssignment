package Exception_Practice;
/* 1. Write a program to generate Arithmetic Exception without exception handling
        * 2. Handle the Arithmetic exception using try-catch block
        *  ArithmeticException is thrown when an exceptional condition has occurred in an arithmetic operation.
        * /*
        ArrayIndexOutOfBoundsException :
         It is thrown to indicate that an array has been accessed with an illegal index.
         The index is either negative or greater than or equal to the size of the array.
         */

// ArithmeticException is thrown when an exceptional condition has occurred in an arithmetic operation.
public class ArrayExcep {
    int[] arr = new int[5];
    int[] arr1 = new int[5];

    public void indexOutBoundException() {
        System.out.println(arr[6]);
    }
    public void  indexOutBoundExceptionMore(){
        String[] arr= {"ram","shyam","govil","pinki"};
        System.out.println(arr[4]);
    }

    public static void main(String[] args) {
        ArrayExcep a = new ArrayExcep();
        try {
            a.indexOutBoundException();
        } catch (IndexOutOfBoundsException ee) {
            System.out.println("catching index out of bound exception");
        }
        try{
            a.indexOutBoundExceptionMore();
        }
        catch (IndexOutOfBoundsException ea) {
            System.out.println("catching index out of bound exception in String");
        }
        try{
            int myInt= Integer.parseInt("pants");

        }
        catch(NumberFormatException nfe){
            System.out.println("catch the exception if you can not parse it");

            try{
               String fakestring = null;
                System.out.println(fakestring.length());

            }
            catch(NullPointerException npe){
                System.out.println("String can not be null");

            }
            try{
                int number= 10;
                System.out.println(a);
            }
            catch(NumberFormatException j){
                System.out.println("throw this if found exception");
            }
            finally{
                System.out.println("in the finally block");
            }

        }
    }
}

