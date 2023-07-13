package Exception_Practice;

public class ArithmeticExcep extends Throwable {
    int a = 10;
    int b=0;
    public void throwExcep(){
        System.out.println(a/b);
    }// Method will be thrrowing exception

    public static void main(String[] args) {
        ArithmeticExcep excep= new ArithmeticExcep();
        excep.throwExcep();
    }
}
