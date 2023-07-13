package InterfaceAndAbstactPractice;

public class InheritedInterface implements Interface2{

    @Override
    public void MethodTwo() {
        System.out.println("this is the first method");
    }

    @Override
    public void methodOne() {
        System.out.println("this is the method 2");
    }

    public static void main(String[] args) {
        InheritedInterface if7 = new InheritedInterface();
        if7.methodOne();
        if7.MethodTwo();
    }
}
