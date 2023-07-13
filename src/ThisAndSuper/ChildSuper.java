package ThisAndSuper;

public class ChildSuper extends SuperClass{

    String name= "Balu";
    public ChildSuper(){
        super();// calling the parent class constructor
        System.out.println("I am child constructor");

    }

    void myMethodchild(){
        System.out.println("My name is "+ super.name);

        System.out.println("My name is "+ this.name);

    }

    public static void main(String[] args) {
        ChildSuper child= new ChildSuper();
        child.myMethodchild();
    }

}
