package ModifierAssignment;

public class PubLicAccessModifierPractice {
    public int employee_id= 12;
    public String employee_name= "kumar";
    public String employee_section= "A";


    public  void getEmployeeId(){
        System.out.println(employee_id);

    }

    public void getEmployeeName(){
        System.out.println(employee_name);
    }

    public static void main(String[] args) {
        PubLicAccessModifierPractice practice= new PubLicAccessModifierPractice();

    }

}
