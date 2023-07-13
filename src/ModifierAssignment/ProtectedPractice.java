package ModifierAssignment;

public class ProtectedPractice {

    protected int employee_serialNumber = 12;
    protected String employee_companyName = "kumar";
    protected String employee_address = "A";

    protected void getEmployee_serialNumber() {
        System.out.println(employee_serialNumber);

    }

    protected void getEmployeeName() {
        System.out.println(employee_companyName);
    }

    public static void main(String[] args) {
        ProtectedPractice practice= new ProtectedPractice();


    }
}
