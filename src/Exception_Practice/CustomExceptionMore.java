package Exception_Practice;

public class CustomExceptionMore {

    //creating a method which receives integer as parameter
    static void exam(int marks) throws InvalidExamException {
        // throws exception if marks are less than 40
        if (marks < 40) {
            //InvalidExamException is our own custom exception
            throw new InvalidExamException("Failed in exam");
        } else {
            System.out.println("Passed in exam");
        }
    }

    public static void main(String[] args) {
        try {
            //passing marks to the method
            exam(39);
        } catch (Exception i) {
            /* printStackTrace() prints the throwable Exception object as well as with other Information
            like the line number where Exception occurs and class name where the exception occurred.*/
            i.printStackTrace();
        }
    }
}

