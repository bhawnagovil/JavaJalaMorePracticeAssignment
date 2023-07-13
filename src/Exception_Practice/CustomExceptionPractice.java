package Exception_Practice;

public class CustomExceptionPractice {

    public static void main(String[] args) throws AgeLessRhan0Exception {
        validateAge(3);
        validateAge(-1);

    }

    public static void validateAge(int age) throws AgeLessRhan0Exception {

        if(age<0){
            throw  new AgeLessRhan0Exception("Age can not be negative");

        }
    }
}
