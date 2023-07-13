package InterfaceAndAbstactPractice;

public interface PublicInterface {
    //all the fields are public, static and final by default
    int num = 111; //values assigned

    public void myMethod();
    //Implemented interface to a class
    class Jala_08 implements PublicInterface {
        @Override
        public void myMethod() {
            System.out.println("This is a method");
        }

        //main method
        public static void main(String[] args) {
            Jala_08 j = new Jala_08();
            //printing the values of the interface fields
            System.out.println(num);
            //calling the interface methods
            j.myMethod();
        }
    }
}

