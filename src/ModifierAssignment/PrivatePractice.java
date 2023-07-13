package ModifierAssignment;

public class PrivatePractice {
    private int employee_id= 12;
    private String employee_name= "kumar";
    private String employee_section= "A";


    private  void getEmployeeId(){
        System.out.println(employee_id);

    }

    private void getEmployeeName(){
        System.out.println(employee_name);
    }

    public static void main(String[] args) {
        PrivatePractice practice1= new PrivatePractice();
        DefaultPractice practice3= new DefaultPractice();
        System.out.println(practice3.employee_token);
        // accessing default field of the default class, can be accessed within the pavjkage
        System.out.println(practice1.employee_id);
        System.out.println(practice1.employee_name);
        practice1.getEmployeeId();
        practice1.getEmployeeName();



    }

}
