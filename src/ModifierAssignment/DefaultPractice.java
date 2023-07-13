package ModifierAssignment;

public class DefaultPractice {
     int employee_token= 12;// if does not have any access modifier, it is default in method and as well as fields
     String employee_assistant= "kumar";
     String employee_vard= "A";


      void getEmployeeToken(){
        System.out.println(employee_token);

    }

     void getEmployeeAssistantName(){
        System.out.println(employee_assistant);
    }

    public static void main(String[] args) {
        DefaultPractice practice= new DefaultPractice();
        System.out.println(practice.employee_token);
        System.out.println(practice.employee_assistant);
        practice.getEmployeeToken();
        practice.getEmployeeAssistantName();

    }
}
