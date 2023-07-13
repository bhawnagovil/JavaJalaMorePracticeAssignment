package Exception_Practice;

public class InvalidExamException extends Exception {
    InvalidExamException(String msg) {
        System.out.println(msg);
    }
}
