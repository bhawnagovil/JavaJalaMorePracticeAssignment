package Exception_Practice;
/* We can throw either checked or unchecked exceptions in Java by throw keyword.
It is mainly used to throw a custom exception. */
public class MethodThrowexcep {
    static void throwException() {
        //throw keyword is used to invoke an exception explicitly.
        throw new RuntimeException("Throwing exception");
    }

    public static void main(String[] args) {
        //Calling method in main class without try block
        throwException();
    }
}

