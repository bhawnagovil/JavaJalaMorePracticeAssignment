package MoiferPracticeAnotherPackage;

import ModifierAssignment.ProtectedPractice ;
import ModifierAssignment.PubLicAccessModifierPractice;

public class ProtectedAssignementPractice extends ProtectedPractice {
   // ProtectedPractice practice= new ProtectedPractice();
   // practice., can not access the field and method of the Protectedpractice class since, the field are protected and trying to access outside the package.
   public static void main(String[] args) {
       ProtectedAssignementPractice obj= new ProtectedAssignementPractice();
       PubLicAccessModifierPractice obj1= new PubLicAccessModifierPractice();
       System.out.println(obj1.employee_id);//public method and field  can be accessed anywhere
       System.out.println(obj.employee_address); // after extending the class we are able to access the method and field of parent class in other package of protected
       System.out.println(obj.employee_address);
       System.out.println(obj.employee_companyName);
       System.out.println(obj.employee_serialNumber);
       obj.getEmployee_serialNumber();




   }

}
